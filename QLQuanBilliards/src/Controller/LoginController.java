
package Controller;

import DAO.AccountDAO;
import Model.AccountModel;
import View.LoginView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginController {
    private LoginView view;
    private AccountModel account;  
    
    public LoginController(LoginView view) {
        view.jtfUsername.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
    }
    /*
    public void setEvent() {
        jbtLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jtfUsername.getText().length() == 0 || jpfPassword.getText().length() == 0) {
                    jlbMess.setText("Vui lòng nhập dữ liệu bắt buộc");
                }else {
                    
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                jbtLogin.setBackground(new Color(99,59,178));
            }
            
            @Override 
            public void mouseExited(MouseEvent e) {
                jbtLogin.setBackground(new Color(148,0,211));
            }
        
        });
    }*/
    
}
