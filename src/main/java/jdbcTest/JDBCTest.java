package jdbcTest;

import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","mysql");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select gameId,gameName from sakila.gamesdata");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2));   // using column index
//				System.out.println(rs.getInt("gameId")+"   "+rs.getString("gameName"));    // using Column name
				
			}
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
