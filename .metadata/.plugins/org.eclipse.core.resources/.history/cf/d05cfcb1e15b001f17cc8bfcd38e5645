package controller;

import java.io.*;    
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;

import dao.ProductDAO;
import dto.Product;

@WebServlet("/productUpdate")
public class productUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("num");
		ProductDAO dao=ProductDAO.getInstance();
		Product dto=dao.selectProductByNum(num);
		
		request.setAttribute("product", dto);
		RequestDispatcher dispatcher=request.getRequestDispatcher("productUpdate.jsp");
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
		String title=multi.getParameter("title");
		String author=multi.getParameter("author");
		String picture=multi.getFilesystemName("picture");
		int price=Integer.parseInt(multi.getParameter("price"));
		String description=multi.getParameter("description");
		String genre=multi.getParameter("genre");
		String status=multi.getParameter("status");
		if(picture==null) {
			picture=multi.getParameter("nomakeImg");
		}
		
		Product dto=new Product();
		dto.setNum(Integer.parseInt(num));
		dto.setProductTitle(title);
		dto.setProductAuthor(author);
		dto.setProductPicture("/files/"+picture);
		dto.setProductPrice(price);
		dto.setProductDescription(description);
		dto.setProductGenre(genre);
		ProductDAO dao=ProductDAO.getInstance();
		dao.updateProduct(dto);
		
		response.sendRedirect("productList");
	}

}
