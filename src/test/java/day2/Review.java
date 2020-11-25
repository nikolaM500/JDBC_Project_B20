package day2;

import java.sql.*;

public class Review {

    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@52.201.187.226:1521:XE";
        String username = "hr" ;
        String password = "hr" ;

        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;
        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM JOBS") ;

        // I want to read the first row
        rs.next() ;
        System.out.println("First column value in Jobs " + rs.getString(1)  );
        System.out.println("Second column value in Jobs " + rs.getString(2)  );

        // move to row number 7 and get above 2 columns values
        rs.absolute(7) ;
        System.out.println("First column value in Jobs in row 7 " + rs.getString(1)  );
        System.out.println("Second column value in Jobs in row 7 " + rs.getString(2)  );

        rs.last() ;
        System.out.println("First column value in Jobs in last row " + rs.getString(1)  );
        System.out.println("Second column value in Jobs in last row " + rs.getString(2)  );

        rs.previous();
        System.out.println("First column value in Jobs in 2nd row from last  " + rs.getString(1)  );
        System.out.println("Second column value in Jobs in 2nd row from last  " + rs.getString(2)  );





    }

}
