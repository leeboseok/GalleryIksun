<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gallery Iksun</title>
    <link rel="stylesheet" href="css/index.css">
    <script src="script/jquery-3.7.0.min.js"></script>
    <script src="script/index.js"></script>
</head>
<body>
	<%
		String userType=(String)session.getAttribute("userType");
	%>
    <div id="wrap">
        <div id="main">
            <div class="page1">
                <header>
                    <h1><a href="index.jsp"><img src="img/header.png" alt="갤러리익선"></a></h1>
                    <nav>
                        <ul>
                        <%
                        	if(userType!=null&&userType.equals("admin")){
                        		%>
                        			<li><a href="productList">상품관리</a></li>
                        		<%
                        	}
                        %>
                            <li><a href="introduce.jsp">Gallery</a>
                                <ul class="sub">
                                    <li><a href="introduce.jsp">Gallery Iksun 소개</a></li>
                                    <li><a href="introduceArtists.jsp">작가별 보기</a></li>
                                </ul>
                            </li>
                            <li><a href="shop.jsp">미술품 구매</a>
                                <ul class="sub">
                                    <li><a href="shop.jsp">원화 구입</a></li>
                                    <li><a href="wishlist.jsp">장바구니</a></li>
                                </ul>
                            </li>
                            <li><a href="boardList">커뮤니티</a></li>
                            <li><a href="mypage.jsp">마이페이지</a>
                                <ul class="sub">
                                    <li><a href="myorder.jsp">주문확인</a></li>
                                    <li><a href="mypage.jsp">개인정보확인</a></li>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                    <div class="right">
                       <%
                       	if(userType!=null){
                       		
                       	}else{
                       		%>
                       			<a href="login">로그인</a>
                            	<a href="signUp.jsp">회원가입</a>
                       		<%
                       	}
                       %>
                        	
                    </div>
                    <div class="bg"></div>
                </header>
                <div class="slide">
                    <ul>
                        <li class="s1"></li>
                        <li class="s2"></li>
                        <li class="s3"></li>
                    </ul>
                </div>
                <!-- <div class="goshop">
                    <a href="#">
                        <p>
                            구매 바로가기<br>
                            >>>
                        </p>
                    </a>
                </div> -->
            </div>
            <div class="page2">
                <div class="gall">
                    <div class="text">
                        <h1>Best Collection</h1>
                        <p></p>
                    </div>
                    <div class="pics">
                        <div class="pic1">
                            <a href="#">
                                <img src="img/phj58-50.jpg" alt="혜진">
                            </a>
                        </div>
                        <div class="pic2">
                            <a href="#">
                                <img src="img/jkh35-33.jpg" alt="소윤">
                            </a>
                        </div>
                        <div class="pic3">
                            <a href="#">
                                <img src="img/kyj-317786.jpg" alt="온일">
                            </a>
                        </div>
                    </div>
                    <div class="desc">
                        <div class="desc1">
                            <a href="#">
                                <p class="p_artist">혜진 <span>박호자</span></p>
                                <p class="p_title">어머니의 봄날1</p>
                                <p class="p_price">가격: </p>
                                <p class="p_size">크기: </p>
                            </a>
                        </div>
                        <div class="desc2">
                            <a href="#">
                                <p class="p_artist">소윤 <span>정경화</span></p>
                                <p class="p_title">웃는 고양이</p>
                                <p class="p_price">가격: </p>
                                <p class="p_size">크기: </p>
                            </a>
                        </div>
                        <div class="desc3">
                            <a href="#">
                                <p class="p_artist">온일 <span>김용재</span></p>
                                <p class="p_title">나팔꽃1</p>
                                <p class="p_price">가격: </p>
                                <p class="p_size">크기: </p>
                            </a>
                        </div>
                    </div>
                    <!-- <div class="more">
                        <a href="#"><h4>더 많은 작품 보기</h4></a>
                    </div> -->
                </div>
                <footer>
                    <div class="flogo">
                        <h1><a href="index.jsp"><img src="img/footer.png" alt="갤러리익선"></a></h1>
                    </div>
                    <div class="fcopy">
                        <ul>
                            <li><a href="gallery.jsp">회사소개</a></li>
                            <li><a href="privacyPolicy.jsp">개인정보 처리방침</a></li>
                            <li class="last"><a href="termsUse.jsp">이용약관</a></li>
                        </ul>
                        <p>Copyright(c) Gallery Iksun. All rights reserved.</p>
                    </div>
                    <div class="fsns">
                        <ul>
                            <li><a href="#"></a></li>
                            <li><a href="#"></a></li>
                            <li><a href="#"></a></li>
                        </ul>
                    </div>
                </footer>
            </div>
        </div>
    </div>
    <script>
        window.addEventListener("wheel",function(e){    //슬라이드바 없애고 고정창이 움직이지 않게 하는 함수
            e.preventDefault(); //화면의 스크롤기능 제거 (그런데 이것만 가지고는 구글 브라우저가 가진 패시브모드 발동해서 이게 안먹힘)
        },{passive:false});     //브라우저의 패시브기능 제거
        var wrap=document.getElementById("wrap");
        var posY=0;             //지금 현재 보여주고있는 페이지의 위치
        wrap.addEventListener("wheel",function(e){
            if($("#main").is(":animated")){
                console.log("1");
                return; //밑에 실행하지말고 그냥 끝내버리라는 뜻
            }
            move(e);
        });
        function move(e){
            console.log(e.deltaY+"1111");
            if(e.deltaY > 0){
                posY -= 100;
            }else if(e.deltaY < 0){
                posY += 100;
            }
            if(posY>0){
                posY=0;
            }
            if(posY<-100){
                posY=-100;
            }
            console.log(posY);
            $("#main").animate({"top":posY+"%"},1000);
        }
    </script>
</body>
</html>