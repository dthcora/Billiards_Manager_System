
package controller;

import DAO.HoaDonDAO;
import Model.DoUongModel;
import Model.HoaDonModel;
import View.BillView;
import View.CTHDView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class HoaDonController {
    private final BillView view;
    private JTable table;
    private final List<HoaDonModel> Bills;
    private TableRowSorter<TableModel> rowSorter;

    public HoaDonController(BillView view) {
        this.view = view;
        this.table = view.table;
        this.Bills = HoaDonDAO.getAllBill();

        this.rowSorter = new TableRowSorter<>(table.getModel());
	table.setRowSorter(rowSorter);
        
        view.jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = view.jtfSearch.getText();
                if(text.trim().length() == 0){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = view.jtfSearch.getText();
                if(text.trim().length() == 0){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            
            }
            
        });
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable) e.getSource();
                    int row = target.getSelectedRow();
                    int modelRow = target.convertRowIndexToModel(row);

                    if (modelRow >= 0) {
                        String maHD = (String) table.getModel().getValueAt(modelRow, 0);
                        HoaDonModel selectedBill = HoaDonDAO.getBillbyID(maHD);
                        if (selectedBill != null) {
                            CTHDView cthdView = new CTHDView();
                            setCTHDViewData(cthdView, selectedBill);
                            cthdView.setVisible(true);
                        }
                    }
                }
            }
        });
        
        loadHoaDonData();
    }
    private void setCTHDViewData(CTHDView cthdView, HoaDonModel bill) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

        cthdView.jlbMahd.setText(bill.getMaHD());
        cthdView.jlbNgay.setText(dateFormat.format(bill.getNGHD()));
        cthdView.jlbVao.setText(timeFormat.format(bill.getGiovao()));
        cthdView.jlbRa.setText(bill.getGiora() != null ? timeFormat.format(bill.getGiora()) : "");
        cthdView.jlbBan.setText(bill.getMaBan());
        cthdView.jlbHv.setText(bill.getMaHV());
        cthdView.jlbTamtinh.setText(String.valueOf(bill.getTamtinh()));
        cthdView.jlbGiam.setText(String.valueOf(bill.getGiamgia()));
        cthdView.jlbTien.setText(String.valueOf(bill.getTongcong()));

        List<DoUongModel> drinks = HoaDonDAO.getDrinksList(bill.getMaHD());
        DefaultTableModel drinksTableModel = (DefaultTableModel) cthdView.jtbMenu.getModel();
        drinksTableModel.setRowCount(0);
        for (DoUongModel drink : drinks) {
            drinksTableModel.addRow(new Object[]{
                    drink.getTenDU(),
                    drink.getSoluong(),
                    drink.getDongia(),
                    drink.getDongia() * drink.getSoluong()
            });
        }
    }


    private void loadHoaDonData() {
        DefaultTableModel tableModel = (DefaultTableModel) view.tableModel;
        tableModel.setRowCount(0); 

        for (HoaDonModel bill : Bills) {
            tableModel.addRow(new Object[]{
                    bill.getMaHD(),
                    bill.getMaBan(),
                    bill.getMaHV(),
                    bill.getNGHD(),
                    bill.getTongcong()
            });
        }
    }
}

