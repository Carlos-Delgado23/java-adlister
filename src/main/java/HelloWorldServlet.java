import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;




@WebServlet ({"/hello"})
public class HelloWorldServlet extends HttpServlet {

    int pageCounter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        pageCounter++;


        String n = req.getParameter("name");
        PrintWriter out = res.getWriter();

        if (n == null ){
            out.println("<h3>Hello World!</h3>");
            out.println("<p>Page Visits =" + pageCounter+ "</p>");
        }
        res.setContentType("text/html");
        out.println("<h3>Hello " + n + "!</h3>");
        out.println("<p>Page Visits =" + pageCounter+ "</p>");
    }

}
