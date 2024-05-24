
package DAO;

import Database.Connect_DB;
import Model.NhanVienModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class NhanVienDAO {

    public static List<NhanVienModel> getList(){
        List<NhanVienModel> list = new ArrayList<>();
        try {
            Connection conn = Connect_DB.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM NhanVien");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                NhanVienModel nv = new NhanVienModel(
                rs.getString("MaNV"),
                rs.getString("TenNV"),
                rs.getString("sdt"),
                rs.getDate("ngayVL").toLocalDate(),
                rs.getString("diachi"),
                rs.getString("chucvu"),
                rs.getDouble("hsluong"),
                rs.getDouble("giolam")
            ); 

                list.add(nv);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return list;        
    }
    public static int insertNhanVien(NhanVienModel nv) {
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "INSERT INTO NhanVien (MaNV,TenNV,sdt,ngayVL,diachi,chucvu,hsluong,giolam) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1,nv.getMaNV());
            ps.setString(2,nv.getTenNV());
            ps.setString(3,nv.getSdt());
            ps.setDate(4, java.sql.Date.valueOf(nv.getNgayVL()));
            ps.setString(5,nv.getDiachi());
            ps.setString(6,nv.getChucvu());
            ps.setDouble(7,nv.getHsluong());
            ps.setDouble(8,nv.getGiolam());
            
            int check = ps.executeUpdate();
            ps.close();
            conn.close();
            if(check > 0)
                return 1;
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public static int deleteNhanVien(String maNV) {
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "DELETE FROM NhanVien WHERE MaNV = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maNV);
            
            int check = ps.executeUpdate();
            if(check > 0)
                return 1;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public static int updateNhanVien(NhanVienModel nv) {
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "UPDATE NhanVien SET TenNV=?, sdt=?, ngayVL=?, diachi=?, chucvu=?, hsluong=?, giolam=? WHERE MaNV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nv.getTenNV());
            ps.setString(2, nv.getSdt());
            ps.setDate(3, java.sql.Date.valueOf(nv.getNgayVL()));
            ps.setString(4, nv.getDiachi());
            ps.setString(5, nv.getChucvu());
            ps.setDouble(6, nv.getHsluong());
            ps.setDouble(7, nv.getGiolam());
            ps.setString(8, nv.getMaNV());
            
            int check = ps.executeUpdate();
            if(check >0) 
                return 1;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }    
}

