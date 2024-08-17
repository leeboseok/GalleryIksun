<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <title>작가 소개</title>
        <script src="script/jquery-3.7.0.min.js"></script>
        <script src="script/header.js"></script>
        <link rel="stylesheet" href="css/shop_product.css">         
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
                <h1>원화 구입</h1>
            </div>
            <div class="product">
                <div class="pic">
                    <img src="img/2019_jks_sunflower.jpg" alt="해바라기">
                </div>
                <div class="info">
                    <div class="p_title">
                        <p>해바라기</p>
                    </div>
                    <table>
                        <tr>
                            <th>작가명</th>
                            <td>조경심</td>
                            <th>작품번호</th>
                            <td>00001</td>
                        </tr>
                        <tr>
                            <th>작품크기</th>
                            <td>70X70</td>
                            <th>재료</th>
                            <td>장지에채색</td>
                        </tr>
                        <tr class="price">
                            <th>가격(원)</th>
                            <td colspan="3">5,000,000</td>
                        </tr>
                    </table>
                    <div class="btns">
                        <input type="button" value="바로구매">    
                        <input type="button" value="장바구니">    
                        <input type="button" value="위시리스트"> 
                        <input type="button" value="공유하기">   
                    </div>
                </div>                            
            </div>
            <hr>
            <h1>작가 소개</h1>
            <div class="desc_artist">
                <div class="a_pic">
                    <img src="img/artist_jks.jpg" alt="조경심">
                </div>
                <div class="a_intro">
                    <p class="a_name">조경심</p>
                    <p>개인전 10회</p>
                    <p>(사)한국미술협회 문인화분과 부이사장</p>
                    <p>(사)한국미술협회 초대작가</p>
                    <p>대한민국미술대전 운영, 심사위원 역임</p>
                </div>
            </div>
            <hr>
            <div class="order_process">
                <h1>작품 구매 및 배송안내</h1>
                <div class="steps">
                    <h2>미술품 구매 계약 체결</h2>
                    <p>홈페이지를 통해 작품을 구매하고 결제를 합니다.</p>
                    <p>작품을 배송받을 주소를 입력합니다.</p>
                    <p>결제 익일에 미술품 구매계약서를 전자계약서로 발송합니다.</p>
                </div>
                <div class="caution">
                    <h2>배송 관련 유의사항</h2>
                    <p>공휴일 제외, 영업일 기준 2-3일 이내 배송기사님께서 고객님께 연락을 드립니다.</p>
                    <p>배송 후, 단순 변심으로 인한 반품은 불가합니다.</p>
                </div>
            </div>
        </div>
        <footer>
            <jsp:include page="footer.jsp"></jsp:include>
        </footer>
        
    </body>
</html>