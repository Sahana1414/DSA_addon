package connect;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Insert_db {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/trial_db";
			String username="root";
			String password="";
			Connection con=DriverManager.getConnection(url, username, password);
			Statement stmt=con.createStatement();
			String query="insert into student values(1,'Roshna',9),(2,'Sahana',10),(3,'Bavyaa', 5)";
			stmt.executeUpdate(query);
			System.out.println("inserted successfully");
				
					
			
		}

	}


