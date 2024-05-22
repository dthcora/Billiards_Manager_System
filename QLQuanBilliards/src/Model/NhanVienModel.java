
package Model;

import DAO.NhanVienDAO;
import java.time.LocalDate;
import java.util.List;

public class NhanVienModel {
    private String MaNV;
    private String TenNV;
    private String sdt;
    private LocalDate ngayVL;
    private String diachi;
    private String chucvu;
    private double hsluong;
    private double giolam;
    
    public NhanVienModel(String maNV, String tenNV, String sdt, LocalDate ngayVL, String diachi, String chucvu, double hsluong, double giolam) {
        this.MaNV = maNV;
        this.TenNV = tenNV;
        this.sdt = sdt;
        this.ngayVL = ngayVL;
        this.diachi = diachi;
        this.chucvu = chucvu;
        this.hsluong = hsluong;
        this.giolam = giolam;
    }
    
    public NhanVienModel(){}; 
    
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public double getHsluong() {
        return hsluong;
    }

    public void setHsluong(double hsluong) {
        this.hsluong = hsluong;
    }

    public double getGiolam() {
        return giolam;
    }

    public void setGiolam(double giolam) {
        this.giolam = giolam;
    }

    public LocalDate getNgayVL() {
        return ngayVL;
    }

    public void setNgayVL(LocalDate ngayVL) {
        this.ngayVL = ngayVL;
    }

    public static List<NhanVienModel> getAllNhanVien() {
        return NhanVienDAO.getList();
    }
    
}
