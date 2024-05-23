package DAO;

import Database.Connect_DB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ThongKeDAO {

    public static Map<String, Integer> getMemberCountByRank() {
        Map<String, Integer> memberCountByRank = new HashMap<>();

        String sql = "SELECT hang, COUNT(*) as count FROM HoiVien GROUP BY hang";

        try (Connection conn = Connect_DB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String rank = rs.getString("hang");
                if (rank == null) {
                    rank = "Không xác định";
                }
                int count = rs.getInt("count");
                memberCountByRank.put(rank, count);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return memberCountByRank;
    }
    
    public static Map<String, Integer> getEmployeeCountByPosition() {
        Map<String, Integer> employeeCountByPosition = new HashMap<>();

        String sql = "SELECT chucvu, COUNT(*) as count FROM NhanVien GROUP BY chucvu";

        try (Connection conn = Connect_DB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String position = rs.getString("chucvu");
                int count = rs.getInt("count");
                employeeCountByPosition.put(position, count);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeCountByPosition;
    }

    
    public static class RevenueBreakdown {
        private double banRevenue;
        private double drinkRevenue;

        public RevenueBreakdown(double banRevenue, double drinkRevenue) {
            this.banRevenue = banRevenue;
            this.drinkRevenue = drinkRevenue;
        }

        public double getBanRevenue() {
            return banRevenue;
        }

        public double getDrinkRevenue() {
            return drinkRevenue;
        }
    }

    public static RevenueBreakdown getRevenueByDate(Date start, Date end) {
        double totalRevenue = 0;
        double drinkRevenue = 0;

        String sqlTotal = "SELECT SUM(tongcong) AS totalRevenue FROM HoaDon WHERE NGHD BETWEEN ? AND ?";
        
        String sqlDrink = "SELECT SUM(soluong * dongia) AS drinkRevenue FROM CTDU " +
                "JOIN HoaDon ON CTDU.MaHD = HoaDon.MaHD " +
                "WHERE NGHD BETWEEN ? AND ?";

        try (Connection conn = Connect_DB.getConnection();
             PreparedStatement psTotal = conn.prepareStatement(sqlTotal);
             PreparedStatement psDrink = conn.prepareStatement(sqlDrink)) {
             
            psTotal.setDate(1, start);
            psTotal.setDate(2, end);
            ResultSet rsTotal = psTotal.executeQuery();
            
            if (rsTotal.next()) {
                totalRevenue = rsTotal.getDouble("totalRevenue");
            }

            psDrink.setDate(1, start);
            psDrink.setDate(2, end);
            ResultSet rsDrink = psDrink.executeQuery();
            
            if (rsDrink.next()) {
                drinkRevenue = rsDrink.getDouble("drinkRevenue");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return new RevenueBreakdown(totalRevenue - drinkRevenue, drinkRevenue);
    }
}


