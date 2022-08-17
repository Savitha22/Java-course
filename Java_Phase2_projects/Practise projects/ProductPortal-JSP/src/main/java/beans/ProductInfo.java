package beans;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ProductInfo")
public class ProductInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProductInfo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		int productid=Integer.parseInt(request.getParameter("product_id"));
		String productname=request.getParameter("product_name");
		int Price=Integer.parseInt(request.getParameter("price"));
		int Quantity=Integer.parseInt(request.getParameter("quantity"));
		
		HttpSession session=request.getSession();  
        session.setAttribute("product_id",  productid);

        session.setAttribute("product_name",  productname);

        session.setAttribute("price",  Price);

        session.setAttribute("quantity",  Quantity);
        response.sendRedirect("portal.jsp");  
	}

}
