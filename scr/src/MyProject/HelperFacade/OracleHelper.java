package MyProject.HelperFacade;

import java.sql.Connection;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/20/2021
 */
public class OracleHelper {

    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

}