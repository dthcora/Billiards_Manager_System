
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
 
import Database.Connect_DB;
import Model.AccountModel;


public class AccountDAO {
    public AccountModel Login(String username, String password) {
        Connection conn = Connect_DB.getConnection();
        String sql = "SELECT * FROM USERLOGIN WHERE username = ? and password = ?";
        AccountModel account = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);  
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                account = new AccountModel();
                account.setId(rs.getInt("id"));
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
            }
            ps.close();
            rs.close();
            return account;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
