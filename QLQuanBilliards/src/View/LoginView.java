
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class LoginView extends JDialog {
    private JLabel jlbgroup;
    private JLabel jlbimage;
    private JLabel jlbTitle;
    private JLabel jlbusername;
    private JLabel jlbpass;
    private JLabel jlbMess;
    public JButton jbtLogin;
    public JPasswordField jpfPassword;
    public JTextField jtfUsername;
    
    public LoginView() {
        this.setSize(760,512);
        this.setLayout(null);
        this.setBackground(new Color(255,255,255));
        this.setTitle("ĐĂNG NHẬP HỆ THỐNG");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jlbimage = new JLabel();
        jlbimage.setIcon(new ImageIcon(getClass().getResource("/Images/image.png")));
        jlbimage.setBounds(0,0,451,512);
        this.add(jlbimage);
        
        
        jlbgroup = new JLabel();
        jlbgroup.setIcon(new ImageIcon(getClass().getResource("/Images/group.png")));
        jlbgroup.setBounds(510,18, 171, 101);
        this.add(jlbgroup);
        

        jlbTitle = new JLabel("Login to you Account");
        jlbTitle.setBackground(Color.WHITE);
        jlbTitle.setFont(new Font("Arial", 1, 24)); 
        jlbTitle.setForeground(Color.BLACK);
        jlbTitle.setBounds(475, 120, 252, 28);
        this.add(jlbTitle);

        jlbusername = new JLabel("Username");
        jlbusername.setFont(new Font("Segoe UI", 0, 14)); 
        jlbusername.setForeground(Color.BLACK);
        jlbusername.setBounds(475, 158, 62, 20);
        this.add(jlbusername);
        
        jtfUsername = new JTextField();
        jtfUsername.setBackground(Color.WHITE);
        jtfUsername.setFont(new Font("Segoe UI", 0, 14)); 
        jtfUsername.setBounds(475, 180, 250, 30);
        this.add(jtfUsername);

        jlbpass = new JLabel("Password");
        jlbpass.setFont(new Font("Segoe UI", 0, 14)); 
        jlbpass.setForeground(Color.BLACK);
        jlbpass.setBounds(475, 212, 62, 20);
        this.add(jlbpass);
        
        jpfPassword = new JPasswordField();
        jpfPassword.setBackground(Color.WHITE);
        jpfPassword.setFont(new Font("Segoe UI", 0, 14));
        jpfPassword.setBounds(475, 234, 250, 30);
        this.add(jpfPassword);

        jbtLogin = new JButton("Login");
        jbtLogin.setBackground(new Color(99, 59, 178));
        jbtLogin.setFont(new Font("Segoe UI", 1, 14));
        jbtLogin.setForeground(Color.WHITE);
        jbtLogin.setBounds(475, 340, 250, 30);
        this.add(jbtLogin);
        
        jlbMess = new JLabel("Vui lòng nhập dữ liệu bắt buộc");
        jlbMess.setForeground(new Color(204, 0, 0));
        jlbMess.setFont(new Font("Segoe UI", 0, 12));
        jlbMess.setHorizontalAlignment(SwingConstants.CENTER);
        jlbMess.setBounds(475, 310, 250, 20);
        this.add(jlbMess);
        
        setVisible(true);
    }   
    public static void main(String[] args) {
        new LoginView();
    }
}
