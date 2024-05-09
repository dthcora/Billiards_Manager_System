
package Model;

import java.time.LocalTime;

public class CTHDModel {
    private String MaHD;
    private String MaHV;
    private String MaBan;
    private double giochoi;
    private String MaDU;
    private int soluong;
    private LocalTime giovao;
    private LocalTime giora;
    private double khuyenmai;
    private String ptthanhtoan;

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public double getGiochoi() {
        return giochoi;
    }

    public void setGiochoi(double giochoi) {
        this.giochoi = giochoi;
    }

    public String getMaDU() {
        return MaDU;
    }

    public void setMaDU(String MaDU) {
        this.MaDU = MaDU;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public LocalTime getGiovao() {
        return giovao;
    }

    public void setGiovao(LocalTime giovao) {
        this.giovao = giovao;
    }

    public LocalTime getGiora() {
        return giora;
    }

    public void setGiora(LocalTime giora) {
        this.giora = giora;
    }

    public double getKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(double khuyenmai) {
        this.khuyenmai = khuyenmai;
    }

    public String getPtthanhtoan() {
        return ptthanhtoan;
    }

    public void setPtthanhtoan(String ptthanhtoan) {
        this.ptthanhtoan = ptthanhtoan;
    }
    
}
