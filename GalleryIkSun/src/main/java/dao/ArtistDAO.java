package dao;

import java.sql.*;    
import java.util.*;

import dto.Artist;

public class ArtistDAO {
	
   private ArtistDAO() {
      
   }
   
   private static ArtistDAO instance=new ArtistDAO();
   
   public static ArtistDAO getInstance() {
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
   public List<Artist> selectAllArtists(){
      List<Artist> list=new ArrayList<Artist>();
      String sql = "select * from artist order by num desc";
      Connection conn=null;
      PreparedStatement pstmt=null;
      ResultSet rs=null;
      try {
         conn=getConnection();
         pstmt=conn.prepareStatement(sql);
         rs=pstmt.executeQuery();
         while(rs.next()) {
        	 Artist a=new Artist();
            a.setNum(rs.getInt("num"));
            a.setArtistName(rs.getString("artist_name"));
            a.setArtistPicture(rs.getString("artist_picture"));
            a.setArtistPhone(rs.getString("artist_phone"));
            a.setArtistEmail(rs.getString("artist_email"));
            a.setArtistAddress(rs.getString("artist_address"));
            a.setArtistCreatedAt(rs.getString("artist_cerated_at"));
            
            list.add(a);
         }
      }catch(Exception e) {
         System.out.println("List<Artist> 실행 중 오류 발생 : "+e);
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

    //작가 등록 기능
	public void insertArtist(Artist a) {
	   String sql="insert into artist(artist_name, artist_picture, artist_phone, artist_email, artist_address) values (?,?,?,?,?)";
	   Connection conn=null;
	   PreparedStatement pstmt=null;
	   try {
		   conn=getConnection();
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setString(1, a.getArtistName());
		   pstmt.setString(2, a.getArtistPicture());
		   pstmt.setString(3, a.getArtistPhone());
		   pstmt.setString(4, a.getArtistEmail());
		   pstmt.setString(5, a.getArtistAddress());
		   pstmt.executeUpdate();
	   }catch(Exception e) {
		   System.out.println("insertArtist(Artist) 실행 중 오류 발생 : "+e);
	   }finally {
		   try {
			   if(pstmt!=null)pstmt.close();
			   if(conn!=null)conn.close();
		   }catch(Exception e) {
			   System.out.println(e);
		   }
	   }
	}
	
	//작가 조회 기능
	public Artist selectArtistByNum(String num) {
		String sql="select * from artist where num=?";
		Artist dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new Artist();
				dto.setNum(rs.getInt("num"));
				dto.setArtistName(rs.getString("artist_name"));
				dto.setArtistPicture(rs.getString("artist_picture"));
				dto.setArtistPhone(rs.getString("artist_phone"));
				dto.setArtistEmail(rs.getString("artist_email"));
				dto.setArtistAddress(rs.getString("artist_address"));
				dto.setArtistCreatedAt(rs.getString("artist_created_at"));
			}
		}catch(Exception e) {
			System.out.println("selectArtistByNum (num) 실행 중 오류 발생 : "+e);
		}finally {
			ProductDAO.close(conn, pstmt, rs);
		}
		return dto;
	}
	
	//상품 수정 기능
	public void updateArtist(Artist dto) {
		String sql="update artist set artist_name=?, artist_picture=?, artist_phone=?, artist_email=?, artist_address=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  dto.getArtistName());
			pstmt.setString(2, dto.getArtistPicture());
			pstmt.setString(3, dto.getArtistPhone());
			pstmt.setString(4, dto.getArtistEmail());
			pstmt.setString(5, dto.getArtistAddress());
		}catch(Exception e) {
			System.out.println("updateArtist(Artist) 접속 중 오류 발생 :"+e);
		}finally {
			ProductDAO.close(conn, pstmt);
		}
	}
	
	//상품 삭제 기능
	public void deleteArtist(String num) {
		String sql="delete from artist where num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("deleteArtist(String num) 실행 중 오류 발생 : "+e);
		}finally {
			ProductDAO.close(conn, pstmt);
		}
	}
}