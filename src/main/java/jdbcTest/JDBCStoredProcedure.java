package jdbcTest;

import java.sql.*;

public class JDBCStoredProcedure {

	public static void main(String[] args) {
		 try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","mysql");
			
			CallableStatement stmtSp=con.prepareCall("call sp_GetMovies()");
			 ResultSet rs=stmtSp.executeQuery();
			 while(rs.next())
			 {
				 System.out.println(rs.getString(1)+" :: "+rs.getString(2)+":: "+rs.getDate(3)+" :: "+rs.getString(4));
			 }
			 con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
