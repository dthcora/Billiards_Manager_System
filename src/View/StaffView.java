
package View;

import Controller.NhanVienController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class StaffView extends JPanel {

    private JButton jbtAdd;
    private JPanel jpnView;
    private JTextField jtfSearch;
    public JButton getJbtAdd(){
    return jbtAdd;
}
    public JPanel getJpnView() {
    return jpnView;  
}

    public JTextField getJtfSearch(){
    return jtfSearch;
    }
    
    private NhanVienController control;
    public StaffView() {
        this.setBackground(new Color(218, 200, 242));
        
        
        jbtAdd = new JButton("+Thêm");
        jbtAdd.setBackground(new Color(99,59,178));
        jbtAdd.setFont(new Font("Aria",Font.BOLD,18));
        jbtAdd.setForeground(Color.WHITE);
        
        jtfSearch = new JTextField();
        jtfSearch.setBackground(new Color(255,255,255));
        jtfSearch.setFont(new Font("Arial",Font.PLAIN,15));
        
        jpnView = new JPanel();
        jpnView.setBackground(Color.WHITE);
        
        
        GroupLayout jpnViewLayout = new GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 558, Short.MAX_VALUE));
        
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbtAdd, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addComponent(jtfSearch, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnView, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSearch, GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAdd, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jpnView, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        control = new NhanVienController(jpnView, jbtAdd, jtfSearch); 
        control.setDatetoTable();
             
    }
        public NhanVienController getControl() { 
        return control;
    }
    
}
