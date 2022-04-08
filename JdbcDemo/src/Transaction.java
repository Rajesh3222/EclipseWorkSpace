import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="system";
		Scanner scan = new Scanner(System.in);
		 Connection con=null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		String sql1 = "update bank  set balance=? where accNo=?";
		String sql2 = "update banks set balance=? where accNo=?";
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			  con.setAutoCommit(false);
			ps1=con.prepareStatement(sql1);
			ps1.setInt(1,8000);
			ps1.setInt(2, 1111);
			ps2=con.prepareCall(sql2);
			ps2.setInt(1,2000);
			ps2.setInt(2, 4444);
			ps1.executeUpdate();
			ps2.executeUpdate();
			con.commit();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
