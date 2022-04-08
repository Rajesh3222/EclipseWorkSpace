import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;

public class InsertData {
public static void main(String[] args) {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String password="system";
	Scanner scan = new Scanner(System.in);
	 Connection con=null;
	PreparedStatement ps = null;
	try{
		
		String sql="insert into student values(?,?,?)";
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		ps=con.prepareStatement(sql);
		System.out.println("please Enter the number of rows you want to add");
		int n = scan.nextInt();
		for(int i =1; i<=n;i++){
		System.out.println("Please enter id?");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Please Enter  name ");
		String name= scan.nextLine();
		System.out.println("please Enter city");
		String city=scan.nextLine();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, city);
		 ps.addBatch();
		 ps.executeBatch();
		}
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