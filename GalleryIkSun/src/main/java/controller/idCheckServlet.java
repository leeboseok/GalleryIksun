package controller;

import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.MemberDAO;
@WebServlet("/idCheck.do")
public class idCheckServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		MemberDAO mDAO=MemberDAO.getInstance();
		int result=mDAO.confirmID(id);
		request.setAttribute("id", id);;
		request.setAttribute("result", result);
		RequestDispatcher dis=request.getRequestDispatcher("idCheck.jsp");
		dis.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
}
