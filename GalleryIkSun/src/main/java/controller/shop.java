package controller;

import java.io.IOException;  
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.ProductDAO;
import dto.Product;

import java.util.*;

@WebServlet("/shop")
public class shop extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDAO dao=ProductDAO.getInstance();
		List<Product> productlist=dao.selectAllProducts();
		request.setAttribute("productlist", productlist);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/shop.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
