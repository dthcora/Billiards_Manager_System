package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class AddVIPView extends JFrame {
    private JTextField tfMaHoiVien, tfHoTen, tfSoDienThoai, tfNgayDangKi;

    public AddVIPView() {
        setTitle("Thêm Hội Viên");
        
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Tạo panel chính
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(218, 200, 242));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Tạo panel con để chứa các trường thông tin và tiêu đề
        JPanel contentPanel = new JPanel(new GridBagLayout());
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(new LineBorder(new Color(218, 200, 242), 2));

        // Tiêu đề
        JLabel lblTitle = new JLabel("NHẬP THÔNG TIN HỘI VIÊN");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(new Color(0x633BB2));
        lblTitle.setOpaque(true);
        lblTitle.setBorder(new LineBorder(new Color(0x633BB2), 2));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        contentPanel.add(lblTitle, gbc);

        // Các trường thông tin
        gbc.gridwidth = 1;
        addLabelAndField(contentPanel, gbc, "Mã Hội Viên:", tfMaHoiVien = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Họ và Tên:", tfHoTen = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Số điện thoại:", tfSoDienThoai = new JTextField(20));
        addLabelAndField(contentPanel, gbc, "Ngày đăng ký:", tfNgayDangKi = new JTextField(20));

        // Nút Thêm
        JButton btnThem = new JButton("Thêm");
        btnThem.setForeground(Color.WHITE);
        btnThem.setBackground(new Color(0x633BB2));
        btnThem.setOpaque(true);
        btnThem.setBorder(new LineBorder(new Color(0x633BB2), 2));
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
        label.setForeground(Color.BLACK);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(label, gbc);

        gbc.gridx = 1;
        panel.add(textField, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddVIPView().setVisible(true));
    }
}