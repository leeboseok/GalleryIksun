package dao;

import java.sql.*; 
import java.util.*;

import dto.Product;

public class ProductDAO {
   private ProductDAO() {
      
   }
   
   private static ProductDAO instance=new ProductDAO();
   
   public static ProductDAO getInstance() {
      return instance;
   }
   
   public Connection getConnection() throws Exception{
      Connection conn=null;
      String url="jdbc:mysql://127.0.0.1:3306/gallery_Iksun";
      String db_id="root";
      String db_pw="iotiot";
      
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn=DriverManager.getConnection(url, db_id, db_pw);
      return conn;
   }
   
   public static void close(Connection conn, Statement stmt, ResultSet rs) {
      try {
         rs.close();
         stmt.close();
         conn.close();
      }catch(Exception e) {
         System.out.println("연결 해제 중 오류발생: "+e);
      }
   }
   public static void close(Connection conn, Statement stmt) {
      try {
         stmt.close();
         conn.close();
      }catch(Exception e) {
         System.out.println("연결 해제 중 오류 발생: " +e);
      }
   }
   
   //상품 리스트
   public List<Product> selectAllProducts(){
      List<Product> list=new ArrayList<Product>();
      String sql = "select * from product order by num desc";
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      try {
         conn=getConnection();
         pstmt=conn.prepareStatement(sql);
         rs=pstmt.executeQuery();
         while(rs.next()) {
            Product p=new Product();
            p.setNum(rs.getInt("num"));
            p.setProductTitle(rs.getString("productTitle"));
            p.setProductAuthor(rs.getString("productAuthor"));
            p.setProductPicture(rs.getString("productPicture"));
            p.setProductPrice(rs.getInt("productPrice"));
            p.setProductDescription(rs.getString("productDescription"));
            p.setProductGenre(rs.getString("productGenre"));
            p.setProductCreatedAt(rs.getString("productCreatedAt"));
         }
      }catch(Exception e) {
         System.out.println("List<Product> 실행 중 오류 발생 : "+e);
      }finally {
         try {
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(conn!=null)rs.close();
         }catch(Exception e) {
            System.out.println(e);
         }
      }
      return list;
   }

    //상품 등록 기능
	public void insertProduct(Product p) {
	   String sql="insert into product (product_title, product_author, product_price, product_picture, product_description, product_genre, product_status) values (?,?,?,?,?,?,?)";
	   Connection conn=null;
	   PreparedStatement pstmt=null;
	   try {
		   conn=getConnection();
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setString(1, p.getProductTitle());
		   pstmt.setString(2, p.getProductAuthor());
		   pstmt.setInt(3, p.getProductPrice());
		   pstmt.setString(4, p.getProductPicture());
		   pstmt.setString(5, p.getProductDescription());
		   pstmt.setString(6, p.getProductGenre());
		   pstmt.setString(7, p.getProductStatus());
	   }catch(Exception e) {
		   System.out.println("insertProduct(Product) 실행 중 오류 발생 : "+e);
	   }finally {
		   try {
			   if(pstmt!=null)pstmt.close();
			   if(conn!=null)conn.close();
		   }catch(Exception e) {
			   System.out.println(e);
		   }
	   }
	}
	
	//상품 조회 기능
	public Product selectProductByNum(String num) {
		String sql="select * from product where num=?";
		Product dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new Product();
				dto.setNum(rs.getInt("num"));
				dto.setProductTitle(rs.getString("productTitle"));
				dto.setProductAuthor(rs.getString("productAuthor"));
				dto.setProductPicture(rs.getString("productPicture"));
				dto.setProductDescription(rs.getString("productDescription"));
				dto.setProductGenre(rs.getString("productGenre"));
				dto.setProductStatus(rs.getString("productStatus"));
			}
		}catch(Exception e) {
			System.out.println("selectProductByNum (num) 실행 중 오류 발생 : "+e);
		}finally {
			ProductDAO.close(conn, pstmt, rs);
		}
		return dto;
	}
	
	//상품 수정 기능
	public void updateProduct(Product dto) {
		String sql="update product set product_title=?, product_author=?, product_picture=?, product_price=?, product_description=?, product_genre=?, product_status=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  dto.getProductTitle());
			pstmt.setString(2, dto.getProductAuthor());
			pstmt.setString(3, dto.getProductPicture());
			pstmt.setInt(4, dto.getProductPrice());
			pstmt.setString(5, dto.getProductDescription());
			pstmt.setString(6,  dto.getProductGenre());
			pstmt.setString(7, dto.getProductStatus());
		}catch(Exception e) {
			System.out.println("updateProduct(Product) 접속 중 오류 발생 :"+e);
		}finally {
			ProductDAO.close(conn, pstmt);
		}
	}
	
	//상품 삭제 기능
	public void deleteProduct(String num) {
		String sql="delete from product where num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("deleteProduct(String num) 실행 중 오류 발생 : "+e);
		}finally {
			ProductDAO.close(conn, pstmt);
		}
	}
}