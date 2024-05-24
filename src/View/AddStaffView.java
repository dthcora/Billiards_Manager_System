
package View;
 
import Controller.NhanVienController;
import Model.NhanVienModel;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;

public class AddStaffView extends JFrame {
    private JTextField tfMaNhanVien, tfHoTen, tfSoDienThoai, tfDiaChi, tfChucVu, tfMucLuong;
    private JDateChooser dcNgayVaoLam;
    private JButton btnThem;
    private NhanVienController controller;
    //private ActionListener themActionListener;
    
    
        public AddStaffView(NhanVienController controller){
        this.controller = controller;
        tfMaNhanVien = new JTextField(20);
        tfHoTen = new JTextField(20);
        tfSoDienThoai = new JTextField(20);
        tfDiaChi = new JTextField(20);
        tfChucVu = new JTextField(20);
        tfMucLuong = new JTextField(20);
        dcNgayVaoLam = new JDateChooser();
        btnThem = new JButton("Thêm");
    
        btnThem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                NhanVienModel nhanVienMoi = thuThapDuLieu();
                if (nhanVienMoi != null) {
                    controller.themNhanVienMoi(nhanVienMoi);
                    dispose();
                } else {
                    // Hiển thị thông báo lỗi từ controller
                    JOptionPane.showMessageDialog(null, "Lỗi khi thêm nhân viên. Vui lòng kiểm tra lại dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
      
        
    private NhanVienModel thuThapDuLieu() {
        String maNV = tfMaNhanVien.getText();
        String tenNV = tfHoTen.getText();
        String sdt = tfSoDienThoai.getText();
        String diachi = tfDiaChi.getText();
        String chucvu = tfChucVu.getText();
        double hsluong;
            try {
        hsluong = Double.parseDouble(tfMucLuong.getText());
    } catch (NumberFormatException ex) {
        return null;
    }

        // Lấy ngày tháng từ JDateChooser
        LocalDate ngayVL = dcNgayVaoLam.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Tạo đối tượng NhanVienModel
        return new NhanVienModel(maNV, tenNV, sdt, ngayVL, diachi, chucvu, hsluong, 0.0); // Giả sử giờ làm ban đầu là 0
   
        }

    
    public AddStaffView() {
        setTitle("Thêm Nhân Viên");
        
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Tạo panel chính
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(218, 200, 242)); // Thiết lập màu nền chính
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Tạo panel con để chứa các trường thông tin và tiêu đề
        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(Color.WHITE); // Thiết lập màu nền trắng cho panel con
        contentPanel.setBorder(new LineBorder(new Color(218, 200, 242), 2)); // Thêm đường viền

        // Tiêu đề
        JLabel lblTitle = new JLabel("NHẬP THÔNG TIN NHÂN VIÊN");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setForeground(Color.WHITE); // Đặt màu chữ tiêu đề là trắng
        lblTitle.setBackground(new Color(0x633BB2)); // Đặt màu nền tiêu đề là mã màu 633BB2
        lblTitle.setOpaque(true); // Hiển thị màu nền của tiêu đề
        lblTitle.setBorder(new LineBorder(new Color(0x633BB2), 2)); // Thêm đường viền với mã màu 633BB2
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        contentPanel.add(lblTitle, gbc);

        // Các trường thông tin
        gbc.gridwidth = 1;
        addLabelAndField(contentPanel, gbc, "Mã Nhân Viên:", tfMaNhanVien = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Họ và Tên:", tfHoTen = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Số điện thoại:", tfSoDienThoai = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Địa chỉ:", tfDiaChi = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Chức vụ:", tfChucVu = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Mức lương:", tfMucLuong = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Ngày vào làm:", dcNgayVaoLam = new JDateChooser());

        // Nút Thêm
        JButton btnThem = new JButton("Thêm");
        btnThem.setForeground(Color.WHITE); // Đặt màu chữ nút Thêm là trắng
        btnThem.setBackground(new Color(0x633BB2)); // Đặt màu nền nút Thêm là mã màu 633BB2
        btnThem.setOpaque(true); // Hiển thị màu nền của nút Thêm
        btnThem.setBorder(new LineBorder(new Color(0x633BB2), 2)); // Thêm đường viền với mã màu 633BB2
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        contentPanel.add(btnThem, gbc);

        // Thêm panel con vào panel chính
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        mainPanel.add(contentPanel, gbc);

        add(mainPanel, BorderLayout.CENTER);
        
        pack();
        setVisible(true);
    }
        
private void addLabelAndField(JPanel panel, GridBagConstraints gbc, String labelText, Component component) {
    JLabel label = new JLabel(labelText);
    label.setForeground(Color.BLACK);
    gbc.gridx = 0;
    gbc.gridy++;
    panel.add(label, gbc);

    gbc.gridx = 1;
    panel.add(component, gbc);
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddStaffView().setVisible(true));
    }
}