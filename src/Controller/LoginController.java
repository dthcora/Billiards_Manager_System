package Controller;

import View.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.MainView;
import javax.swing.JOptionPane;

public class LoginController {
  private LoginView view;
  
  public LoginController(LoginView view) {
    this.view = view;

    view.jbtLogin.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String username = view.jtfUsername.getText();
        String password = new String(view.jpfPassword.getPassword());

        if (username.equals("group12") && password.equals("123")) {
          // Đăng nhập thành công
          view.jlbMess.setText("Đăng nhập thành công");
          JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
          view.setVisible(false); // Ẩn LoginView
          MainView mainView = new MainView();
          mainView.setVisible(true); // Hiển thị MainView
        } else if (username.isEmpty() || password.isEmpty()) {
          // Yêu cầu nhập đầy đủ thông tin
          view.jlbMess.setText("Vui lòng nhập đầy đủ thông tin");
        } else {
          // Đăng nhập không thành công
          view.jlbMess.setText("Sai tài khoản hoặc mật khẩu");
        }
      }
    });
  }
}