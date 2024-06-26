/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controller.HoiVienController;
import DAO.HoiVienDAO;
import Model.HoiVienModel;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class VIPin4View extends javax.swing.JPanel {

    private HoiVienController controller;
    public VIPin4View(HoiVienModel hv, HoiVienController controller) {
        this.controller = controller;
        initComponents();
        
        HoiVienController control = new HoiVienController(jbtLuu,jbtXoa,jtfMaHV,jtfTenHV);
        control.setView(hv);

        jtfMaHV.setText(hv.getMaHV());
        jtfTenHV.setText(hv.getTenHV());
        jtfSdt.setText(hv.getSdt());
        jDateChooser1.setDate(java.sql.Date.valueOf(hv.getNgaydky())); 
        jtfTongdiem.setText(String.valueOf(hv.getTongdiem()));
        jtfTonggiochoi.setText(String.valueOf(hv.getTonggiochoi()));
        jtfHang.setText(hv.getHang()); 

        jbtLuu.addActionListener(e -> {
            // Lấy thông tin hội viên đã chỉnh sửa
            String maHV = jtfMaHV.getText();
            String tenHV = jtfTenHV.getText();
            String sdt = jtfSdt.getText();
            LocalDate ngayDK = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double tongDiem = Double.parseDouble(jtfTongdiem.getText());
            double tongGioChoi = Double.parseDouble(jtfTonggiochoi.getText());
            String hang = jtfHang.getText();

            // Kiểm tra tính hợp lệ của dữ liệu

            // Tạo đối tượng HoiVienModel mới
            HoiVienModel hvCapNhat = new HoiVienModel(maHV, tenHV, sdt, ngayDK, tongDiem, tongGioChoi, hang);

            // Gọi phương thức updateHoiVien trong HoiVienDAO
            int ketQua = HoiVienDAO.updateHoiVien(hvCapNhat);
            if (ketQua == 1) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin hội viên thành công!");
                // Tải lại dữ liệu trên bảng VipView
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin hội viên thất bại. Vui lòng kiểm tra lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        });

        jbtXoa.addActionListener(e -> {
            // Lấy mã hội viên
            String maHV = jtfMaHV.getText();

            // Xác nhận xóa
            int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa hội viên này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

            if (luaChon == JOptionPane.YES_OPTION) {
                int ketQua = HoiVienDAO.deleteHoiVien(maHV);
                if (ketQua == 1) {
                    JOptionPane.showMessageDialog(this, "Xóa hội viên thành công!");
                    SwingUtilities.getWindowAncestor(this).dispose();
                    // Tải lại dữ liệu trên bảng VipView
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa hội viên thất bại. Vui lòng kiểm tra lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // ... (Các phương thức và khai báo khác tương tự như StaffinforView)


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfMaHV = new javax.swing.JTextField();
        jtfTenHV = new javax.swing.JTextField();
        jtfSdt = new javax.swing.JTextField();
        jtfTonggiochoi = new javax.swing.JTextField();
        jtfTongdiem = new javax.swing.JTextField();
        jtfHang = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jbtLuu = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();

        setBackground(new java.awt.Color(218, 200, 242));
        setPreferredSize(new java.awt.Dimension(772, 612));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hội viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 20))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(527, 600));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Mã hội viên:");
        jLabel1.setMaximumSize(new java.awt.Dimension(99, 17));
        jLabel1.setMinimumSize(new java.awt.Dimension(99, 17));
        jLabel1.setPreferredSize(new java.awt.Dimension(99, 17));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Họ và tên:");
        jLabel2.setMaximumSize(new java.awt.Dimension(99, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(99, 17));
        jLabel2.setPreferredSize(new java.awt.Dimension(99, 17));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Ngày đăng ký:");
        jLabel3.setMaximumSize(new java.awt.Dimension(99, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(99, 17));
        jLabel3.setPreferredSize(new java.awt.Dimension(99, 17));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Số điện thoại:");
        jLabel4.setMaximumSize(new java.awt.Dimension(99, 17));
        jLabel4.setMinimumSize(new java.awt.Dimension(99, 17));
        jLabel4.setPreferredSize(new java.awt.Dimension(99, 17));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tổng điểm:");
        jLabel5.setMaximumSize(new java.awt.Dimension(99, 17));
        jLabel5.setMinimumSize(new java.awt.Dimension(99, 17));
        jLabel5.setPreferredSize(new java.awt.Dimension(99, 17));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Tổng giờ chơi:");
        jLabel6.setMaximumSize(new java.awt.Dimension(99, 17));
        jLabel6.setMinimumSize(new java.awt.Dimension(99, 17));
        jLabel6.setPreferredSize(new java.awt.Dimension(99, 17));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Hạng:");
        jLabel7.setMaximumSize(new java.awt.Dimension(99, 17));
        jLabel7.setMinimumSize(new java.awt.Dimension(99, 17));
        jLabel7.setPreferredSize(new java.awt.Dimension(99, 17));

        jtfMaHV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfMaHV.setText("jTextField1");
        jtfMaHV.setCaretPosition(0);
        jtfMaHV.setPreferredSize(new java.awt.Dimension(64, 23));

        jtfTenHV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfTenHV.setText("jTextField1");
        jtfTenHV.setCaretPosition(0);
        jtfTenHV.setPreferredSize(new java.awt.Dimension(64, 23));

        jtfSdt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSdt.setText("jTextField1");
        jtfSdt.setCaretPosition(0);
        jtfSdt.setPreferredSize(new java.awt.Dimension(64, 23));

        jtfTonggiochoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfTonggiochoi.setText("jTextField1");
        jtfTonggiochoi.setCaretPosition(0);
        jtfTonggiochoi.setPreferredSize(new java.awt.Dimension(64, 23));
        jtfTonggiochoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTonggiochoiActionPerformed(evt);
            }
        });

        jtfTongdiem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfTongdiem.setText("jTextField1");
        jtfTongdiem.setCaretPosition(0);
        jtfTongdiem.setPreferredSize(new java.awt.Dimension(64, 23));
        jtfTongdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTongdiemActionPerformed(evt);
            }
        });

        jtfHang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfHang.setText("jTextField1");
        jtfHang.setCaretPosition(0);
        jtfHang.setPreferredSize(new java.awt.Dimension(64, 23));
        jtfHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHangActionPerformed(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jbtLuu.setBackground(new java.awt.Color(99, 59, 178));
        jbtLuu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtLuu.setForeground(new java.awt.Color(255, 255, 255));
        jbtLuu.setText("Lưu");

        jbtXoa.setBackground(new java.awt.Color(99, 59, 178));
        jbtXoa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtXoa.setForeground(new java.awt.Color(255, 255, 255));
        jbtXoa.setText("Xóa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfHang, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfMaHV, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfTenHV, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfTongdiem, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfTonggiochoi, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jbtLuu)
                        .addGap(126, 126, 126)
                        .addComponent(jbtXoa)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMaHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTenHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTongdiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTonggiochoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLuu)
                    .addComponent(jbtXoa))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTonggiochoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTonggiochoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTonggiochoiActionPerformed

    private void jtfTongdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTongdiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTongdiemActionPerformed

    private void jtfHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtLuu;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JTextField jtfHang;
    private javax.swing.JTextField jtfMaHV;
    private javax.swing.JTextField jtfSdt;
    private javax.swing.JTextField jtfTenHV;
    private javax.swing.JTextField jtfTongdiem;
    private javax.swing.JTextField jtfTonggiochoi;
    // End of variables declaration//GEN-END:variables
}
