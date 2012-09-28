/**
 * This is a demo of JFreeChart library, more examples can be found at:
 * http://www.java2s.com/Code/Java/Chart/JFreeChartSmallNumberDemo.htm
 */
@Grapes(
@Grab(group = 'jfreechart', module = 'jfreechart', version = '1.0.0')
)


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

final XYSeries series = new XYSeries("Small Numbers");
series.add(1.0E-5, 1.0E-16);
series.add(5.0E-5, 2.0E-12);
series.add(17.3E-5, 5.0E-7);
series.add(21.2E-5, 9.0E-6);
final XYSeriesCollection data = new XYSeriesCollection(series);
final JFreeChart chart = ChartFactory.createXYLineChart(
        "Small Number Demo",
        "X",
        "Y",
        data,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
);
final XYPlot plot = chart.getXYPlot();
plot.getDomainAxis().setStandardTickUnits(new StandardTickUnitSource());
plot.getRangeAxis().setStandardTickUnits(new StandardTickUnitSource());

final ChartPanel chartPanel = new ChartPanel(chart);
chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
ApplicationFrame demo = new ApplicationFrame("Simple Chart Demo")
demo.setContentPane(chartPanel);
demo.pack();
RefineryUtilities.centerFrameOnScreen(demo);
demo.setVisible(true);