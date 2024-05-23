
package View;

import controller.HoaDonController;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class CTHDView extends JDialog {
    
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JPanel jPanel1;
    public JLabel jlbBan;
    public JLabel jlbGiam;
    public JLabel jlbHv;
    public JLabel jlbMahd;
    public JLabel jlbNgay;
    public JLabel jlbRa;
    public JLabel jlbTamtinh;
    public JLabel jlbTien;
    public JLabel jlbVao;
    public JScrollPane jspMenu;
    public JTable jtbMenu; 
    
    public CTHDView(){
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jlbTien = new JLabel();
        jlbMahd = new JLabel();
        jlbNgay = new JLabel();
        jlbVao = new JLabel();
        jlbRa = new JLabel();
        jlbBan = new JLabel();
        jlbHv = new JLabel();
        jlbTamtinh = new JLabel();
        jlbGiam = new JLabel();
        jspMenu = new JScrollPane();
        jtbMenu = new JTable();
    

        this.setSize(520,550);
        this.setTitle("CHI TIẾT HÓA ĐƠN");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(Color.WHITE);
        jPanel1.setLayout(new AbsoluteLayout());

        jLabel1.setFont(new Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Chi Tiết Hóa Đơn");
        jPanel1.add(jLabel1, new AbsoluteConstraints(62, 30, 383, 42));

        jLabel2.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(Color.BLACK);
        jLabel2.setText("Mã hóa đơn:");
        jPanel1.add(jLabel2, new AbsoluteConstraints(40, 78, -1, -1));

        jLabel3.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(Color.BLACK);
        jLabel3.setText("Ngày:");
        jPanel1.add(jLabel3, new AbsoluteConstraints(40, 113, -1, -1));

        jLabel4.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(Color.BLACK);
        jLabel4.setText("Giờ vào:");
        jPanel1.add(jLabel4, new AbsoluteConstraints(40, 148, -1, -1));

        jLabel5.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(Color.BLACK);
        jLabel5.setText("Giờ ra:");
        jPanel1.add(jLabel5, new AbsoluteConstraints(242, 148, -1, -1));

        jLabel6.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(Color.BLACK);
        jLabel6.setText("Mã bàn:");
        jPanel1.add(jLabel6, new AbsoluteConstraints(40, 183, -1, -1));

        jLabel7.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(Color.BLACK);
        jLabel7.setText("Mã hội viên:");
        jPanel1.add(jLabel7, new AbsoluteConstraints(242, 183, -1, -1));

        jLabel8.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(Color.BLACK);
        jLabel8.setText("Tạm tính:");
        jPanel1.add(jLabel8, new AbsoluteConstraints(40, 212, -1, -1));

        jLabel9.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(Color.BLACK);
        jLabel9.setText("Giảm giá:");
        jPanel1.add(jLabel9, new AbsoluteConstraints(40, 247, -1, -1));

        jLabel10.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(Color.BLACK);
        jLabel10.setText("Thành tiền:");
        jPanel1.add(jLabel10, new AbsoluteConstraints(40, 282, -1, -1));

        jlbMahd.setFont(new Font("Arial", 1, 14)); // NOI18N
        jlbMahd.setForeground(Color.BLACK);
        jPanel1.add(jlbMahd, new AbsoluteConstraints(137, 78, 140, 17));

        jlbNgay.setFont(new Font("Arial", 0, 14)); // NOI18N
        jlbNgay.setForeground(Color.BLACK);
        jPanel1.add(jlbNgay, new AbsoluteConstraints(90, 113, 142, 17));

        jlbVao.setFont(new Font("Arial", 0, 14)); // NOI18N
        jlbVao.setForeground(Color.BLACK);
        jPanel1.add(jlbVao, new AbsoluteConstraints(110, 148, 90, 17));

        jlbRa.setFont(new Font("Arial", 0, 14)); // NOI18N
        jlbRa.setForeground(Color.BLACK);
        jPanel1.add(jlbRa, new AbsoluteConstraints(300, 148, 90, 17));

        jlbBan.setFont(new Font("Arial", 0, 14)); // NOI18N
        jlbBan.setForeground(Color.BLACK);
        jPanel1.add(jlbBan, new AbsoluteConstraints(105, 183, 90, 17));

        jlbHv.setFont(new Font("Arial", 0, 14)); // NOI18N
        jlbHv.setForeground(Color.BLACK);
        jPanel1.add(jlbHv, new AbsoluteConstraints(335, 183, 150, 17));

        jlbTamtinh.setFont(new Font("Arial", 0, 14)); // NOI18N
        jlbTamtinh.setForeground(Color.BLACK);
        jPanel1.add(jlbTamtinh, new AbsoluteConstraints(115, 212, 117, 17));

        jlbGiam.setFont(new Font("Arial", 0, 14)); // NOI18N
        jlbGiam.setForeground(Color.BLACK);
        jPanel1.add(jlbGiam, new AbsoluteConstraints(115, 247, 117, 17));
        
        jlbTien.setFont(new Font("Arial", 0, 14)); // NOI18N
        jlbTien.setForeground(Color.BLACK);
        jPanel1.add(jlbTien, new AbsoluteConstraints(130, 282, 117, 17));

        jtbMenu.setModel(new DefaultTableModel(
            new Object[][] {},
            new String [] {
                "Tên", "SL", "Đơn giá", "Tổng"
            }
        ));
        jspMenu.setViewportView(jtbMenu);
        if (jtbMenu.getColumnModel().getColumnCount() > 0) {
            jtbMenu.getColumnModel().getColumn(0).setPreferredWidth(100);
            jtbMenu.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel1.add(jspMenu, new AbsoluteConstraints(40, 315, -1, 160));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        this.setVisible(true);
    }
    
}
