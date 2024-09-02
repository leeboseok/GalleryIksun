package controller;

import java.io.IOException;   
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.BoardDAO;
import dto.Board;

@WebServlet("/boardView")
public class boardView extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("boardView.doGet() 실행확인");
		
		String num=request.getParameter("num");
		BoardDAO dao=BoardDAO.getInstance();
		Board dto=dao.selectBoardByNum(num);
		
		request.setAttribute("board", dto);
		RequestDispatcher dispatcher=request.getRequestDispatcher("communityNext.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}