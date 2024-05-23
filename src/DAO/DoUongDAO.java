
package DAO;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Database.Connect_DB;
import Model.DoUongModel;
import java.util.ArrayList;
import java.util.List;

public class DoUongDAO {
    
    public static List<DoUongModel> getAllDoUong(){
        List<DoUongModel> menu = new ArrayList<>();
        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM DoUong";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                DoUongModel drink = new DoUongModel();
                drink.setMaDU(rs.getString("MaDU"));
                drink.setTenDU(rs.getString("TenDU"));
                drink.setSoluong(rs.getInt("soluong"));
                drink.setDongia(rs.getDouble("dongia"));
                
                menu.add(drink);
            }
            return menu;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return menu;
    }
    
    public static DoUongModel getDrinkbyID(String madouong){
        DoUongModel drink = new DoUongModel();
        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM DoUong WHERE MaDU = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, madouong);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                drink.setMaDU(rs.getString("MaDU"));
                drink.setTenDU(rs.getString("TenDU"));
                drink.setSoluong(rs.getInt("soluong"));
                drink.setDongia(rs.getDouble("dongia"));
                return drink;
            } 
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public static int updateDoUong(DoUongModel drink){
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "UPDATE DoUong SET TenDU = ?, soluong = ?, dongia = ? WHERE MaDU = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, drink.getTenDU());
            ps.setInt(2, drink.getSoluong());
            ps.setDouble(3, drink.getDongia());
            ps.setString(4, drink.getMaDU());
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0)
                return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int insertDoUong(DoUongModel drink){
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "INSERT INTO DoUong (MaDU, TenDU, soluong, dongia) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, drink.getMaDU());
            ps.setString(2, drink.getTenDU());
            ps.setInt(3, drink.getSoluong());
            ps.setDouble(4, drink.getDongia());
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0)
                return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public static int deleteDrinkbyID(String madouong){
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "DELETE FROM DoUong WHERE MaDU = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, madouong);
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0)
                return 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static String getTenDUbyMaDU(String maDU) {
    try {
        Connection conn = Connect_DB.getConnection();
        String sql = "SELECT TenDU FROM DoUong WHERE MaDU = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, maDU);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getString("TenDU");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}

}
