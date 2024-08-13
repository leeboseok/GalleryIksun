package controller;

import java.io.*;   
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import dto.Member;
import dao.MemberDAO;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login.doGet() 실행확인");
		RequestDispatcher dis=request.getRequestDispatcher("signIn.jsp");
		dis.forward(request,  response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="signIn.jsp";
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String userType=request.getParameter("userType");
		
		MemberDAO dao=MemberDAO.getInstance();
		Member member=dao.getMember(id);
		
		if(member!=null&&member.getPw().equals(pw)&&member.getUserType().equals(userType)) {
			HttpSession session=request.getSession();
			session.setAttribute("member", member);
			
			if("admin".equals(userType)) {
				response.sendRedirect("index.jsp");
				session.setAttribute("admin", userType);
			}else {
				response.sendRedirect("index.jsp");
				session.setAttribute("member", member);
			}
		}else {
			response.sendRedirect(url);
		}
	}
}
