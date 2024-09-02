package controller;

import java.io.IOException;   
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.ArtistDAO;
import dto.Artist;

import java.util.*;

@WebServlet("/artistList")
public class artistList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArtistDAO dao=ArtistDAO.getInstance();
		List<Artist> artistlist=dao.selectAllArtists();
		request.setAttribute("artistlist", artistlist);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/artistList.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
