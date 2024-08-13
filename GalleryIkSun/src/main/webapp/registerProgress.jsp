<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입 처리기</title>
	</head>
	<body>
		<%
			response.setCharacterEncoding("utf-8");
			String action=request.getParameter("action");
			
			if("cancel".equals(action)){
				%>
					<script>
						alert("회원가입을 취소했습니다.")
						location.href = "index.jsp";
					</script>
				<%
			} else if("sign up!".equals(action)){
				String id=request.getParameter("id");
				String pw=request.getParameter("pw");
				String pwConfirm=request.getParameter("pw_confirm");
				String nm=request.getParameter("nm");
				String phone=request.getParameter("phone");
				String email=request.getParameter("email");
				String post=request.getParameter("post");
				String address=request.getParameter("address");
				String ps=request.getParameter("postscript");
				String add2=request.getParameter("address2");
				String bank=request.getParameter("bank");
				String accountN=request.getParameter("accountnumber");
				String accountH=request.getParameter("accountholder");
				String birth=request.getParameter("birth");
				String user_type=request.getParameter("user_type");
				
				Connection conn=null;
				PreparedStatement pstmt=null;
				
				String url="jdbc:mysql://127.0.0.1:3306/gallery_iksun";
				String db_id="root";
				String db_pw="iotiot";
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn=DriverManager.getConnection(url, db_id, db_pw);
					String sql = "insert into member(id, pw, name, phone, email, post, address, ps, add2, bank, accountN, accountH, birth, user_type) " +
                            "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				    pstmt = conn.prepareStatement(sql);
	                pstmt.setString(1, id);
	                pstmt.setString(2, pw);
	                pstmt.setString(3, nm);
	                pstmt.setString(4, phone);
	                pstmt.setString(5, email);
	                pstmt.setString(6, post);
	                pstmt.setString(7, address);
	                pstmt.setString(8, ps);
	                pstmt.setString(9, add2);
	                pstmt.setString(10, bank);
	                pstmt.setString(11, accountN);
	                pstmt.setString(12, accountH);
	                pstmt.setString(13, birth);
	                pstmt.setString(14, user_type);
	                
			        int result = pstmt.executeUpdate();
					if(result>0){
						%>
							<script>
								alert("회원가입이 완료되었습니다.");
								location.href="index.jsp";
							</script>
						<%
					}else{
						%>
							<script>
								alert("회원가입 실패. 다시 시도해주세요");
								window.history.back();
							</script>
						<%
					}	
				}catch(Exception e){
					System.out.println("registerProgress.jsp 접속 중 오류 발생 : " + e);
				}finally{
					try{
						if(pstmt!=null)pstmt.close();
						if(conn!=null)conn.close();
					}catch(Exception ex){
						System.out.println("registerProgress.jsp 접속 해제 중 오류 발생 : " + ex);
					}
				}
			}
		%>
	</body>
</html>