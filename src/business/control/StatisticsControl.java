package business.control;

import business.model.PlaylistReport;
import business.model.StatisticsReport;
import business.model.UserReport;

/**
 * Created by Marcelo on 17/05/2017.
 */
public class StatisticsControl {

    private StatisticsReport statisticsReport;
    private static StatisticsControl instance = new StatisticsControl();

    public static StatisticsControl getInstance() {
        return instance;
    }

    private StatisticsControl(){}

    public String generateUserHTMLReport() {
        statisticsReport = new UserReport();

        return statisticsReport.generateReportHTML();
    }

    public String generatePlaylistHTMLReport() {
        statisticsReport = new PlaylistReport();

        return statisticsReport.generateReportHTML();
    }
}
