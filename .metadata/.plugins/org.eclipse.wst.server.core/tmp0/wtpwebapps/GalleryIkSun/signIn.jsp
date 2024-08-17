<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인</title>
		<link rel="stylesheet" href="css/signIn.css">
		<script src="script/jquery-3.7.0.min.js"></script>
		<script src="script/signIn.js"></script>
	</head>
	<body>
		<div id="wrap">
			<div id=login>
				<h1>로그인</h1>
				<h3>로그인 유형을 선택해 주세요</h3>
				<div class="login">
					<ul class="tabmenu">
						<li class="on">일반 회원 로그인</li>
						<li>관리자 로그인</li>
					</ul>
					<div class="user tabcon">
						<p class="caption"><span>일반 회원</span> 로그인 공간입니다.</p>
						<form method="post" action="login">
							<input type="text" name="id" placeholder="아이디(필수)">
							<input type="password" name="pw" placeholder="비밀번호(필수)">
							<input type="submit" value="로그인">
						</form>
					</div>
					<div class="admin tabcon">
						<p class="caption"><span>관리자</span> 로그인 공간입니다.</p>
						<form method="post" action="login">
							<input type="text" name="id" placeholder="아이디(필수)">
							<input type="password" name="pw" placeholder="비밀번호(필수)">
							<input type="submit" value="로그인">
						</form>
					</div>
				</div>
				<div class="status">
					<p>아직 회원이 아니신가요?</p> <a href="signUp.jsp">회원가입하러 가기</a>
					<p>아이디 또는 패스워드를 잊으셨나요?</p><a href="findidpw.jsp">아이디/패스워드 찾기</a>
				</div>
			</div>
		</div>
           <footer>
				<jsp:include page="footer.jsp"></jsp:include>
           </footer>		
	</body>
</html>