package Book07_page709.Chapter02_page721.CreatingServlets.HelloWorldServlet;

import java.io.IOException;
import java.io.PrintWriter;
	public class HelloWorld extends HttpServlet
	{
		public void doGet(HttpServletResponse response)
				throws IOException {
			response.getClass();
			PrintWriter out = null;
			try {
				response.wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			out.println("<html>");
			out.println("<head>");
			out.println("<title>HelloWorld</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Hello, World!</h1>");
			out.println("</body>");
			out.println("</html>");
		}

	}

	/*
	In most cases, you don’t want to send simple text back to the browser. Instead,
	you want to send formatted HTML.To do that, you must first tell the response
	object that the output is in HTML format. You can do that by calling the set
	ContentType method, passing the string "text/html" as the parameter. Then you
	can use the PrintWriter object to send HTML.
	 */
