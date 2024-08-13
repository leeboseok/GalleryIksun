package controller;

import java.io.IOException;
  

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;

import dao.ProductDAO;
import dto.Product;

@WebServlet("/productsWrite")
public class productsWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/registerProducts.jsp");
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
		String title=multi.getParameter("title");
		String author=multi.getParameter("author");
		String picture=multi.getParameter("picture");
		int price=Integer.parseInt(multi.getParameter("price"));
		String description=multi.getParameter("description");
		String genre=multi.getParameter("genre");
		String status=multi.getParameter("status");
		
		Product dto=new Product();
		dto.setProductTitle(title);
		dto.setProductPicture("/files/"+picture);
		dto.setProductAuthor(author);
		dto.setProductPrice(price);
		dto.setProductDescription(description);
		dto.setProductGenre(genre);
		dto.setProductStatus(status);
		
		ProductDAO dao=ProductDAO.getInstance();
		dao.insertProduct(dto);
		
		response.sendRedirect("productList");
	}

}
