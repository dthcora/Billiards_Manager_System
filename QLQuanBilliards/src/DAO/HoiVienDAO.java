
package DAO;

import Database.Connect_DB;
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
        try {
            Connection conn = Connect_DB.getConnection();
            String sql = "SELECT * FROM HoiVien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                HoiVienModel hv = new HoiVienModel();
                hv.setMaHV(rs.getString("MaHV"));
                hv.setTenHV(rs.getString("TenHV"));
                hv.setSdt(rs.getString("sdt"));
                hv.setNgaydky(rs.getDate("ngaydky").toLocalDate());
                hv.setTongdiem(rs.getDouble("tongdiem"));
                hv.setTonggiochoi(rs.getDouble("tonggiochoi"));
                hv.setHang(rs.getString("Hang"));

                list.add(hv);
            }
            ps.close();
            rs.close();
            conn.close();
            return list;
            
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("lỗi" + e.getMessage());
        }
        
        return list;        
    }
    public static void main(String args[]) {
        HoiVienDAO hv = new HoiVienDAO();
        System.out.println(hv.getList());
        
    }
    
}
