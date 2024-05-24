
package View;

import Controller.StatisticalController;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class StatisticalView extends JPanel{                   
    public JDateChooser DateFrom;
    public JDateChooser DateTo;
    public JLabel jLabel1;
    public JLabel jLabel2;
    public JLabel jLabel3;
    public JComboBox<String> jcbOption;
    public JPanel jpnView;
    StatisticalController control;
      
    
    public StatisticalView() {

        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        DateFrom = new JDateChooser();
        DateTo = new JDateChooser();
        jLabel3 = new JLabel();
        jcbOption = new JComboBox<>();
        jpnView = new JPanel();

        setBackground(new Color(218, 200, 242));
        setLayout(new AbsoluteLayout());

        jLabel2.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(Color.BLACK);
        jLabel2.setText("Từ ngày:");
        add(jLabel2, new AbsoluteConstraints(21, 24, -1, -1));

        jLabel1.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(Color.BLACK);
        jLabel1.setText("Đến ngày:");
        add(jLabel1, new AbsoluteConstraints(621, 24, -1, -1));

        DateFrom.setDateFormatString("dd/MM/yyyy");
        add(DateFrom, new AbsoluteConstraints(126, 24, 150, -1));

        DateTo.setDateFormatString("dd/MM/yyyy");
        add(DateTo, new AbsoluteConstraints(734, 24, 150, -1));

        jLabel3.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(Color.BLACK);
        jLabel3.setText("Thống kê:");
        add(jLabel3, new AbsoluteConstraints(21, 79, -1, -1));

        jcbOption.setModel(new DefaultComboBoxModel<>(new String[] { "", "Doanh thu", "Nhân viên", "Hội viên" }));
        add(jcbOption, new AbsoluteConstraints(126, 74, 150, -1));

        jpnView.setBackground(Color.WHITE);

        GroupLayout jpnViewLayout = new GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        add(jpnView, new AbsoluteConstraints(21, 118, -1, -1));
        control = new StatisticalController(this);
    }          
}
    
