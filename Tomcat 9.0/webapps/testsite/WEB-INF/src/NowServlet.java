import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Date; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.annotation.WebServlet;

@WebServlet("/NowServ")
public class NowServlet extends HttpServlet{
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.setContentType("text/html; charset=euc-kr"); 
		PrintWriter out = response.getWriter();
		Date d = new Date();
		String str = d.toLocaleString();

		out.println("<html><head><title>Servlet����</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>���� ��¥:"+str+"</h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		//�������ؼ� class������ class ���� �Ƴ� �ֱ�
		//���� �����ѱ�
		//=>http://localhost:9090/testsite/NowServ

	}

}