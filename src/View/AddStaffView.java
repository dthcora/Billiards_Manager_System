
package View;


// Import necessary packages
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class AddStaffView extends JFrame {
    private JTextField tfMaNhanVien, tfHoTen, tfSoDienThoai, tfDiaChi, tfChucVu, tfMucLuong;

    public AddStaffView() {
        setTitle("Thêm Nhân Viên");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    }

    private void addLabelAndField(JPanel panel, GridBagConstraints gbc, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        label.setForeground(Color.BLACK); // Giữ màu chữ của label là đen
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(label, gbc);

        gbc.gridx = 1;
        panel.add(textField, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddStaffView().setVisible(true));
    }
}