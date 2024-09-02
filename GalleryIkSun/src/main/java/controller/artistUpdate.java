package controller;

import java.io.*;      
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;

import dao.ArtistDAO;
import dto.Artist;

@WebServlet("/artistUpdate")
public class artistUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("num");
		ArtistDAO dao=ArtistDAO.getInstance();
		Artist dto=dao.selectArtistByNum(num);
		
		request.setAttribute("artist", dto);
		RequestDispatcher dispatcher=request.getRequestDispatcher("artistUpdate.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ServletContext context=getServletContext();
		String path=context.getRealPath("files");
		System.out.println("업로드 경로 확인 : "+path);
		String encType="utf-8";
		int sizeLimit=20*1024*1024;
		MultipartRequest multi=new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
		
		String num=multi.getParameter("num");
		String name=multi.getParameter("name");
		String picture=multi.getFilesystemName("picture");
		String phone=multi.getParameter("phone");
		String email=multi.getParameter("email");
		String address=multi.getParameter("address");
		if(picture==null) {
			picture=multi.getParameter("nomakeImg");
		}
		
		Artist dto=new Artist();
		dto.setNum(Integer.parseInt(num));
		dto.setArtistName(name);
		dto.setArtistPicture("/files/"+picture);
		dto.setArtistPhone(phone);
		dto.setArtistEmail(email);
		dto.setArtistAddress(address);
		ArtistDAO dao=ArtistDAO.getInstance();
		dao.updateArtist(dto);
		
		response.sendRedirect("artistList");
	}

}
