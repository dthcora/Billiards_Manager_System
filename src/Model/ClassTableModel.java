
package Model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ClassTableModel {
    //bảng hội viên
    public DefaultTableModel setTableHoiVien(List<HoiVienModel> listItem, String[] listColumn) {
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows > 0){
            for(int i = 0; i < rows; i++){
                HoiVienModel hv = listItem.get(i);
                obj = new Object[columns];
                obj[0] = hv.getMaHV();
                obj[1] = hv.getTenHV();
                obj[2] = hv.getSdt();
                obj[3] = hv.getNgaydky();
                obj[4] = hv.getTongdiem();
                obj[5] = hv.getTonggiochoi();
                obj[6] = hv.getHang();
                dtm.addRow(obj);
            }
        }
        return dtm;
    } 
    //bảng nhân viên
    public DefaultTableModel setTableNhanVien(List<NhanVienModel> listItem, String[] listColumn) {
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows > 0){
            for(int i = 0; i < rows; i++){
                NhanVienModel nv = listItem.get(i);
                obj = new Object[columns];
                obj[0] = nv.getMaNV();
                obj[1] = nv.getTenNV();
                obj[2] = nv.getSdt();
                obj[3] = nv.getNgayVL();
                obj[4] = nv.getDiachi();
                obj[5] = nv.getChucvu();
                obj[6] = nv.getHsluong();
                obj[7] = nv.getGiolam();
                dtm.addRow(obj);
            }
        }
        return dtm;
    } 
    //bảng hóa đơn
    
    
} 

