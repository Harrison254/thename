
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import sun.util.logging.PlatformLogger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harry
 */
public class Database_mysql {
    
    //JDBC driver name and database URL
    //static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/dbDatabase";
    static final String USER = "root";
    static final String PASSWORD = "root123";
    
    public static void main(String args[]) throws SQLException{
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            //load the driver class
            Class.forName(DRIVER);
            //establish connection
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            
            //create statement for quering database
            statement = (Statement) statement.executeQuery("SELECT * FROM tblDatabase");
            
            //process query results
            int i = 0;
            while(resultSet.next()){
                String author = (String) resultSet.getObject(2);
                String title = (String) resultSet.getObject(3);
                System.out.printf("%s: %s\n",author, title);
            }
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLExxception ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

