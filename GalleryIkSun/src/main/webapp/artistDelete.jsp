<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
	<html>
		<head>
		<meta charset="UTF-8">
	<title>작가정보 삭제 - 관리자</title>
    <link rel="stylesheet" href="css/productDelete.css">
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
                            <li><a href="thema.jsp">테마별 보기</a></li>
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
                <a href="#">회원관리</a>
                <a href="#">로그아웃</a>
            </div>
            <div class="bg"></div>
        </header>
		<div id="wrap">
			<h1>작가정보 삭제 - 관리자</h1>
			<form method="post" name="frm" action="artistDelete">
				<input type="hidden" name="num" value="${artist.getNum() }">
				<input type="hidden" name="nomakeImg" value="${artist.getArtistPicture() }">
                <div class="pic">
                    <c:choose>
                        <c:when test="${artist.getArtistPicture()=='/files/null' }">
                            이미지가 없습니다.
                        </c:when>
                        <c:otherwise>
                            <img src=".${artist.getArtistPicture() }">
                        </c:otherwise>
                    </c:choose>
                </div>
                <table>
					<tr>
						<th>작가이름</th>
						<td>"${artist.getArtistName() }"</td>
					</tr>
					<tr>
						<th>작가 사진</th>
						<td>"${artist.getArtistPicture() }"</td>
					</tr>
					<tr>
						<th>작가 핸드폰</th>
						<td>"${artist.getArtistPhone() }"</td>
					</tr>
					<tr>
						<th>작가 이메일</th>
						<td>"${artist.getArtistEmail() }"</td>
					</tr>
					<tr>
						<th>작가 주소</th>
						<td><"${artist.getArtistAddress() }"</td>
					</tr>
				</table>
				<br>
                <div class="input">
                    <input type="submit" value="삭제">
                    <input type="button" value="목록" onclick="location.href='artistList'">
                </div>
			</form>
		</div>
		<footer>
			<jsp:include page="footer.jsp"></jsp:include>
       	</footer>
	</body>
</html>