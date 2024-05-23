package DAO;

import Database.Connect_DB; // Giả sử bạn có lớp này để kết nối đến CSDL
import Model.HoiVienModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoiVienDAO {

    public static List<HoiVienModel> getList(){
        List<HoiVienModel> list = new ArrayList<>();
        try (Connection conn = Connect_DB.getConnection(); 
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM HoiVien");
             ResultSet rs = ps.executeQuery()) {

            while(rs.next()){
                HoiVienModel hv = new HoiVienModel(
                    rs.getString("MaHV"),
                    rs.getString("TenHV"),
                    rs.getString("sdt"),
                    rs.getDate("ngaydky").toLocalDate(),
                    rs.getDouble("tongdiem"),
                    rs.getDouble("tonggiochoi"),
                    rs.getString("hang")
                ); 
                list.add(hv);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    public static int insertHoiVien(HoiVienModel hv) {
        String sql = "INSERT INTO HoiVien (MaHV, TenHV, sdt, ngaydky, tongdiem, tonggiochoi, hang) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Connect_DB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, hv.getMaHV());
            ps.setString(2, hv.getTenHV());
            ps.setString(3, hv.getSdt());
            ps.setDate(4, java.sql.Date.valueOf(hv.getNgaydky()));
            ps.setDouble(5, hv.getTongdiem());
            ps.setDouble(6, hv.getTonggiochoi());
            ps.setString(7, hv.getHang());

            int rowsAffected = ps.executeUpdate();
            conn.commit();
            return rowsAffected > 0 ? 1 : 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int deleteHoiVien(String maHV) {
        try (Connection conn = Connect_DB.getConnection();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM HoiVien WHERE MaHV = ?")) {

            ps.setString(1, maHV);
            int check = ps.executeUpdate();
            return check > 0 ? 1 : 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int updateHoiVien(HoiVienModel hv) {
        try (Connection conn = Connect_DB.getConnection();
             PreparedStatement ps = conn.prepareStatement("UPDATE HoiVien SET TenHV=?, sdt=?, ngayDK=?, tongDiem=?, tongGioChoi=?, hang=? WHERE MaHV=?")) {

            ps.setString(1, hv.getTenHV());
            ps.setString(2, hv.getSdt());
            ps.setDate(3, java.sql.Date.valueOf(hv.getNgaydky()));
            ps.setDouble(4, hv.getTongdiem());
            ps.setDouble(5, hv.getTonggiochoi());
            ps.setString(6, hv.getHang());
            ps.setString(7, hv.getMaHV());

            int check = ps.executeUpdate();
            return check > 0 ? 1 : 0; 

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
