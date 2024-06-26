
package View;

import Controller.AppController;
import Model.Option;
import java.util.ArrayList;
import java.util.List;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        
        setSize(1040,740);
        setTitle("QUẢN LÝ QUÁN BILLIARD");
        AppController control = new AppController(jPView);
        control.setView(jpnBilliard, jlbBilliard);
        
        List<Option> listItem = new ArrayList<>();
        listItem.add(new Option("Main", jpnBilliard, jlbBilliard));
        listItem.add(new Option("Menu", jpnMenu, jlbMenu));
        listItem.add(new Option("VIP", jpnVIP, jlbVIP));
        listItem.add(new Option("Staff", jpnStaff, jlbStaff));
        listItem.add(new Option("Bill", jpnBill, jlbBill));
        listItem.add(new Option("Statistical", jpnStatistical, jlbStatistical));
        listItem.add(new Option("Logout", jpnLogout, jlbLogout));
        
        control.setEvent(listItem);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPRoot = new javax.swing.JPanel();
        jPMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnBilliard = new javax.swing.JPanel();
        jlbBilliard = new javax.swing.JLabel();
        jpnMenu = new javax.swing.JPanel();
        jlbMenu = new javax.swing.JLabel();
        jpnVIP = new javax.swing.JPanel();
        jlbVIP = new javax.swing.JLabel();
        jpnStaff = new javax.swing.JPanel();
        jlbStaff = new javax.swing.JLabel();
        jpnBill = new javax.swing.JPanel();
        jlbBill = new javax.swing.JLabel();
        jpnStatistical = new javax.swing.JPanel();
        jlbStatistical = new javax.swing.JLabel();
        jpnLogout = new javax.swing.JPanel();
        jlbLogout = new javax.swing.JLabel();
        jPView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 650));

        jPRoot.setBackground(new java.awt.Color(255, 255, 255));
        jPRoot.setPreferredSize(new java.awt.Dimension(900, 650));

        jPMenu.setBackground(new java.awt.Color(99, 59, 178));
        jPMenu.setPreferredSize(new java.awt.Dimension(200, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        jpnBilliard.setBackground(new java.awt.Color(99, 59, 178));

        jlbBilliard.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbBilliard.setForeground(new java.awt.Color(255, 255, 255));
        jlbBilliard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book.png"))); // NOI18N
        jlbBilliard.setText("Billiards");

        javax.swing.GroupLayout jpnBilliardLayout = new javax.swing.GroupLayout(jpnBilliard);
        jpnBilliard.setLayout(jpnBilliardLayout);
        jpnBilliardLayout.setHorizontalGroup(
            jpnBilliardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBilliardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBilliard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnBilliardLayout.setVerticalGroup(
            jpnBilliardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBilliardLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbBilliard)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnMenu.setBackground(new java.awt.Color(99, 59, 178));

        jlbMenu.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbMenu.setForeground(new java.awt.Color(255, 255, 255));
        jlbMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Order.png"))); // NOI18N
        jlbMenu.setText("Menu");

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbMenu)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnVIP.setBackground(new java.awt.Color(99, 59, 178));

        jlbVIP.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbVIP.setForeground(new java.awt.Color(255, 255, 255));
        jlbVIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VIP.png"))); // NOI18N
        jlbVIP.setText("VIP");

        javax.swing.GroupLayout jpnVIPLayout = new javax.swing.GroupLayout(jpnVIP);
        jpnVIP.setLayout(jpnVIPLayout);
        jpnVIPLayout.setHorizontalGroup(
            jpnVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVIPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnVIPLayout.setVerticalGroup(
            jpnVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVIPLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbVIP)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnStaff.setBackground(new java.awt.Color(99, 59, 178));

        jlbStaff.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbStaff.setForeground(new java.awt.Color(255, 255, 255));
        jlbStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Staffs.png"))); // NOI18N
        jlbStaff.setText("Staffs");

        javax.swing.GroupLayout jpnStaffLayout = new javax.swing.GroupLayout(jpnStaff);
        jpnStaff.setLayout(jpnStaffLayout);
        jpnStaffLayout.setHorizontalGroup(
            jpnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnStaffLayout.setVerticalGroup(
            jpnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStaffLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbStaff)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnBill.setBackground(new java.awt.Color(99, 59, 178));

        jlbBill.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbBill.setForeground(new java.awt.Color(255, 255, 255));
        jlbBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bill.png"))); // NOI18N
        jlbBill.setText("Bill");

        javax.swing.GroupLayout jpnBillLayout = new javax.swing.GroupLayout(jpnBill);
        jpnBill.setLayout(jpnBillLayout);
        jpnBillLayout.setHorizontalGroup(
            jpnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnBillLayout.setVerticalGroup(
            jpnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBillLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbBill)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpnStatistical.setBackground(new java.awt.Color(99, 59, 178));

        jlbStatistical.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbStatistical.setForeground(new java.awt.Color(255, 255, 255));
        jlbStatistical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Statistical.png"))); // NOI18N
        jlbStatistical.setText("Statistical");

        javax.swing.GroupLayout jpnStatisticalLayout = new javax.swing.GroupLayout(jpnStatistical);
        jpnStatistical.setLayout(jpnStatisticalLayout);
        jpnStatisticalLayout.setHorizontalGroup(
            jpnStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatisticalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStatistical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnStatisticalLayout.setVerticalGroup(
            jpnStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnStatisticalLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jlbStatistical)
                .addGap(10, 10, 10))
        );

        jpnLogout.setBackground(new java.awt.Color(99, 59, 178));

        jlbLogout.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbLogout.setForeground(new java.awt.Color(255, 255, 255));
        jlbLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Log out.png"))); // NOI18N
        jlbLogout.setText("Log out");

        javax.swing.GroupLayout jpnLogoutLayout = new javax.swing.GroupLayout(jpnLogout);
        jpnLogout.setLayout(jpnLogoutLayout);
        jpnLogoutLayout.setHorizontalGroup(
            jpnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnLogoutLayout.setVerticalGroup(
            jpnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLogoutLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbLogout)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
            .addComponent(jpnBilliard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnStatistical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBilliard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPView.setBackground(new java.awt.Color(218, 200, 242));

        javax.swing.GroupLayout jPViewLayout = new javax.swing.GroupLayout(jPView);
        jPView.setLayout(jPViewLayout);
        jPViewLayout.setHorizontalGroup(
            jPViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        jPViewLayout.setVerticalGroup(
            jPViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPRootLayout = new javax.swing.GroupLayout(jPRoot);
        jPRoot.setLayout(jPRootLayout);
        jPRootLayout.setHorizontalGroup(
            jPRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRootLayout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPRootLayout.setVerticalGroup(
            jPRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRootLayout.createSequentialGroup()
                .addGroup(jPRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                    .addComponent(jPView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPRoot;
    private javax.swing.JPanel jPView;
    private javax.swing.JLabel jlbBill;
    private javax.swing.JLabel jlbBilliard;
    private javax.swing.JLabel jlbLogout;
    private javax.swing.JLabel jlbMenu;
    private javax.swing.JLabel jlbStaff;
    private javax.swing.JLabel jlbStatistical;
    private javax.swing.JLabel jlbVIP;
    private javax.swing.JPanel jpnBill;
    private javax.swing.JPanel jpnBilliard;
    private javax.swing.JPanel jpnLogout;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnStaff;
    private javax.swing.JPanel jpnStatistical;
    private javax.swing.JPanel jpnVIP;
    // End of variables declaration//GEN-END:variables

   
}
