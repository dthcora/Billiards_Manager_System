package Controller;

import DAO.HoiVienDAO;
import Model.ClassTableModel;
import Model.HoiVienModel;
import View.VIPin4View;
import View.AddVIPView;
import View.VIPView;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class HoiVienController {
    private JPanel jpnView;
    private JButton jbtAdd;
    public void addButtonListener() {
        jbtAdd.addActionListener(e -> {
            AddVIPView addVIPView = new AddVIPView();
            addVIPView.setVisible(true);
            addVIPView.setLocationRelativeTo(null);
        });
    }
    
    public void themHoiVienMoi(HoiVienModel hoiVienMoi) {
        if (HoiVienDAO.getList().stream().anyMatch(hv -> hv.getMaHV().equals(hoiVienMoi.getMaHV()))) {
            System.out.println("Mã hội viên đã tồn tại!");
            return;
        }
        int ketQua = HoiVienDAO.insertHoiVien(hoiVienMoi);
        if (ketQua == 1) {
            System.out.println("Thêm hội viên thành công");
            setDatetoTable();
            JOptionPane.showMessageDialog(null, "Thêm hội viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Thêm hội viên thất bại");
            JOptionPane.showMessageDialog(null, "Thêm hội viên thất bại! Vui lòng kiểm tra lại dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private JTextField jtfSearch;
    private JButton jbtLuu;
    private JButton jbtXoa;
    private JTextField jtfMaHV;
    private JTextField jtfTenHV;

    private String[] listColumn = {"Mã Hội Viên", "Họ và Tên", "Số điện thoại", "Ngày đăng ký", "Tổng điểm", "Tổng giờ chơi", "Hạng"};
    private TableRowSorter<TableModel> rowSorter = null;

    public HoiVienController(JPanel jpnView, JButton jbtAdd, JTextField jtfSearch) {
    this.jpnView = jpnView;
    this.jbtAdd = jbtAdd;
    addButtonListener();
    this.jtfSearch = jtfSearch;
    
}

public HoiVienController(JButton jbtLuu, JButton jbtXoa, JTextField jtfMaNV, JTextField jtfTenNV) {
    this.jbtLuu = jbtLuu;
    this.jbtXoa = jbtXoa;
    this.jtfMaHV = jtfMaNV;
    this.jtfTenHV = jtfTenNV;
}

    public void setDatetoTable(){
        List<HoiVienModel> listItem = HoiVienModel.getAllHoiVien(); 
        
        DefaultTableModel model = new ClassTableModel().setTableHoiVien(listItem, listColumn);
        JTable table = new JTable(model);
        
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

          jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            String text = jtfSearch.getText();
            if(text.trim().length() == 0){
                rowSorter.setRowFilter(null);
            }else{
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = jtfSearch.getText();
            if(text.trim().length() == 0){
                rowSorter.setRowFilter(null);
            }else{
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        
        }
        
    });
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && !e.isConsumed()) {
                    e.consume();
                    int row = table.getSelectedRow();
                    if (row >= 0) {
                        String maHV = (String) table.getValueAt(row, 0); // Lấy MaHV

                        HoiVienModel hv = HoiVienDAO.getList().stream()
                            .filter(hoiVien -> hoiVien.getMaHV().equals(maHV))
                            .findFirst()
                            .orElse(null);

                        if (hv != null) {
                            JFrame vipin4ViewFrame = new JFrame("Thông tin hội viên");
                            vipin4ViewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            vipin4ViewFrame.getContentPane().add(new VIPin4View(hv, HoiVienController.this));
                            vipin4ViewFrame.pack();
                            vipin4ViewFrame.setLocationRelativeTo(null);
                            vipin4ViewFrame.setVisible(true);
                        } else {
                            System.out.println("Không tìm thấy thông tin hội viên.");
                        }
                    }
                }
            }
        });

    
    table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
    table.getTableHeader().setPreferredSize(new Dimension(100,50));
    table.setRowHeight(50);
    table.validate();
    table.repaint();
    
    JScrollPane scrollpane = new JScrollPane();
    scrollpane.getViewport().add(table);
    scrollpane.setPreferredSize(new Dimension(1300,400));
    
    jpnView.removeAll();
    jpnView.setLayout(new BorderLayout());
    jpnView.add(scrollpane, BorderLayout.CENTER);
    jpnView.validate();
    jpnView.repaint();
    
    }

    public void setView(HoiVienModel hv) {
        jtfMaHV.setText(hv.getMaHV());
        jtfTenHV.setText(hv.getTenHV());
    }
}
