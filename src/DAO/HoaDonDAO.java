
package DAO;

import Database.Connect_DB;
import Model.DoUongModel;
import Model.HoaDonModel;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO {

    public static int insertDrink(String mahd, DoUongModel drink){
        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "INSERT INTO CTDU (MaHD,MaDU,soluong,dongia) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1,mahd);
            ps.setString(2,drink.getMaDU());
            ps.setInt(3, drink.getSoluong());
            ps.setDouble(4, drink.getDongia());

            int check = ps.executeUpdate();
            if(check > 0) return 1;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public static HoaDonModel getMaxIDBill(){
        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM HoaDon WHERE MaHD = (SELECT 'HD' || LPAD(MAX(TO_NUMBER(SUBSTR(MaHD, 3))), 3, '0') FROM HoaDon)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String mahd = rs.getString("MaHD");
                String maban = rs.getString("MaBan");
                String mahv = rs.getString("MaHV");
                Date nghd = rs.getDate("NGHD");
                Date giovao = rs.getDate("giovao");
                Date giora = rs.getDate("giora");
                Double tamtinh = rs.getDouble("tamtinh");
                Double tongcong = rs.getDouble("tongcong");
                Double giamgia = rs.getDouble("giamgia");
                
                return new HoaDonModel(mahd,maban,mahv,nghd,giovao,giora,tamtinh,tongcong,giamgia,null);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public static int insertHoaDon(HoaDonModel bill){
        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "INSERT INTO HoaDon (MaBan,MaHV,NGHD,giovao,tamtinh,tongcong,giamgia) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1,bill.getMaBan());
            ps.setString(2,bill.getMaHV());
            ps.setDate(3, new Date(bill.getNGHD().getTime()));  
            ps.setDate(4, new Date(bill.getGiovao().getTime()));
            ps.setDouble(5, bill.getTamtinh());
            ps.setDouble(6, bill.getTongcong());
            ps.setDouble(7, bill.getGiamgia());
            int check = ps.executeUpdate();
            
            if (check > 0) {
                HoaDonModel maxid = getMaxIDBill();
                String mahd = maxid.getMaHD();
                for (DoUongModel drink : bill.getDrinks()) {
                    insertDrink(mahd, drink);
                }
                return 1;
            }
            
            
        } catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    public static int updateHoaDon(HoaDonModel bill){
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "UPDATE HoaDon SET giora = ?, tamtinh = ?, tongcong = ? WHERE MaHD = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDate(1, new Date(bill.getGiora().getTime()));
            ps.setDouble(2, bill.getTamtinh());
            ps.setDouble(3, bill.getTongcong());
            ps.setString(4, bill.getMaHD());

            int check = ps.executeUpdate();
            return check;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static List<HoaDonModel> getAllBill(){
        List<HoaDonModel> Bills = new ArrayList<>();
        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM HoaDon";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String mahd = rs.getString("MaHD");
                String maban = rs.getString("MaBan");
                String mahv = rs.getString("MaHV");
                Date nghd = rs.getDate("NGHD");
                Date giovao = rs.getDate("giovao");
                Date giora = rs.getDate("giora");
                Double tamtinh = rs.getDouble("tamtinh");
                Double tongcong = rs.getDouble("tongcong");
                Double giamgia = rs.getDouble("giamgia");
                
                HoaDonModel bill = new HoaDonModel(mahd,maban,mahv,nghd,giovao,giora,tamtinh,tongcong,giamgia,null);
                Bills.add(bill);
            }
            return Bills;
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return Bills;
    }
    
    public static List<DoUongModel> getDrinksList(String mahd){
        List<DoUongModel> menu = new ArrayList<>();
        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM CTDU WHERE MaHD = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mahd);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                DoUongModel drink = new DoUongModel();
                drink.setMaDU(rs.getString("MaDU"));
                drink.setTenDU(DoUongDAO.getTenDUbyMaDU(rs.getString("MaDU")));
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
    
    public static HoaDonModel getBillbyID(String maHD){

        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM HoaDon WHERE MaHD = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maHD);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                String mahd = rs.getString("MaHD");
                String maban = rs.getString("MaBan");
                String mahv = rs.getString("MaHV");
                Date nghd = rs.getDate("NGHD");
                Date giovao = rs.getDate("giovao");
                Date giora = rs.getDate("giora");
                Double tamtinh = rs.getDouble("tamtinh");
                Double tongcong = rs.getDouble("tongcong");
                Double giamgia = rs.getDouble("giamgia");
                
                HoaDonModel bill = new HoaDonModel(mahd,maban,mahv,nghd,giovao,giora,tamtinh,tongcong,giamgia,null);
                bill.setDrinks(getDrinksList(maHD));
                return bill;
            } 
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static HoaDonModel getCurrentBillbyID(String maban){

        try{
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM HoaDon WHERE MaBan = ? AND giora IS NULL";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maban);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                String mahd = rs.getString("MaHD");
                String mahv = rs.getString("MaHV");
                Date nghd = rs.getDate("NGHD");
                Date giovao = rs.getDate("giovao");
                Double tamtinh = rs.getDouble("tamtinh");
                Double tongcong = rs.getDouble("tongcong");
                Double giamgia = rs.getDouble("giamgia");
                
                HoaDonModel bill = new HoaDonModel(mahd,maban,mahv,nghd,giovao,null,tamtinh,tongcong,giamgia,null);
                bill.setDrinks(getDrinksList(mahd));
                return bill;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
