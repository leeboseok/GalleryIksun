<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Gallery Iksun 소개</title>
  <link rel="stylesheet" href="css/introduce.css">
  <script src="script/jquery-3.7.0.min.js"></script>
  <script src="script/header.js"></script>
</head>
<body>
  <header>
    <h1><a href="index.jsp"><img src="img/header.png" alt="갤러리익선"></a></h1>
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
      <a href="signIn.jsp">로그인</a>
      <a href="signUp.jsp">회원가입</a>
  </div>
    <div class="bg"></div>
</header>
<div id="wrap">

  <div class="contents">

    <div class="cont1">

      <div class="txt">
        <h1>01</h1>

        <h2>아름다움을 넘어서 미술품이
          <br>좋은 재테크가 되는 환경을 구축합니다.
        </h2>
        <p>아름다운 미술품은 생활의 여유와 내면의 평화를 줍니다.
          <br>그러나 많은 사람들은 경제적인 이유로 미술품을 쉽게 구입하는 것을 망설입니다.
          <br>갤러리K에서 수준 높은 작품을 안심하고 합리적인 가격으로 구매하여,
          <br>아름다운 작품으로부터 느끼는 행복과 함께 다양한 경제적 수익을 올릴 수 있습니다.
        </p>
      </div>
    </div>
    <div class="cont2">

      <div class="txt">
        <h1>02</h1>
        <h2>역량 있는 작가들이 창작활동에만
          <br>  집중할 수 있도록 전시 홍보, 렌탈 및 판매에
          <br>   이르기까지 모든 지원을 아끼지 않습니다.
         
        </h2>
        <p>현재의 국내 미술 시장은 대형 갤러리에서 소수의 유명 작가들의 작품들만
          <br>유통이 되고 있는 시장입니다. 갤러리K는 역량 있는 작가들을 발굴하여
          <br> 경제적인 걱정을 하지 않고 창작활동에만 집중할 수 있도록 전시, 홍보,
          <br> 렌탈 및 판매에 필요한 모든 서비스를 지원합니다.
        </p>
      </div>
    </div>
    <div class="cont3">

      <div class="txt">
        <h1>03
             
        </h1>
        <h2>한국 미술의 부흥과 세계화를 꿈꿉니다.
          
        </h2>
        <p>아름다운 미술품은 생활의 여유와 내면의 평화를 줍니다.
          <br>갤러리K는 미술과 경제의 통합을 통하여 한국미술시장의 대중화를 실현합니다.
          <br>갤러리K와 함께하면, 많은 사람들은 자신이 구입한 미술품을 감상하는 정도에서 머물지 않고 경제적 이익을 얻을 수 있고,
          <br>많은 작가들은 작품의 홍보와 판매를 걱정하지 않고 창작활동에만 집중할 수 있습니다.
          <br>이처럼 한국미술시장의 대중화를 실현함으로써, 한국 미술의 부흥을 넘어 K-POP과 같은 세계화를 꿈꿉니다.
          
        </p>
      </div>
    </div>
  </div>
</div> <!-- #wrap -->
<footer>
	<jsp:include page="footer.jsp"></jsp:include>
</footer>  
</body>
</html>