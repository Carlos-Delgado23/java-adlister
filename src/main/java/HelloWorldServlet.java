import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<< HEAD

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");
=======
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
>>>>>>> 0ab36395e56ff83dbe9b79c7d3b141fcd0dc5ca2
    }

}
