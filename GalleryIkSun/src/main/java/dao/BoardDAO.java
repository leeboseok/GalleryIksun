package dao;

import java.sql.*; 
import java.util.*;

import dto.Board;

public class BoardDAO {
	private BoardDAO() {
		
	}
	private static BoardDAO instance=new BoardDAO();
	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception{
		Connection conn=null;
		String url="jdbc:mysql://127.0.0.1:3306/gallery_iksun";
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
			System.out.println("연결 해제중 오류발생 : "+e);
		}
	}
	public static void close(Connection conn, Statement stmt) {
		try {
			stmt.close();
			conn.close();
		}catch(Exception e) {
			System.out.println("연결 해제중 오류발생 : "+e);
		}
	}
	
	//게시판 글쓰기
	public void insertBoard(Board b) {
		String sql="insert into Board (board_title, board_content, board_author) values(?, ?, ?);";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  b.getBoardTitle());
			pstmt.setString(2, b.getBoardContent());
			pstmt.setString(3,  b.getBoardAuthor());
			pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("insertBoard(Board)실행 중 오류발생 : "+e);
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	//게시글 리스트
	public List<Board> selectAllBoard(int currentPage, int recordsPerPage){
		int start=currentPage*recordsPerPage-recordsPerPage;
		List<Board> list=new ArrayList<Board>();
		String sql="select * from board limit ?, ?";
		Connection conn=null; PreparedStatement pstmt=null; ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, recordsPerPage);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Board b=new Board();
				b.setNum(rs.getInt("num"));
				b.setBoardTitle(rs.getString("board_title"));
				b.setBoardAuthor(rs.getString("board_author"));
				b.setBoardContent(rs.getString("board_content"));
				b.setBoardView(rs.getInt("board_view"));
				b.setBoardCreatedAt(rs.getString("board_created_at"));
				list.add(b);
			}
		}catch(Exception e) {
			System.out.println("selectAllBoard() 접속 중 오류발생 : "+e);
		}finally {
			BoardDAO.close(conn, pstmt, rs);
		}
		return list;
	}
	
	//전체 게시물 수
	public int getCount() {
		int result=0;
		String sql="select count(num) from board;";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			rs.next();
			result=Integer.parseInt(rs.getString(1));
		}catch(Exception e) {
			System.out.println("getCount() 접속 중 오류발생 : "+e);
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {
				System.out.println("getCount() 접속 해제 중 오류발생: "+ex);
			}
		}
		return result;
	}
}
