package controller;

import java.io.IOException;    

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;

import dao.ArtistDAO;
import dto.Artist;

@WebServlet("/artistWrite")
public class artistWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/registerArtist.jsp");
				dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ServletContext context=getServletContext();
		String path=context.getRealPath("/files");
		System.out.println(path);//파일이 저장되고 있는 경로 확인
		String encType="utf-8";
		int sizeLimit=20*1024*1024;//20mb 제한
		
		//request이긴 한데 파일을 함께 받아올 수 있는 request타입
		MultipartRequest multi=new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
		String name=multi.getParameter("name");
		String picture=multi.getFilesystemName("picture");
		String phone=multi.getParameter("phone");
		String email=multi.getParameter("email");
		String address=multi.getParameter("address");
		System.out.println(picture);
		Artist dto=new Artist();
		dto.setArtistName(name);
		dto.setArtistPicture("/files/"+picture);
		dto.setArtistPhone(phone);
		dto.setArtistEmail(email);
		dto.setArtistAddress(address);
		
		ArtistDAO dao=ArtistDAO.getInstance();
		dao.insertArtist(dto);
		
		response.sendRedirect("artistList");
	}

}
