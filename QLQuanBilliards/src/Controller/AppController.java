
package Controller;

import Model.Option;
import View.BillView;
import View.MainJPanel;
import View.MenuView;
import View.StaffView;
import View.StatisticalView;
import View.VIPView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppController {
    private JPanel root;
    private String kindSelected = "";
    private List<Option> listItem = null;

    public AppController(JPanel jpRoot) {
        this.root = jpRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "Main";
        jpnItem.setBackground(new Color(148,0,211));
        jlbItem.setBackground(new Color(148,0,211));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new MainJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<Option> listItem){
        this.listItem = listItem;
        for(Option item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener {
        
        private JPanel node;
        private String optionText;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String optionText, JPanel jpnItem, JLabel jlbItem) {
            this.optionText = optionText;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch(optionText){
                case "Main":
                    node = new MainJPanel();
                    break;
                case "Menu":
                    node = new MenuView();
                    break;
                case "VIP":
                    node = new VIPView();
                    break;
                case "Staff": 
                    node = new StaffView();
                    break;
                case "Bill":
                    node = new BillView();
                    break;
                case "Statistical":
                    node = new StatisticalView();
                    break;
            }
            
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            changeBackground(optionText);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = optionText;
            jpnItem.setBackground(new Color(148,0,211));
            jlbItem.setBackground(new Color(148,0,211));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(148,0,211));
            jlbItem.setBackground(new Color(148,0,211));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(optionText)){
                jpnItem.setBackground(new Color(99,59,178));
                jlbItem.setBackground(new Color(99,59,178));
            }
        }
        
    }
    private void changeBackground(String optionText){
        for(Option item : listItem){
            if(item.getKind().equalsIgnoreCase(optionText)){
                item.getJpn().setBackground(new Color(148,0,211));
                item.getJlb().setBackground(new Color(148,0,211));
            }
            else{
                item.getJpn().setBackground(new Color(99,59,178));
                item.getJlb().setBackground(new Color(99,59,178));
            }
        }
    }
    
}
    