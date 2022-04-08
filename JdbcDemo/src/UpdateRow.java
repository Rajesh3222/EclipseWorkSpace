import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		Scanner scan = new Scanner(System.in);
		 Connection con=null;
		PreparedStatement ps = null;
		try{
			System.out.println("Please enter id from which row you want to update?");
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("Please Enter new  name ");
			String name= scan.nextLine();
			System.out.println("please Enter new  city");
			String city=scan.nextLine();
			String sql="update student set name=?, city=? where id =?";
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setInt(3, id);
		 ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	finally{
		try {
			con.close();
			
			ps.close();
			scan.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}
