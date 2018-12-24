package WordAnalyzer;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AnalyzeServlet extends HttpServlet{
	
	String word = "";
	int option;
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		word = request.getParameter("word");
		option = Integer.parseInt(request.getParameter("options"));
		
		PrintWriter out = response.getWriter();
		
		out.println("word: " + word);
		out.println(AnalyzeWord.analyze(word, option));
	}
	
	
}
