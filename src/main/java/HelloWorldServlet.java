import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;




@WebServlet ({"/hello", "/hello?name=", "/count"})
public class HelloWorldServlet extends HttpServlet {

    int pageCounter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        pageCounter++;
        res.setContentType("text/html");

        String n = req.getParameter("name");
        PrintWriter out = res.getWriter();

        if (n.length() > -2 ){
            out.println("<h3>Hello World!</h3>");
            out.println("<p>Page Visists =" + pageCounter+ "</p>");
        } else {
            out.println("<h3>Hello " + n + "!</h3>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        pageCounter++;

        String counter = req.getParameter("count");
        PrintWriter out = res.getWriter();

        out.println("<h4>Page count is: " + counter + "<h4>");
    }
}
