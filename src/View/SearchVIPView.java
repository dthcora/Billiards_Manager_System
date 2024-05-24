
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class SearchVIPView extends JDialog {
                        
    public JButton jbtSearch;
    public JButton jbtXoa;
    public JButton jbtXacnhan;
    public JCheckBox jCheckBox1;
    public JLabel jLabel1;
    public JLabel jLabel2;
    public JLabel jLabel3;
    public JPanel jPanel1;
    public JTextField jtfSDT;
    public JTextField jtfName;
    public JTextField jtfDiem;
    
    public SearchVIPView() {
        this.setSize(421,250);
        this.setTitle("VIP");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jtfSDT = new JTextField();
        jbtSearch = new JButton("Search");
        jLabel2 = new JLabel();
        jtfName = new JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDiem = new JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jbtXoa = new JButton("Xóa");
        jbtXacnhan = new JButton("Xác nhận");

        

        jPanel1.setBackground(Color.WHITE);
        jPanel1.setLayout(new AbsoluteLayout());

        jLabel1.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setText("SĐT:");
        jPanel1.add(jLabel1, new AbsoluteConstraints(21, 23, -1, -1));

        jtfSDT.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jtfSDT.setForeground(Color.BLACK);
        jPanel1.add(jtfSDT, new AbsoluteConstraints(69, 18, 235, -1));

        jbtSearch.setBackground(new Color(99, 59, 178));
        jbtSearch.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jbtSearch.setForeground(Color.WHITE);
        jPanel1.add(jbtSearch, new AbsoluteConstraints(324, 18, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tên:");
        jPanel1.add(jLabel2, new AbsoluteConstraints(21, 72, -1, -1));

        jtfName.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jtfName.setForeground(Color.BLACK);
        jtfName.setEditable(false);
        jPanel1.add(jtfName, new AbsoluteConstraints(69, 67, 235, -1));

        jLabel3.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(Color.BLACK);
        jLabel3.setText("Điểm:");
        jPanel1.add(jLabel3, new AbsoluteConstraints(21, 120, -1, -1));

        jtfDiem.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jtfDiem.setForeground(Color.BLACK);
        jtfDiem.setEditable(false);
        jPanel1.add(jtfDiem, new AbsoluteConstraints(71, 115, 75, -1));

        jCheckBox1.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setForeground(Color.BLACK);
        jCheckBox1.setText("Quy đổi");
        jPanel1.add(jCheckBox1, new AbsoluteConstraints(225, 113, 87, -1));

        jbtXoa.setBackground(new Color(99, 59, 178));
        jbtXoa.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jbtXoa.setForeground(Color.WHITE);
        jPanel1.add(jbtXoa, new AbsoluteConstraints(68, 192, -1, -1));

        jbtXacnhan.setBackground(new Color(99, 59, 178));
        jbtXacnhan.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jbtXacnhan.setForeground(Color.WHITE);
        jPanel1.add(jbtXacnhan, new AbsoluteConstraints(217, 192, -1, -1));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        pack();
    }                      
                  
}
