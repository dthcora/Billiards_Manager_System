
package Controller;

import DAO.HoiVienDAO;
import Model.HoiVienModel;
import View.SearchVIPView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SearchVIPController {
    SearchVIPView vip;
    
    public SearchVIPController(SearchVIPView vip) {
        this.vip = vip;
        
        vip.jbtSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sdt = vip.jtfSDT.getText();
                HoiVienModel hv = HoiVienDAO.getVIPbySDT(sdt);
                
                if (hv != null) {
                    vip.jtfName.setText(hv.getTenHV());
                    vip.jtfDiem.setText(String.valueOf(hv.getTongdiem()));
                } else {
                    vip.jtfName.setText("");
                    vip.jtfDiem.setText("");
                    JOptionPane.showMessageDialog(vip, "Không tìm thấy hội viên với số điện thoại này.");
                }
            }
        });
        vip.jbtXoa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vip.jtfSDT.setText("");
                vip.jtfName.setText("");
                vip.jtfDiem.setText("");
                vip.jCheckBox1.setSelected(false);
            }
            
        });
        
    }
}
