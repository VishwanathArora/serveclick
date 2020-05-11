package serveclick.com;
import serveclickmodel.com.*;
import java.io.IOException;
import org.json.JSONObject;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet
{
private serveclickmodel.com.DataAccessObject conn;
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
//	{
//		int i = Integer.parseInt(req.getParameter("name1"));
//		PrintWriter out = res.getWriter();
//		out.print("result"+i);
//	}
	@SuppressWarnings("deprecation")
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
//		int i = Integer.parseInt(req.getParameter("name1"));
		HttpSession session = req.getSession();
		session.setAttribute("k", 1);
//		res.sendRedirect("redirect");
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("Country");
		PrintWriter out = res.getWriter();
	    JSONObject documentObj = null;
	    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	    //documentObj = new JSONObject(intArray);	    
		//String s = new String("{interests : [{interestKey:Dogs}, {interestKey:Cats}]}");
	    JSONObject obj = new JSONObject();
	    DataAccessObject conn = this.DataAccessObject();
	    	
	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));

	      System.out.print(obj);
	    res.setContentType("application/json");
		res.setCharacterEncoding("UTF-8");
		out.print(obj);
		out.flush();
//		out.print("result"+i);
	}
	private DataAccessObject DataAccessObject()
	{
		conn = new DataAccessObject();
		conn.dbconnect();
		return conn;
	}
}
