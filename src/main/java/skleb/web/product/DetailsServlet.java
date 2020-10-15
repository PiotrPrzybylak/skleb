package skleb.web.product;

import skleb.model.product.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/products/details")
public class DetailsServlet extends HttpServlet {

    private ProductDao productDao = new ProductDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("product", productDao.byName(request.getParameter("name")));
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/product/details.jsp").forward(request, response);
    }
}
