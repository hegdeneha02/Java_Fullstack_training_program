import java.sql.*;
public class JDBC_Demo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/JSSATE","root","Neha02@hegde");
			System.out.println("Connection Eshtablished");
			Statement st=con.createStatement();
			String sql="insert into student"+"(Regno,Name,Mark1,Mark2,Total)"+"values(6,'karan',30,30,160)";
			st.executeUpdate(sql);
			System.out.println("Insert completed");
			ResultSet rs=st.executeQuery("select*from student");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(5));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
