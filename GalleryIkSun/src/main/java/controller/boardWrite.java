package controller;

import java.io.*; 
    
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import dto.Board;
import dao.BoardDAO;

@WebServlet("/boardWrite")
public class boardWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("boardWrite.doGet() 실행확인");
		RequestDispatcher dis=request.getRequestDispatcher("write.jsp");
		dis.forward(request,  response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String boardTitle=request.getParameter("boardTitle");
		String boardContent=request.getParameter("boardContent");
		String boardAuthor=request.getParameter("boardAuthor");
		Board dto=new Board();
		dto.setBoardTitle(boardTitle);
		dto.setBoardContent(boardContent);
		dto.setBoardAuthor(boardAuthor);
		BoardDAO dao=BoardDAO.getInstance();
		dao.insertBoard(dto);
		response.sendRedirect("boardList");
	}	
}