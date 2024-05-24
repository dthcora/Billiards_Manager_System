
package Model;

import DAO.BanBilliardDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public final class HoaDonModel {
    private String MaHD;
    private String MaBan;
    private String MaHV;
    private Date NGHD;
    private Date giovao;
    private Date giora;
    private double tamtinh;
    private double tongcong;
    private double giamgia;
    private List<DoUongModel> drinks;

    public HoaDonModel(String MaHD, String MaBan, String MaHV, Date NGHD, Date giovao, Date giora, double tamtinh, double tongcong, double giamgia, List<DoUongModel> drinks) {
        this.MaHD = MaHD;
        this.MaBan = MaBan;
        this.MaHV = MaHV;
        this.NGHD = NGHD;
        this.giovao = giovao;
        this.giora = giora;
        this.tamtinh = tamtinh;
        this.tongcong = tongcong;
        this.giamgia = giamgia;
        this.drinks = (drinks != null) ? drinks : new ArrayList<>();
    }

    public HoaDonModel(String MaBan, String MaHV, Date NGHD, Date giovao, double giamgia, List<DoUongModel> drinks) {
        this.MaBan = MaBan;
        this.MaHV = MaHV;
        this.NGHD = NGHD;
        this.giovao = giovao;
        this.giamgia = giamgia;
        this.drinks = (drinks != null) ? drinks : new ArrayList<>();
        setTamtinh();
        setTongcong();
        
    }
    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public Date getNGHD() {
        return NGHD;
    }

    public void setNGHD(Date NGHD) {
        this.NGHD = NGHD;
    }

    public Date getGiovao() {
        return giovao;
    }

    public void setGiovao(Date giovao) {
        this.giovao = giovao;
    }

    public Date getGiora() {
        return giora;
    }

    public void setGiora(Date giora) {
        this.giora = giora;
    }

    public double getTamtinh() {
        return tamtinh;
    }

    public void setTamtinh() {
        double kq = 0;
        for (DoUongModel drink : drinks) {
            kq += drink.getSoluong() * drink.getDongia();
        }
        BanBilliardModel ban = BanBilliardDAO.getBanbyID(MaBan);

        if (ban != null) {
            if (giovao != null && giora != null) {
                long duration = giora.getTime() - giovao.getTime(); 
                double hours = (double) duration / (1000 * 60 * 60); 
                kq += hours * ban.getDongia();
            }
        }

        this.tamtinh = kq;
    }
    public double getSoGioChoi() {
        if (giovao != null && giora != null) {
            long duration = giora.getTime() - giovao.getTime(); 
            return (double) duration / (1000 * 60 * 60); // Chuyển đổi từ milliseconds sang hours
        }
        return 0.0;
    }




    public double getTongcong() {
        return tongcong;
    }

    public void setTongcong() {
        this.tongcong = tamtinh - giamgia;
    }

    public double getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }

    public List<DoUongModel> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<DoUongModel> drinks) {
        this.drinks = drinks;
    }
    
}
