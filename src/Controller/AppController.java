package Controller;

import Model.Option;
import View.BillView;
import View.LoginView;
import View.MainPanel;
import View.MenuView;
import View.StaffView;
import View.StatisticalView;
import View.VIPView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AppController {
    private final JPanel root;
    private String kindSelected = "";
    private List<Option> listItem = null;

    private MainPanel mainJPanel;
    private MenuView menuView;
    private VIPView vipView;
    private StaffView staffView;
    private BillView billView;
    private StatisticalView statisticalView;

    public AppController(JPanel jpRoot) {
        this.root = jpRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "Main";
        jpnItem.setBackground(new Color(148, 0, 211));
        jlbItem.setBackground(new Color(148, 0, 211));

        showMainPanel();
    }

    public void showMainPanel() {
        if (mainJPanel == null) {
            mainJPanel = new MainPanel();
        }
        showPanel(mainJPanel);
    }

    public void showMenuPanel() {
        if (menuView == null) {
            menuView = new MenuView();
        }
        showPanel(menuView);
    }

    public void showVIPPanel() {
        if (vipView == null) {
            vipView = new VIPView();
        }
        showPanel(vipView);
    }

    public void showStaffPanel() {
        if (staffView == null) {
            staffView = new StaffView();
        }
        showPanel(staffView);
    }

    public void showBillPanel() {
        if (billView == null) {
            billView = new BillView();
        }
        showPanel(billView);
    }

    public void showStatisticalPanel() {
        if (statisticalView == null) {
            statisticalView = new StatisticalView();
        }
        showPanel(statisticalView);
    }

    private void showPanel(JPanel panel) {
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(panel);
        root.validate();
        root.repaint();
    }

    public void setEvent(List<Option> listItem) {
        this.listItem = listItem;
        for (Option item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind()));
        }
    }

    class LabelEvent implements MouseListener {
        private final String optionText;

        public LabelEvent(String optionText) {
            this.optionText = optionText;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (optionText) {
                case "Main" -> showMainPanel();
                case "Menu" -> showMenuPanel();
                case "VIP" -> showVIPPanel();
                case "Staff" -> showStaffPanel();
                case "Bill" -> showBillPanel();
                case "Statistical" -> showStatisticalPanel();
                case "Logout" -> handleLogout();
                
            }
            changeBackground(optionText);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = optionText;
            for (Option item : listItem) {
                if (item.getKind().equalsIgnoreCase(optionText)) {
                    item.getJpn().setBackground(new Color(148, 0, 211));
                    item.getJlb().setBackground(new Color(148, 0, 211));
                } else {
                    item.getJpn().setBackground(new Color(99, 59, 178));
                    item.getJlb().setBackground(new Color(99, 59, 178));
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            for (Option item : listItem) {
                if (item.getKind().equalsIgnoreCase(optionText)) {
                    item.getJpn().setBackground(new Color(148, 0, 211));
                    item.getJlb().setBackground(new Color(148, 0, 211));
                }
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            changeBackground(optionText);
        }
    }
    private void handleLogout() {
        int op = JOptionPane.showConfirmDialog(null, "Xác nhận", "Bạn chắc chắn muốn đăng xuất", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            JFrame current = (JFrame) SwingUtilities.getWindowAncestor(root);
            current.dispose();
            LoginView view = new LoginView();
        
        }
    }

    private void changeBackground(String optionText) {
        for (Option item : listItem) {
            if (item.getKind().equalsIgnoreCase(optionText)) {
                item.getJpn().setBackground(new Color(148, 0, 211));
                item.getJlb().setBackground(new Color(148, 0, 211));
            } else {
                if (!kindSelected.equalsIgnoreCase(item.getKind())) {
                    item.getJpn().setBackground(new Color(99, 59, 178));
                    item.getJlb().setBackground(new Color(99, 59, 178));
                }
            }
        }
    }
}