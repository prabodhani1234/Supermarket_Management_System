
package Test;

import java.sql.Connection;
import java.sql.DriverManager;



public class DatabaseConnecting {
    static Connection conection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketsystem","root","");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
