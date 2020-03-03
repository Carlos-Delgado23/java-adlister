import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/store")
public class ItemsIndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        // factory gets the dao object
        Items itemsDao = ItemsDaoFactory.getItemsDao();
        // dao method to get all the ads
        List<Item> items = itemsDao.all();
        // data passes to the jsp
        session.setAttribute("items", items);
        request.getRequestDispatcher("/shopping/index.jsp").forward(request, response);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response){
//        HttpSession session = request.getSession();
//        Items itemsDao = ItemsDaoFactory.getItemsDao();
//        List<Item> items = itemsDao.all();
//        session.setAttribute("items", items);
//    }
}
