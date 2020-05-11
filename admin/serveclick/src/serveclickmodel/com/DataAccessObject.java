package serveclickmodel.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class DataAccessObject {
	public Connection dbconnect()
	{
		try {
			String dbPathName = "oracle.jdbc.OracleDriver";
			String dbUrl = "jdbc:oracle:thin:sys/oracle@localhost:1521:orcl";
			String url = "jdbc:oracle:thin:@family-pc:1521:serveclick";
			Class.forName(dbPathName);
			Connection conn = DriverManager.getConnection(url);
			if (conn != null) {
			    System.out.println("Connected");
			}
			return conn;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	}
	public static void main(String[] args) throws Exception
	{
		String dbPathName = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:sys/oracle@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@family-pc:1521:serveclick";
		String dbUrls = "jdbc:oracle:thin:sys/oracle@localhost:1521:xe";
		Class.forName(dbPathName);
		Connection conn = DriverManager.getConnection(url,"serveclick","dsas");
		if (conn != null) {
		    System.out.println("Connected");
		}
		String query = "DESCRIBE sc_users";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		System.out.println(rs);
		st.close();
		conn.close();
	}
}