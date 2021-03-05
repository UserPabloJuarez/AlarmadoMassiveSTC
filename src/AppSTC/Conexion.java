
package AppSTC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pjuarezc
 */
public class Conexion {
    
    public static Connection getConexion(){
        String url = "jdbc:sqlserver://10.134.16.45:1433;"
                + "databaseName=nfac;"
                + "user=xtra;"
                + "password=xtra;";
        
        try{
        
            Connection con = DriverManager.getConnection(url);
            return con;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
