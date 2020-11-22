package day1;

import java.sql.*;

public class MovingResultSetPointer {

    public static void main(String[] args) throws SQLException {

        // we want to create a statement object that generate
        // ResultSet that can move forward and backward anytime
        String connectionStr = "jdbc:oracle:thin:@52.201.187.226:1521:XE";
        String username = "hr" ;
        String password = "hr" ;

        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;
        Statement stmnt = conn.createStatement();
        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM REGIONS") ;


    }

}
