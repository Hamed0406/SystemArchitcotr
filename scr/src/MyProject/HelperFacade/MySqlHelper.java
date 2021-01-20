package MyProject.HelperFacade;

import java.sql.Connection;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/20/2021
 */
public class MySqlHelper {

    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
}