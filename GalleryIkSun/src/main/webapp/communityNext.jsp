<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>글 상세보기</title>
		<link rel="stylesheet" href="css/productsUpdate.css">
	        <script src="script/jquery-3.7.0.min.js"></script>
	        <script src="script/header.js"></script>
	</head>
	<body>
        <header>
            <h1><a href="#"><img src="img/header.png" alt="갤러리익선"></a></h1>
            <nav>
                <ul>
                    <li><a href="#">Gallery</a>
                        <ul class="sub">
                            <li><a href="introduce.jsp">Gallery Iksun 소개</a></li>
                            <li><a href="introduceArtists.jsp">작가별 보기</a></li>
                       <!-- <li><a href="thema.jsp">테마별 보기</a></li> -->    
                        </ul>
                    </li>
                    <li><a href="shop.jsp">미술품 구매</a>
                        <ul class="sub">
                            <li><a href="shop.jsp">원화 구입</a></li>
                            <li><a href="wishlist.jsp">장바구니</a></li>
                        </ul>
                    </li>
                    <li><a href="community.jsp">커뮤니티</a>
                        <!-- <ul class="sub">
                            <li><a href="community.jsp">게시판</a></li>
                        </ul> -->
                    </li>
                    <li><a href="mypage.jsp">마이페이지</a>
                        <ul class="sub">
                            <li><a href="myorder.jsp">주문확인</a></li>
                            <li><a href="mypage.jsp">개인정보확인</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
            <div class="right">
                <a href="signIn.jsp">로그인</a>
                <a href="signUp.jsp">회원가입</a>
            </div>
            <div class="bg"></div>
        </header>
		<div id="wrap">
	            <div class="title">
	                <h1>Q & A</h1>
	            </div>
			<table>
				<tr>
					<th>번호</th>
					<th>작성자</th>
					<th>작성시간</th>
					<th>조회수</th>
					<th>제목</th>
					<th>내용</th>
				</tr>
				<tr>
					<td>${board.getNum() }</td>
					<td>${board.getBoardAuthor() }</td>
					<td>${board.getBoardCreatedAt() }</td>
					<td>${board.getBoardView() }</td>
					<td>${board.getBoardTitle() }</td>
					<td>${board.getBoardContent() }</td>
				</tr>
			</table>
		</div>
	</body>
</html>
