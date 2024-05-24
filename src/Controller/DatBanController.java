
package Controller;

import DAO.BanBilliardDAO;
import DAO.HoaDonDAO;
import DAO.HoiVienDAO;
import Model.BanBilliardModel;
import Model.DoUongModel;
import Model.HoaDonModel;
import Model.HoiVienModel;
import View.MainPanel;
import View.MenuView;
import View.SearchVIPView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class DatBanController {
    MainPanel jpnmain;
    MenuView menu;
    SearchVIPView vip;
    List<DoUongModel> drinks;

    public DatBanController(MainPanel main, MenuView menu){
        this.jpnmain = main;
        this.menu = menu;
        this.vip = new SearchVIPView();

        drinks = DoUongController.getDrinks();

        this.jpnmain.jlbPool1on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool1on, "Pool01");
            }
        });
        this.jpnmain.jlbPool2on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool2on, "Pool02");
            }
        });
        this.jpnmain.jlbPool3on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool3on, "Pool03");
            }
        });
        this.jpnmain.jlbPool4on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool4on, "Pool04");
            }
        });
        this.jpnmain.jlbPool5on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool5on, "Pool05");
            }
        });
        this.jpnmain.jlbPool6on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool6on, "Pool06");
            }
        });
        this.jpnmain.jlbPool7on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool7on, "Pool07");
            }
        });
        this.jpnmain.jlbPool8on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool8on, "Pool08");
            }
        });
        this.jpnmain.jlbPool9on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool9on, "Pool09");
            }
        });
        this.jpnmain.jlbPool10on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool10on, "Pool10");
            }
        });
        this.jpnmain.jlbPool11on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool11on, "Pool11");
            }
        });
        this.jpnmain.jlbPool12on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool12on, "Pool12");
            }
        });
        this.jpnmain.jlbPool13on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool13on, "Pool13");
            }
        });
        this.jpnmain.jlbPool14on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool14on, "Pool14");
            }
        });
        this.jpnmain.jlbPool15on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool15on, "Pool15");
            }
        });
        this.jpnmain.jlbPool16on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool16on, "Pool16");
            }
        });
        this.jpnmain.jlbPool17on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool17on, "Pool17");
            }
        });
        this.jpnmain.jlbPool18on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbPool18on, "Pool18");
            }
        });
        this.jpnmain.jlbLib1on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib1on, "Libre01");
            }
        });
        this.jpnmain.jlbLib2on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib2on, "Libre02");
            }
        });
        this.jpnmain.jlbLib3on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib3on, "Libre03");
            }
        });
        this.jpnmain.jlbLib4on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib4on, "Libre04");
            }
        });
        this.jpnmain.jlbLib5on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib5on, "Libre05");
            }
        });
        this.jpnmain.jlbLib6on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib6on, "Libre06");
            }
        });
        this.jpnmain.jlbLib7on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib7on, "Libre07");
            }
        });
        this.jpnmain.jlbLib8on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib8on, "Libre08");
            }
        });
        this.jpnmain.jlbLib9on.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                billiardMouseClick(jpnmain.jlbLib9on, "Libre09");
            }
        });
        
        this.jpnmain.jlbPool1off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool01");
                setBill(bill,jpnmain.jlbPool1on);
            }
        });
        this.jpnmain.jlbPool2off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool02");
                setBill(bill,jpnmain.jlbPool2on);
            }
        });
        this.jpnmain.jlbPool3off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool03");
                setBill(bill,jpnmain.jlbPool3on);
            }
        });
        this.jpnmain.jlbPool4off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool04");
                setBill(bill,jpnmain.jlbPool4on);
            }
        });
        this.jpnmain.jlbPool5off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool05");
                setBill(bill,jpnmain.jlbPool5on);
            }
        });
        this.jpnmain.jlbPool6off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool06");
                setBill(bill,jpnmain.jlbPool6on);
            }
        });
        this.jpnmain.jlbPool7off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool07");
                setBill(bill,jpnmain.jlbPool7on);
            }
        });
        this.jpnmain.jlbPool8off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool08");
                setBill(bill,jpnmain.jlbPool8on);
            }
        });
        this.jpnmain.jlbPool9off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool09");
                setBill(bill,jpnmain.jlbPool9on);
            }
        });
        this.jpnmain.jlbPool10off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool10");
                setBill(bill,jpnmain.jlbPool10on);
            }
        });
        this.jpnmain.jlbPool11off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool11");
                setBill(bill,jpnmain.jlbPool11on);
            }
        });
        this.jpnmain.jlbPool12off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool12");
                setBill(bill,jpnmain.jlbPool12on);
            }
        });
        this.jpnmain.jlbPool13off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool13");
                setBill(bill,jpnmain.jlbPool13on);
            }
        });
        this.jpnmain.jlbPool14off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool14");
                setBill(bill,jpnmain.jlbPool14on);
            }
        });
        
        this.jpnmain.jlbPool15off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool15");
                setBill(bill,jpnmain.jlbPool15on);
            }
        });
        this.jpnmain.jlbPool16off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool16");
                setBill(bill,jpnmain.jlbPool16on);
            }
        });
        this.jpnmain.jlbPool17off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool17");
                setBill(bill,jpnmain.jlbPool17on);
            }
        });
        this.jpnmain.jlbPool18off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Pool18");
                setBill(bill,jpnmain.jlbPool18on);
            }
        });
        this.jpnmain.jlbLib1off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre01");
                setBill(bill,jpnmain.jlbLib1on);
            }
        });
        this.jpnmain.jlbLib2off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre02");
                setBill(bill,jpnmain.jlbLib2on);
            }
        });
        this.jpnmain.jlbLib3off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre03");
                setBill(bill,jpnmain.jlbLib3on);
            }
        });
        this.jpnmain.jlbLib4off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre04");
                setBill(bill,jpnmain.jlbLib4on);
            }
        });
        this.jpnmain.jlbLib5off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre05");
                setBill(bill,jpnmain.jlbLib5on);
            }
        });
        this.jpnmain.jlbLib6off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre06");
                setBill(bill,jpnmain.jlbLib6on);
            }
        });
        this.jpnmain.jlbLib7off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre07");
                setBill(bill,jpnmain.jlbLib7on);
            }
        });
        this.jpnmain.jlbLib8off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre08");
                setBill(bill,jpnmain.jlbLib8on);
            }
        });
        this.jpnmain.jlbLib9off.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                HoaDonModel bill = HoaDonDAO.getCurrentBillbyID("Libre09");
                setBill(bill,jpnmain.jlbLib9on);
            }
        });
        this.vip.jCheckBox1.addActionListener((ActionEvent e) -> {
            if (vip.jCheckBox1.isSelected()) {
                double diem = Double.parseDouble(vip.jtfDiem.getText());
                jpnmain.jlbGiamgia.setText(String.valueOf(diem * 1000.0));
                HoiVienDAO.updateDiembySDT(vip.jtfSDT.getText());
            } else {
                jpnmain.jlbGiamgia.setText("0.0");
            }
        });
        this.vip.jbtXacnhan.addActionListener((ActionEvent e) -> {
            jpnmain.jlbVIP.setText(vip.jtfSDT.getText());
            Date currentDate = new Date();
            jpnmain.jlbNgay.setText(new SimpleDateFormat("dd/MM/yyyy").format(currentDate));
            jpnmain.jlbVao.setText(new SimpleDateFormat("HH:mm").format(currentDate));

            vip.dispose();
            
        });
        this.jpnmain.jbtXoa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jpnmain.jlbBan.setText("");
                jpnmain.jlbDongia.setText("");
                jpnmain.jlbGiamgia.setText("0.0");
                jpnmain.jlbTamtinh.setText("0.0");
                jpnmain.jlbThanhtien.setText("0.0");
                jpnmain.jlbVIP.setText("");
                jpnmain.jlbVao.setText("");
                jpnmain.jlbRa.setText("");
                jpnmain.jlbNgay.setText("");
                DoUongController.getDrinks().clear();
                DefaultTableModel model = (DefaultTableModel) jpnmain.jtbMenu.getModel();
                model.setRowCount(0);
            }
            
        });
        
    }
   
    public void addDrinksToTable(List<DoUongModel> drinks) {
        DefaultTableModel model = (DefaultTableModel) jpnmain.jtbMenu.getModel();
        model.setRowCount(0);

        for (DoUongModel drink : drinks) {
            model.addRow(new Object[] {
                drink.getTenDU(),
                drink.getSoluong(),
                drink.getDongia(),
                drink.getSoluong() * drink.getDongia()
            });
        }
        System.out.print(model.getRowCount());
    }
    
    public void billiardMouseClick(JLabel icon, String banID) {
        vip.setVisible(true);
        SearchVIPController con = new SearchVIPController(vip);
        
        for (ActionListener al : jpnmain.jbtXacnhan.getActionListeners()) {
            jpnmain.jbtXacnhan.removeActionListener(al);
        }

        this.jpnmain.jbtXacnhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BanBilliardModel ban = BanBilliardDAO.getBanbyID(banID);
                jpnmain.jlbBan.setText(ban.getMaBan());
                jpnmain.jlbDongia.setText(String.valueOf(ban.getDongia()));
                
                HoiVienModel VIP = HoiVienDAO.getVIPbySDT(jpnmain.jlbVIP.getText());
                String maban = banID;
                String mahv = (VIP != null) ? VIP.getMaHV() : "";
                Date nghd = new Date(System.currentTimeMillis());
                Date giovao = new Date(System.currentTimeMillis());
                double giamgia = Double.parseDouble(jpnmain.jlbGiamgia.getText());

                drinks = DoUongController.getDrinks();
                HoaDonModel bill = new HoaDonModel(maban, mahv, nghd, giovao, giamgia, drinks);
                HoaDonDAO.insertHoaDon(bill);

                jpnmain.jlbTamtinh.setText(String.valueOf(bill.getTamtinh()));
                jpnmain.jlbThanhtien.setText(String.valueOf(bill.getTongcong()));

                addDrinksToTable(drinks);
                icon.setVisible(false);
            }
        });
    }
    
    
    public void setBill(HoaDonModel bill, JLabel icon){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        
        if(bill == null){
            JOptionPane.showMessageDialog(menu, "không tìm thấy hóa đơn");
            return;
        }
        
        jpnmain.jlbNgay.setText(dateFormat.format(bill.getNGHD()));
        jpnmain.jlbVao.setText(timeFormat.format(bill.getGiovao()));
        jpnmain.jlbBan.setText(bill.getMaBan());
        jpnmain.jlbVIP.setText(bill.getMaHV());
        
        jpnmain.jlbDongia.setText(String.valueOf(BanBilliardDAO.getBanbyID(bill.getMaBan()).getDongia()));
        jpnmain.jlbGiamgia.setText(String.valueOf(bill.getGiamgia()));
        jpnmain.jlbTamtinh.setText(String.valueOf(bill.getTamtinh()));
        jpnmain.jlbThanhtien.setText(String.valueOf(bill.getTongcong()));
        
        addDrinksToTable(bill.getDrinks());
        
        this.jpnmain.jbtThanhtoan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Date currentDate = new Date();
                bill.setGiora(currentDate);
                bill.setTamtinh();
                bill.setTongcong();
                int i = HoaDonDAO.updateHoaDon(bill);
                System.out.println(i);
                jpnmain.jlbRa.setText(new SimpleDateFormat("HH:mm").format(currentDate));
                jpnmain.jlbTamtinh.setText(String.valueOf(bill.getTamtinh()));
                jpnmain.jlbThanhtien.setText(String.valueOf(bill.getTongcong()));
                icon.setVisible(true);
                if(i > 0){
                    JOptionPane.showMessageDialog(menu, "Thanh toán thành công");
                    double soGioChoi = bill.getSoGioChoi();
                    HoiVienDAO.updateTongSoGioChoi(bill.getMaHV(), soGioChoi);
                } else
                    JOptionPane.showMessageDialog(menu, "Thanh toán thất bại");
            }
            
        });
    }
}


