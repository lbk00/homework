
import java.sql.*; 

public class Test 
{
	public static void main(String args[])
	{ 
	try{ 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con= DriverManager.getConnection(
					"jdbc:mysql://192.168.56.101:4567/madang",
					"bklee","1234"); 
		Statement stmt =con.createStatement(); 
		ResultSet rs=stmt.executeQuery("SELECT * FROM Book WHERE price < 20000"); 
		while(rs.next()) 
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" " +rs.getString(4)); 
		con.close(); 
		}catch(Exception e){ System.out.println(e);} 
	} 
}

