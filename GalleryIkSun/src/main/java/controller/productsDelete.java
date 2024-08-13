package controller;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.ProductDAO;
import dto.Product;

@WebServlet("/productsDelete")
public class productsDelete extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String num=request.getParameter("num");
		ProductDAO dao=ProductDAO.getInstance();
		Product dto=dao.selectProductByNum(num);
		
		request.setAttribute("product", dto);
		RequestDispatcher dispatcher=request.getRequestDispatcher("productDelete.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String num=request.getParameter("num");
		ProductDAO DAO=ProductDAO.getInstance();
		DAO.deleteProduct(num);
		
		response.sendRedirect("productList");
	}
}
