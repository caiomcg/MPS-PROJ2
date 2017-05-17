package business.model;

import java.util.List;

/**
 * Created by caiomcg on 17/05/17.
 */
public abstract class StatisticsReport {

    protected abstract List<String> generateList();

    public final String generateReportHTML() {
        StringBuilder html = new StringBuilder();

        html.append( "<!doctype html>\n" );
        html.append( "<html lang='en'>\n" );
        html.append( "<head>\n" );
        html.append( "<meta charset='utf-8'>\n" );
        html.append( "<title>Report of Reports</title>\n" );
        html.append( "</head>\n\n" );
        html.append( "<body>\n" );
        html.append( "<h1>List of Reports</h1>\n" );

        // Make a list in HTML
        html.append( "<ul>\n" );
        // Loop the list of reports passed as argument.
        for ( String report : generateList() ) {
            html.append( "<li>" + report + "</li>\n" );
        }
        html.append( "</ul>\n" );
        html.append( "</body>\n\n" );

        html.append( "</html>" );

        return html.toString();
    }

}
