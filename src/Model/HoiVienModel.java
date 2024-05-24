
package Model;

import DAO.HoiVienDAO;
import java.time.LocalDate;
import java.util.List;


public class HoiVienModel {
    private String MaHV;
    private String TenHV;
    private String sdt;
    private LocalDate ngaydky;
    private double tongdiem;
    private double tonggiochoi;
    private String hang;

    public HoiVienModel(String MaHV, String TenHV, String sdt, LocalDate ngaydky, double tongdiem, double tonggiochoi, String hang) {
        this.MaHV = MaHV;
        this.TenHV = TenHV;
        this.sdt = sdt;
        this.ngaydky = ngaydky;
        this.tongdiem = tongdiem;
        this.tonggiochoi = tonggiochoi;
        this.hang = hang;
    }
    
    public HoiVienModel(){}; 
    
    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public String getTenHV() {
        return TenHV;
    }

    public void setTenHV(String TenHV) {
        this.TenHV = TenHV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public void setTongdiem(double tongdiem) {
        this.tongdiem = tongdiem;
    }

    public double getTonggiochoi() {
        return tonggiochoi;
    }

    public void setTonggiochoi(double tonggiochoi) {
        this.tonggiochoi = tonggiochoi;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public LocalDate getNgaydky() {
        return ngaydky;
    }

    public void setNgaydky(LocalDate ngaydky) {
        this.ngaydky = ngaydky;
    }

    public static List<HoiVienModel> getAllHoiVien(){
        return HoiVienDAO.getList();
    }
    
    
}

