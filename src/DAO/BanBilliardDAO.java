
package DAO;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Database.Connect_DB;
import Model.BanBilliardModel;
import java.util.ArrayList;
import java.util.List;


public class BanBilliardDAO {
    
    public static List<BanBilliardModel> getAllBan(){
        List<BanBilliardModel> Bans = new ArrayList<>(); 
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM BanBilliard";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BanBilliardModel ban = new BanBilliardModel();
                ban.setMaBan(rs.getString("MaBan"));
                ban.setDongia(rs.getDouble("dongia"));
                
                Bans.add(ban);
            }
            return Bans;
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return Bans;
    }
    
    public static BanBilliardModel getBanbyID(String maban){
        BanBilliardModel ban = new BanBilliardModel();
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM BanBilliard WHERE MaBan = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maban);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                ban.setMaBan(rs.getString("MaBan"));
                ban.setDongia(rs.getDouble("dongia"));
                return ban;
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static int updateBan(BanBilliardModel ban) {
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "UPDATE BanBilliard SET dongia = ? WHERE MaBan = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, ban.getDongia());
            ps.setString(2, ban.getMaBan());
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0)
                return 1;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
