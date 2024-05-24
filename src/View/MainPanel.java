
package View;

import Controller.DatBanController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainPanel extends JPanel {
    private JLabel jLabel1;
    private JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public JButton jbtThanhtoan;
    public JButton jbtXoa;
    public JButton jbtXacnhan;
    public JLabel jlbBan;
    public JLabel jlbDongia;
    public JLabel jlbGiamgia;
    public JLabel jlbLib1off;
    public javax.swing.JLabel jlbLib1on;
    public javax.swing.JLabel jlbLib2off;
    public javax.swing.JLabel jlbLib2on;
    public javax.swing.JLabel jlbLib3off;
    public javax.swing.JLabel jlbLib3on;
    public javax.swing.JLabel jlbLib4off;
    public javax.swing.JLabel jlbLib4on;
    public javax.swing.JLabel jlbLib5off;
    public javax.swing.JLabel jlbLib5on;
    public javax.swing.JLabel jlbLib6off;
    public javax.swing.JLabel jlbLib6on;
    public javax.swing.JLabel jlbLib7off;
    public javax.swing.JLabel jlbLib7on;
    public javax.swing.JLabel jlbLib8off;
    public javax.swing.JLabel jlbLib8on;
    public javax.swing.JLabel jlbLib9off;
    public javax.swing.JLabel jlbLib9on;
    public javax.swing.JLabel jlbLogo;
    public javax.swing.JLabel jlbNgay;
    public javax.swing.JLabel jlbPool10off;
    public javax.swing.JLabel jlbPool10on;
    public javax.swing.JLabel jlbPool11off;
    public javax.swing.JLabel jlbPool11on;
    public javax.swing.JLabel jlbPool12off;
    public javax.swing.JLabel jlbPool12on;
    public javax.swing.JLabel jlbPool13off;
    public javax.swing.JLabel jlbPool13on;
    public javax.swing.JLabel jlbPool14off;
    public javax.swing.JLabel jlbPool14on;
    public javax.swing.JLabel jlbPool15off;
    public javax.swing.JLabel jlbPool15on;
    public javax.swing.JLabel jlbPool16off;
    public javax.swing.JLabel jlbPool16on;
    public javax.swing.JLabel jlbPool17off;
    public javax.swing.JLabel jlbPool17on;
    public javax.swing.JLabel jlbPool18off;
    public javax.swing.JLabel jlbPool18on;
    public javax.swing.JLabel jlbPool1off;
    public javax.swing.JLabel jlbPool1on;
    public javax.swing.JLabel jlbPool2off;
    public javax.swing.JLabel jlbPool2on;
    public javax.swing.JLabel jlbPool3off;
    public javax.swing.JLabel jlbPool3on;
    public javax.swing.JLabel jlbPool4off;
    public javax.swing.JLabel jlbPool4on;
    public javax.swing.JLabel jlbPool5off;
    public javax.swing.JLabel jlbPool5on;
    public javax.swing.JLabel jlbPool6off;
    public javax.swing.JLabel jlbPool6on;
    public javax.swing.JLabel jlbPool7off;
    public javax.swing.JLabel jlbPool7on;
    public javax.swing.JLabel jlbPool8off;
    public javax.swing.JLabel jlbPool8on;
    public javax.swing.JLabel jlbPool9off;
    public javax.swing.JLabel jlbPool9on;
    public JLabel jlbRa;
    public JLabel jlbTamtinh;
    public JLabel jlbThanhtien;
    public JLabel jlbVIP;
    public JLabel jlbVao;
    public JScrollPane jspBan;
    public JScrollPane jspMenu;
    public JTable jtbMenu;
    
    private final DatBanController control;
    private final MenuView menu;

    public MainPanel() {

        jspBan = new JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jlbPool1on = new JLabel();
        jlbPool2on = new javax.swing.JLabel();
        jlbPool3on = new javax.swing.JLabel();
        jlbPool4on = new javax.swing.JLabel();
        jlbPool5on = new javax.swing.JLabel();
        jlbPool6on = new javax.swing.JLabel();
        jlbLib7on = new javax.swing.JLabel();
        jlbLib8on = new javax.swing.JLabel();
        jlbLib9on = new javax.swing.JLabel();
        jlbPool7on = new javax.swing.JLabel();
        jlbPool8on = new javax.swing.JLabel();
        jlbPool9on = new javax.swing.JLabel();
        jlbPool10on = new javax.swing.JLabel();
        jlbPool11on = new javax.swing.JLabel();
        jlbPool12on = new javax.swing.JLabel();
        jlbPool13on = new javax.swing.JLabel();
        jlbPool14on = new javax.swing.JLabel();
        jlbPool15on = new javax.swing.JLabel();
        jlbLib1on = new javax.swing.JLabel();
        jlbLib2on = new javax.swing.JLabel();
        jlbLib3on = new javax.swing.JLabel();
        jlbLib4on = new javax.swing.JLabel();
        jlbLib5on = new javax.swing.JLabel();
        jlbLib6on = new javax.swing.JLabel();
        jlbPool16on = new javax.swing.JLabel();
        jlbPool17on = new javax.swing.JLabel();
        jlbPool18on = new javax.swing.JLabel();
        jlbPool1off = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jlbLib9off = new javax.swing.JLabel();
        jlbLib8off = new javax.swing.JLabel();
        jlbLib7off = new javax.swing.JLabel();
        jlbLib6off = new javax.swing.JLabel();
        jlbLib5off = new javax.swing.JLabel();
        jlbLib4off = new javax.swing.JLabel();
        jlbLib3off = new javax.swing.JLabel();
        jlbLib2off = new javax.swing.JLabel();
        jlbLib1off = new javax.swing.JLabel();
        jlbPool18off = new javax.swing.JLabel();
        jlbPool17off = new javax.swing.JLabel();
        jlbPool16off = new javax.swing.JLabel();
        jlbPool15off = new javax.swing.JLabel();
        jlbPool14off = new javax.swing.JLabel();
        jlbPool13off = new javax.swing.JLabel();
        jlbPool12off = new javax.swing.JLabel();
        jlbPool11off = new javax.swing.JLabel();
        jlbPool10off = new javax.swing.JLabel();
        jlbPool9off = new javax.swing.JLabel();
        jlbPool8off = new javax.swing.JLabel();
        jlbPool7off = new javax.swing.JLabel();
        jlbPool6off = new javax.swing.JLabel();
        jlbPool5off = new javax.swing.JLabel();
        jlbPool4off = new javax.swing.JLabel();
        jlbPool3off = new javax.swing.JLabel();
        jlbPool2off = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbNgay = new javax.swing.JLabel();
        jlbVao = new javax.swing.JLabel();
        jlbRa = new javax.swing.JLabel();
        jlbBan = new javax.swing.JLabel();
        jlbDongia = new javax.swing.JLabel();
        jspMenu = new javax.swing.JScrollPane();
        jtbMenu = new javax.swing.JTable();
        jbtXoa = new JButton("Xóa");
        jbtXacnhan = new JButton("Xác nhận");
        jbtThanhtoan = new JButton("Thanh toán");
        jLabel7 = new JLabel();
        jlbVIP = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jlbTamtinh = new JLabel();
        jlbGiamgia = new JLabel();
        jlbThanhtien = new JLabel();
        
        menu = new MenuView();
        control = new DatBanController(this,menu);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(840, 1500));

        jspBan.setBackground(new java.awt.Color(218, 200, 242));

        jPanel1.setBackground(new java.awt.Color(218, 200, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbPool1on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); 
        jPanel1.add(jlbPool1on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jlbPool2on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool2on, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 30, -1, -1));

        jlbPool3on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool3on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jlbPool4on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool4on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 253, -1, -1));

        jlbPool5on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool5on, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 253, -1, -1));

        jlbPool6on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool6on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jlbLib7on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib7on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1870, -1, -1));

        jlbLib8on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib8on, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1870, -1, -1));

        jlbLib9on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib9on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1870, -1, -1));

        jlbPool7on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool7on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 476, -1, -1));

        jlbPool8on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool8on, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 476, -1, -1));

        jlbPool9on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool9on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        jlbPool10on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool10on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 699, -1, -1));

        jlbPool11on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool11on, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 699, -1, -1));

        jlbPool12on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool12on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, -1, -1));

        jlbPool13on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool13on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 922, -1, -1));

        jlbPool14on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool14on, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 922, -1, -1));

        jlbPool15on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool15on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 920, -1, -1));

        jlbLib1on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib1on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1420, -1, -1));

        jlbLib2on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib2on, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 1420, -1, -1));

        jlbLib3on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib3on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1420, -1, -1));

        jlbLib4on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib4on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1643, -1, -1));

        jlbLib5on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib5on, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1640, -1, -1));

        jlbLib6on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbLib6on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1640, -1, -1));

        jlbPool16on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool16on, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1145, -1, -1));

        jlbPool17on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool17on, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 1145, -1, -1));

        jlbPool18on.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-on.png"))); // NOI18N
        jPanel1.add(jlbPool18on, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1140, -1, -1));

        jlbPool1off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool1off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 150));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Pool 01");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 195, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Pool 02");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 195, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Pool 03");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 195, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Pool 04");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 412, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Pool 05");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 412, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Pool 06");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 412, 50, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Pool 07");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 635, 50, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Pool 08");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 635, 50, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Pool 09");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 635, 50, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Pool 10");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 858, 50, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Pool 11");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 858, 50, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Pool 12");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 858, 50, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Pool 13");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1081, 50, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Pool 14");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 1081, 50, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Pool 15");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1081, 50, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Pool 16");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 1304, 50, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Pool 17");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 1304, 50, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Pool 18");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 1304, 50, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Libre 01");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 1579, 50, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Libre 02");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 1579, 50, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Libre 03");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 1579, 50, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Libre 04");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1802, 50, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Libre 05");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 1802, 50, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Libre 06");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 1802, 50, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Libre 07");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2025, 50, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Libre 08");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 2025, 50, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Libre 09");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 2025, 50, -1));

        jlbLib9off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib9off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1870, -1, -1));

        jlbLib8off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib8off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1870, 150, -1));

        jlbLib7off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib7off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1870, 150, -1));

        jlbLib6off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib6off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1640, 150, -1));

        jlbLib5off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib5off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1640, 150, -1));

        jlbLib4off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib4off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1640, 150, -1));

        jlbLib3off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib3off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1420, 150, -1));

        jlbLib2off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib2off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1420, 150, -1));

        jlbLib1off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbLib1off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1420, 150, -1));

        jlbPool18off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool18off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 1140, 150, -1));

        jlbPool17off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool17off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1140, 150, 160));

        jlbPool16off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool16off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1143, 150, 160));

        jlbPool15off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool15off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 910, 150, 170));

        jlbPool14off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool14off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 920, 150, 160));

        jlbPool13off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool13off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 920, 150, 160));

        jlbPool12off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool12off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, 150, 170));

        jlbPool11off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool11off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 690, 150, 170));

        jlbPool10off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool10off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 150, 170));

        jlbPool9off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool9off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 150, 170));

        jlbPool8off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool8off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 150, 170));

        jlbPool7off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool7off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 150, 160));

        jlbPool6off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool6off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 150, 170));

        jlbPool5off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool5off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 150, 160));

        jlbPool4off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool4off, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 160));

        jlbPool3off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool3off, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 150, 150));

        jlbPool2off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pool-off.png"))); // NOI18N
        jPanel1.add(jlbPool2off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 150, 150));

        jspBan.setViewportView(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group.png"))); // NOI18N
        jPanel2.add(jlbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 8, 261, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ngày:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 121, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Giờ vào:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 153, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Giờ ra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 185, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bàn:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 217, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Đơn giá:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 249, -1, -1));

        jlbNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbNgay.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jlbNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 121, 256, 20));

        jlbVao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbVao.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jlbVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 153, 241, 20));

        jlbRa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbRa.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jlbRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 185, 241, 20));

        jlbBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbBan.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jlbBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 217, 266, 20));

        jlbDongia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbDongia.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jlbDongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 249, 240, 20));

        jtbMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String [] {
                "Tên", "SL", "Đơn giá", "Tổng"
            }
        ));
        jspMenu.setViewportView(jtbMenu);
        if (jtbMenu.getColumnModel().getColumnCount() > 0) {
            jtbMenu.getColumnModel().getColumn(0).setPreferredWidth(110);
            jtbMenu.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel2.add(jspMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 281, 330, 109));

        jbtXoa.setBackground(new java.awt.Color(99, 59, 178));
        jbtXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtXoa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jbtXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 569, -1, -1));

        jbtXacnhan.setBackground(new java.awt.Color(99, 59, 178));
        jbtXacnhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtXacnhan.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jbtXacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 569, -1, -1));

        jbtThanhtoan.setBackground(new java.awt.Color(99, 59, 178));
        jbtThanhtoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtThanhtoan.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jbtThanhtoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 569, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("VIP:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 402, -1, -1));

        jlbVIP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbVIP.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jlbVIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 402, 268, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tạm tính:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 462, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Giảm giá:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 494, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Thành tiền:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 526, -1, -1));

        jlbTamtinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbTamtinh.setForeground(new java.awt.Color(0, 0, 0));
        jlbTamtinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbTamtinh.setText("0.0");
        jPanel2.add(jlbTamtinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 462, 150, -1));

        jlbGiamgia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbGiamgia.setForeground(new java.awt.Color(0, 0, 0));
        jlbGiamgia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbGiamgia.setText("0.0");
        jPanel2.add(jlbGiamgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 494, 150, -1));

        jlbThanhtien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbThanhtien.setForeground(new java.awt.Color(0, 0, 0));
        jlbThanhtien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbThanhtien.setText("0.0");
        jPanel2.add(jlbThanhtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 526, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspBan, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspBan, javax.swing.GroupLayout.DEFAULT_SIZE, 1488, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        
    }                   
                  
}
