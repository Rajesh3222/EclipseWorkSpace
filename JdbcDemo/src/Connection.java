import java.sql.DriverManager;

public class Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system" ;
		String password="system";
try{
	// 1. loading the driver
	Class.forName(Driver);
	//2.Establish connection
	DriverManager.getConnection(url,user ,password);
	System.out.println("connection established successfully!");
}
catch(Exception e){
	e.printStackTrace();
}
	}

}
