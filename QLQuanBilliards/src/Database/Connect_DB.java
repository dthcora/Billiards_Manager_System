
package Database;

import java.sql.*;


public class Connect_DB {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver"); 
            String url = "jdbc:oracle:thin:@localhost:1521:databaseqlbi"; 
            String uname = "system";
            String upass = "tuntun2809";
            conn = DriverManager.getConnection(url, uname, upass);
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void closeConnection(Connection conn){
        try {
            if(conn != null)
                conn.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void print(Connection conn){
        try {
            if(conn != null){
                DatabaseMetaData mtdt = conn.getMetaData();
                System.out.println(mtdt.getDatabaseProductName());
                System.out.println(mtdt.getDatabaseProductVersion());
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        
        print(getConnection());
    }
}
