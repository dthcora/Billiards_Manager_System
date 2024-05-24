
package Controller;

import View.StatisticalView;

import DAO.ThongKeDAO;
import DAO.ThongKeDAO.RevenueBreakdown;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.sql.Date;
import java.util.Map;
import org.jfree.data.general.DefaultPieDataset;

public class StatisticalController {
    private StatisticalView view;
    
    public StatisticalController(StatisticalView view) {
        this.view = view;
        setEvent();
    }

    private void setEvent() {
        view.jcbOption.addActionListener(e -> {
            if (view.jcbOption.getSelectedItem().equals("Doanh thu")) {
                Date startDate = new Date(view.DateFrom.getDate().getTime());
                Date endDate = new Date(view.DateTo.getDate().getTime());
                showRevenueChart(startDate, endDate);
            }
            else if(view.jcbOption.getSelectedItem().equals("Hội viên")){
                showMemberRankChart();
            }
            else if(view.jcbOption.getSelectedItem().equals("Nhân viên")){
                showEmployeePositionChart();
            }
        });
    }

    
    private void showRevenueChart(Date startDate, Date endDate) {
        RevenueBreakdown revenue = ThongKeDAO.getRevenueByDate(startDate, endDate);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(revenue.getBanRevenue(), "Doanh thu", "Đặt bàn");
        dataset.addValue(revenue.getDrinkRevenue(), "Doanh thu", "Đặt đồ uống");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Thống kê doanh thu",
                "Loại",
                "Doanh thu",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(view.jpnView.getWidth(), view.jpnView.getHeight()));
        
        view.jpnView.removeAll();
        view.jpnView.setLayout(new BorderLayout());
        view.jpnView.add(chartPanel, BorderLayout.CENTER);
        view.jpnView.validate();
        view.jpnView.repaint();
    }
    
    private void showMemberRankChart() {
        Map<String, Integer> memberCountByRank = ThongKeDAO.getMemberCountByRank();

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entry : memberCountByRank.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Thống kê hội viên theo hạng",
                dataset,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(view.jpnView.getWidth(), view.jpnView.getHeight()));

        view.jpnView.removeAll();
        view.jpnView.setLayout(new BorderLayout());
        view.jpnView.add(chartPanel, BorderLayout.CENTER);
        view.jpnView.validate();
        view.jpnView.repaint();
    }
    
    private void showEmployeePositionChart() {
        Map<String, Integer> employeeCountByPosition = ThongKeDAO.getEmployeeCountByPosition();

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Integer> entry : employeeCountByPosition.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Thống kê nhân viên theo chức vụ",
                dataset,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(view.jpnView.getWidth(), view.jpnView.getHeight()));

        view.jpnView.removeAll();
        view.jpnView.setLayout(new BorderLayout());
        view.jpnView.add(chartPanel, BorderLayout.CENTER);
        view.jpnView.validate();
        view.jpnView.repaint();
    }
}

