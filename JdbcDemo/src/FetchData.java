import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		int i;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the id from which you want to invoke information");
		i= scan.nextInt();
		String sql = "select * from student where id=?";
		Connection con = null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		
		try{
			//1. load the driver
			Class.forName(driver);
			//2. Establish connection
			 con =DriverManager.getConnection(url, user, password);
			//3.creating medium
			 ps =con.prepareStatement(sql);
			ps.setInt(1, i);
			//3.wrap the data
			 rs=ps.executeQuery();
		
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
				rs.close();
				ps.close();
				scan.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
