package sis;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vishakha Rastogi
 */
public class My_CNX {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "sis_db";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getconnection()
    {
        Connection cnx = null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }
    
}
