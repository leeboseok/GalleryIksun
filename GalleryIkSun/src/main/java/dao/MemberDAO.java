package dao;

import java.sql.*;
import dto.Member;

public class MemberDAO {
	private MemberDAO() {
		
	}
	
	private static MemberDAO instance=new MemberDAO();
	
	public static MemberDAO getInstance() {
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
	
	//회원가입 처리
	public int insertMember(Member m) {
		int result=-1;
		String sql="insert into member (name, id, pw, birth, phone, email, post, address, address_detail, bank, account_number, account_handler, user_type) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getId());
			pstmt.setString(3, m.getPw());
			pstmt.setString(4, m.getBirth());
			pstmt.setString(5, m.getPhone());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getPost());
			pstmt.setString(8, m.getAddress());
			pstmt.setString(9, m.getAddressDetail());
			pstmt.setString(10, m.getBank());
			pstmt.setString(11, m.getAccountNumber());
			pstmt.setString(12, m.getAccountHandler());
			pstmt.setString(13, m.getUserType());
			result=pstmt.executeUpdate();
			System.out.println(sql);
		}catch(Exception e) {
			System.out.println("insertMember(Member) 회원가입 중 오류 발생 : "+e);
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return result;
	}
	
	//사용자 정보 조회
	public Member getMember(String id) {
		Member m=null;
		String sql="select * from member where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				m=new Member();
				m.setNum(rs.getInt("num"));
				m.setName(rs.getString("name"));
				m.setId(rs.getString("id"));
				m.setPw(rs.getString("pw"));
				m.setBirth(rs.getString("birth"));
				m.setPhone(rs.getString("Phone"));
				m.setEmail(rs.getString("email"));
				m.setPost(rs.getString("post"));
				m.setAddress(rs.getString("address"));
				m.setAddressDetail(rs.getString("address_detail"));
				m.setBank(rs.getString("bank"));
				m.setAccountNumber(rs.getString("account_number"));
				m.setAccountHandler(rs.getString("account_handler"));
				m.setUserType(rs.getString("user_type"));
				m.setCreatedAt(rs.getString("created_at"));
				m.setStatus(rs.getString("status"));
			}
		}catch(Exception e) {
			System.out.println("getMember(id) 정보조회 중 오류 발생 : "+e);
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return m;
	}
	
	//사용자 인증
	public int userCheck(String id, String pw) {
		int result=-1;
		String sql="select pw from member where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,  id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString("pw").equals(pw) && rs.getString("pw")!=null) {
					result=1;
				}else {
					result=0;
				}
			}else {
				result=-1;
			}
		}catch(Exception e) {
			System.out.println("userCheck(id,pw) 로그인 인증 중 오류발생 : "+e);
		}finally {
			try {
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return result;
	}
	
	//아이디 중복체크 처리
	public int confirmID(String id) {
		int result=-1;
		String sql="select id from member where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				result=1;
			}else {
				result=-1;
			}
		}catch(Exception e) {
			System.out.println("MemberDAO confirmID(id) error : "+e);
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {
				System.out.println("MemberDAO confirmID(id) close error : "+ex);
			}
		}
		return result;
	}
}