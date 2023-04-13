package _14_Exception;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class _18_SQLException {

	public static void main(String[] args) {
		
		try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "password");
           java.sql.Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM non_existent_table"); 
        } 
		catch (SQLException e) {
            e.printStackTrace();
        }

	}

}
