package controller;

import java.io.*;  
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.ArtistDAO;
import dto.Artist;

@WebServlet("/artistDelete")
public class artistDelete extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String num=request.getParameter("num");
		ArtistDAO dao=ArtistDAO.getInstance();
		Artist dto=dao.selectArtistByNum(num);
		
		request.setAttribute("artist", dto);
		RequestDispatcher dispatcher=request.getRequestDispatcher("artistDelete.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String num=request.getParameter("num");
		ArtistDAO dao=ArtistDAO.getInstance();
		dao.deleteArtist(num);
		
		response.sendRedirect("artistList");
	}
}
