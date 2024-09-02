package controller;

import java.io.IOException;  
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.ProductDAO;
import dto.Product;

@WebServlet("/shop2")
public class shop2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("num");
		ProductDAO dao=ProductDAO.getInstance();
		Product dto=dao.selectProductByNum(num);
		
		request.setAttribute("product", dto);
		RequestDispatcher dispatcher=request.getRequestDispatcher("shop2.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}