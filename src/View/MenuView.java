
package View;

import Controller.DoUongController;
import Model.DoUongModel;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class MenuView extends JPanel {
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    public JSpinner DU01;
    public JSpinner DU02;
    public JSpinner DU03;
    public JSpinner DU04;
    public JSpinner DU05;
    public JSpinner DU06;
    public JSpinner DU07;
    public JSpinner DU08;
    public JSpinner DU09;
    public JButton jbtAdd;
    public JButton jbtReset;
    public ArrayList<JSpinner> spinners;
    
    private final DoUongController control;

    public MenuView() {
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
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        DU01 = new JSpinner();
        DU02 = new JSpinner();
        DU03 = new JSpinner();
        DU04 = new JSpinner();
        DU05 = new JSpinner();
        DU06 = new JSpinner();
        DU07 = new JSpinner();
        DU08 = new JSpinner();
        DU09 = new JSpinner();
        jbtAdd = new JButton("Add");
        jbtReset = new JButton("Reset");
        
        control = new DoUongController(this);

        setBackground(new java.awt.Color(218, 200, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Images/Juice.png"))); // NOI18N
        add(jLabel1, new AbsoluteConstraints(50, 8, 101, -1));

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/Images/Pineapple.png"))); // NOI18N
        add(jLabel2, new AbsoluteConstraints(241, 0, 144, -1));

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/Images/Apple.png"))); // NOI18N
        add(jLabel3, new AbsoluteConstraints(480, 0, -1, -1));

        jLabel4.setIcon(new ImageIcon(getClass().getResource("/Images/Orange.png"))); // NOI18N
        add(jLabel4, new AbsoluteConstraints(694, 0, -1, -1));

        jLabel5.setIcon(new ImageIcon(getClass().getResource("/Images/Mango.png"))); // NOI18N
        add(jLabel5, new AbsoluteConstraints(241, 222, 144, -1));

        jLabel6.setIcon(new ImageIcon(getClass().getResource("/Images/Watermelon.png"))); // NOI18N
        add(jLabel6, new AbsoluteConstraints(480, 222, -1, -1));

        jLabel7.setIcon(new ImageIcon(getClass().getResource("/Images/Mixture.png"))); // NOI18N
        add(jLabel7, new AbsoluteConstraints(694, 240, -1, -1));

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/Images/Milktea.png"))); // NOI18N
        add(jLabel8, new AbsoluteConstraints(260, 430, -1, -1));

        jLabel9.setIcon(new ImageIcon(getClass().getResource("/Images/Matcha.png"))); // NOI18N
        add(jLabel9, new AbsoluteConstraints(480, 435, -1, -1));

        jLabel10.setIcon(new ImageIcon(getClass().getResource("/Images/Milk.png"))); // NOI18N
        add(jLabel10, new AbsoluteConstraints(700, 420, -1, -1));

        jLabel11.setIcon(new ImageIcon(getClass().getResource("/Images/MilkteaLogo.png"))); // NOI18N
        add(jLabel11, new AbsoluteConstraints(61, 441, -1, -1));

        jLabel12.setFont(new Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(Color.BLACK);
        jLabel12.setText("<html><div style='text-align: center;'>NƯỚC ÉP<br>Juice</div></html>");
        add(jLabel12, new AbsoluteConstraints(75, 109, -1, -1));

        jLabel13.setFont(new Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(Color.BLACK);
        jLabel13.setText("<html><div style='text-align: center;'>TRÀ   SỮA<br>Milktea</div></html>");
        add(jLabel13, new AbsoluteConstraints(82, 537, -1, -1));

        jLabel14.setIcon(new ImageIcon(getClass().getResource("/Images/Line.png"))); // NOI18N
        add(jLabel14, new AbsoluteConstraints(26, 6, 18, -1));

        jLabel15.setIcon(new ImageIcon(getClass().getResource("/Images/Line.png"))); // NOI18N
        add(jLabel15, new AbsoluteConstraints(26, 434, 17, -1));

        jLabel16.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel16.setForeground(Color.BLACK);
        jLabel16.setText("<html><div style='text-align: center;'>NƯỚC ÉP THƠM<br>Pineapple Juice</div></html>");
        add(jLabel16, new AbsoluteConstraints(267, 133, -1, -1));

        jLabel17.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel17.setForeground(Color.BLACK);
        jLabel17.setText("<html><div style='text-align: center;'>NƯỚC ÉP TÁO<br>Apple Juice</div></html>");
        add(jLabel17, new AbsoluteConstraints(486, 135, -1, -1));

        jLabel18.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel18.setForeground(Color.BLACK);
        jLabel18.setText("<html><div style='text-align: center;'>NƯỚC ÉP CAM<br>Orange Juice</div></html>");
        add(jLabel18, new AbsoluteConstraints(713, 138, -1, -1));

        jLabel19.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel19.setForeground(Color.BLACK);
        jLabel19.setText("<html><div style='text-align: center;'>NƯỚC ÉP XOÀI<br>Mango Juice</div></html>");
        add(jLabel19, new AbsoluteConstraints(255, 355, 219, -1));

        jLabel20.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel20.setForeground(Color.BLACK);
        jLabel20.setText("<html><div style='text-align: center;'>NƯỚC ÉP DƯA HẤU<br>Watermelon Juice</div></html>");
        add(jLabel20, new AbsoluteConstraints(480, 355, 98, -1));

        jLabel21.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel21.setForeground(Color.BLACK);
        jLabel21.setText("<html><div style='text-align: center;'>NƯỚC ÉP HỖN HỢP<br>Mixture Juice</div></html>");
        add(jLabel21, new AbsoluteConstraints(712, 355, -1, -1));

        jLabel22.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel22.setForeground(Color.BLACK);
        jLabel22.setText("<html><div style='text-align: center;'>TRÀ SỮA TRUYỀN THỐNG<br>Traditional Milktea</div></html>");
        add(jLabel22, new AbsoluteConstraints(240, 570, -1, -1));

        jLabel23.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel23.setForeground(Color.BLACK);
        jLabel23.setText("<html><div style='text-align: center;'>TRÀ SỮA MATCHA<br>Matcha Milktea</div></html>");
        add(jLabel23, new AbsoluteConstraints(480, 571, 119, -1));

        jLabel24.setFont(new Font("Segoe UI", 1, 10)); // NOI18N
        jLabel24.setForeground(Color.BLACK);
        jLabel24.setText("<html><div style='text-align: center;'>SỮA TƯƠI TRÂN CHÂU ĐƯỜNG ĐEN<br>Brown sugar bubble fresh milk</div></html>");
        add(jLabel24, new AbsoluteConstraints(670, 570, -1, -1));

        DU01.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU01.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU01.setName("DU01");
        add(DU01, new AbsoluteConstraints(273, 172, 55, -1));

        DU02.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU02.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU02.setName("DU02");
        add(DU02, new AbsoluteConstraints(492, 172, 55, -1));

        DU03.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU03.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU03.setName("DU03");
        add(DU03, new AbsoluteConstraints(727, 172, 55, -1));

        DU04.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU04.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU04.setName("DU04");
        add(DU04, new AbsoluteConstraints(261, 389, 55, -1));

        DU05.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU05.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU05.setName("DU05");
        add(DU05, new AbsoluteConstraints(500, 389, 55, -1));

        DU06.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU06.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU06.setName("DU06");
        add(DU06, new AbsoluteConstraints(731, 389, 55, -1));

        DU07.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU07.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU07.setName("DU07");
        add(DU07, new AbsoluteConstraints(270, 610, 55, -1));

        DU08.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU08.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU08.setName("DU08");
        add(DU08, new AbsoluteConstraints(500, 610, 55, -1));

        DU09.setFont(new Font("Arial", 0, 14)); // NOI18N
        DU09.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        DU09.setName("DU09");
        add(DU09, new AbsoluteConstraints(740, 610, 55, -1));

        jbtAdd.setBackground(new Color(99, 59, 178));
        jbtAdd.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jbtAdd.setForeground(Color.WHITE);
        add(jbtAdd, new AbsoluteConstraints(900, 40, 90, -1));

        jbtReset.setBackground(new Color(99, 59, 178));
        jbtReset.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jbtReset.setForeground(Color.WHITE);
        add(jbtReset, new AbsoluteConstraints(900, 89, 90, -1));
        
        spinners = new ArrayList<>();
        spinners.add(DU01);
        spinners.add(DU02);
        spinners.add(DU03);
        spinners.add(DU04);
        spinners.add(DU05);
        spinners.add(DU06);
        spinners.add(DU07);
        spinners.add(DU08);
        spinners.add(DU09);
       
     
    }                                                   
}

