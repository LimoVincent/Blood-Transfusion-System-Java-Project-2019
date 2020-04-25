
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
public class JavaConnect {
 
    
    Connection conn;
    public static Connection ConnectDB() {
        
        try {
            Class.forName("org.sqlite.JDBC");
             //Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\co1601389\\OneDrive - Centria ammattikorkeakoulu Oy\\Y 3\\Java\\Blood2\\\\Filelocation2.sqlite");
            //Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Vincent Limo\\Desktop\\Vincent_Blood\\Vincent_Limo_Blood\\Filelocation2.sqlite");
             Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\\\Users\\\\Vincent Limo\\\\OneDrive - Centria ammattikorkeakoulu Oy\\\\Y 3\\\\Java\\\\Vincent_Blood\\\\Vincent_Limo_Blood\\\\Filelocation2.sqlite");
            return conn;                               
                                                                
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
    }
    

    public JavaConnect() {
        this.conn = null;

    }
    }

