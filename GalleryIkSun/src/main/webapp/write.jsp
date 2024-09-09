<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <title>커뮤니티 - 글쓰기</title>
        <script src="script/jquery-3.7.0.min.js"></script>
        <script src="script/header.js"></script>
        <link rel="stylesheet" href="css/write.css">         
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
			<form method="post" action="boardWrite">
				<p><span>제목</span><input type="text" name="boardTitle"></p>
				<p><span>글쓴이</span><input type="text" name="boardAuthor"></p>
				<p><span>내용</span><textarea name="boardContent"></textarea></p>
				<input type="submit" value="작성완료">
			</form>
		</div>
	</body>
</html>
