package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.ui.ApplicationFrame;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    public void execute() {
        setVisible(true);
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(5, "", "gmail.com");
        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(7, "", "ull.es");
        dataSet.addValue(2, "", "hotmail.com");
        return dataSet;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma JFreeChart", "Dominios email", "Nº de emails",
                dataSet, PlotOrientation.VERTICAL, false, false, false);
        return chart;
    }   
    
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
}