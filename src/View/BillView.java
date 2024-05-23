
package View;

import controller.HoaDonController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class BillView extends JPanel {
    public final JTable table;
    public final DefaultTableModel tableModel;
    public final JTextField jtfSearch;
    public final JPanel panelTable;
    public HoaDonController control;

    public BillView() {
        this.setBackground(new Color(218, 200, 242));

        jtfSearch = new JTextField();
        jtfSearch.setBackground(new Color(255, 255, 255));
        jtfSearch.setFont(new Font("Arial", Font.PLAIN, 14));
        jtfSearch.setPreferredSize(new Dimension(220, 30)); 


        panelTable = new JPanel();
        panelTable.setBackground(new Color(218, 200, 242));

        tableModel = new DefaultTableModel(new Object[]{"Mã hóa đơn", "Mã bàn", "Mã hội viên", "Ngày", "Tổng"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        

        GroupLayout layout = new GroupLayout(panelTable);
        panelTable.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jtfSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(scrollPane)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(jtfSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(scrollPane)
        );

        setLayout(new BorderLayout());
        add(panelTable, BorderLayout.CENTER);

        this.setVisible(true);
        control = new HoaDonController(this);
    }
}


