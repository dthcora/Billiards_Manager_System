
package Model;

import java.util.ArrayList;
import java.util.List;

public class DoUongModel {
    private String MaDU;
    private String TenDU;
    private int soluong;
    private double dongia;
    
    public static List<DoUongModel> drinks = new ArrayList<>();

    public String getMaDU() {
        return MaDU;
    }

    public void setMaDU(String MaDU) {
        this.MaDU = MaDU;
    }

    public String getTenDU() {
        return TenDU;
    }

    public void setTenDU(String TenDU) {
        this.TenDU = TenDU;
    }
    
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public double getTotal(){
        return soluong*dongia;
    }
    public static List<DoUongModel> getDrinks() {
        return drinks;
    }
}
