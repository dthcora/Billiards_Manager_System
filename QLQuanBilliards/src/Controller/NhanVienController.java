package Controller;

import DAO.NhanVienDAO;
import Model.ClassTableModel;
import Model.NhanVienModel;
import View.StaffinforView;
import View.AddStaffView;
import View.StaffView;
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

public class NhanVienController {
private JPanel jpnView;
private JButton jbtAdd;
public void addButtonListener() {
    jbtAdd.addActionListener(e -> {
        AddStaffView addStaffView = new AddStaffView();
        addStaffView.setVisible(true);
        addStaffView.setLocationRelativeTo(null);
    });
}

        public void themNhanVienMoi(NhanVienModel nhanVienMoi) {
        // Kiểm tra xem mã nhân viên đã tồn tại chưa
        if (NhanVienDAO.getList().stream().anyMatch(nv -> nv.getMaNV().equals(nhanVienMoi.getMaNV()))) {
            System.out.println("Mã nhân viên đã tồn tại!");
            return; // Dừng việc thêm nhân viên mới
        }
        int ketQua = NhanVienDAO.insertNhanVien(nhanVienMoi);
    if (ketQua == 1) {
        System.out.println("Thêm nhân viên thành công");
        setDatetoTable(); // Gọi lại setDatetoTable() để cập nhật giao diện
        JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    } else {
        System.out.println("Thêm nhân viên thất bại");
        JOptionPane.showMessageDialog(null, "Thêm nhân viên thất bại! Vui lòng kiểm tra lại dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }
    
private JTextField jtfSearch;
private JButton jbtLuu;
private JButton jbtXoa;
private JTextField jtfMaNV;
private JTextField jtfTenNV;

private String[] listColumn = {"Mã Nhân Viên","Họ và Tên","Số điện thoại","Ngày vào làm","Địa chỉ","Chức vụ","Hệ số lương","Tổng giờ làm"};

private TableRowSorter<TableModel> rowSorter = null;



public NhanVienController(JPanel jpnView, JButton jbtAdd, JTextField jtfSearch) {
    this.jpnView = jpnView;
    this.jbtAdd = jbtAdd;
    addButtonListener();
    this.jtfSearch = jtfSearch;
    
}

public NhanVienController(JButton jbtLuu, JButton jbtXoa, JTextField jtfMaNV, JTextField jtfTenNV) {
    this.jbtLuu = jbtLuu;
    this.jbtXoa = jbtXoa;
    this.jtfMaNV = jtfMaNV;
    this.jtfTenNV = jtfTenNV;
}



public void setDatetoTable(){
    
    List<NhanVienModel> listItem = NhanVienModel.getAllNhanVien();
   
    DefaultTableModel model = new ClassTableModel().setTableNhanVien(listItem, listColumn);
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
            e.consume(); // Prevent multiple double-click events
            int row = table.getSelectedRow();
            if (row >= 0) {
                String maNV = (String) table.getValueAt(row, 0); // Get MaNV

                NhanVienModel nv = NhanVienDAO.getList().stream()
                    .filter(nhanVien -> nhanVien.getMaNV().equals(maNV))
                    .findFirst()
                    .orElse(null);

 if (nv != null) {
            JFrame staffinforViewFrame = new JFrame("Thông tin nhân viên");
            staffinforViewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            staffinforViewFrame.getContentPane().add(new StaffinforView(nv, NhanVienController.this));
            staffinforViewFrame.pack();
            staffinforViewFrame.setLocationRelativeTo(null);
            staffinforViewFrame.setVisible(true);
        } else {
                    System.out.println("Không tìm thấy thông tin nhân viên.");
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

public void setView(NhanVienModel nv) {
    jtfMaNV.setText(nv.getMaNV());
    jtfTenNV.setText(nv.getTenNV());
}
    
}