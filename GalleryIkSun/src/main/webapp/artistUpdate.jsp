<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>작가정보 수정</title>
		<link rel="stylesheet" href="css/productsUpdate.css">
	</head>
	<body>
		<div id="wrap">
			<h1>작가정보 수정</h1>
			<form method="post" enctype="multipart/form-data" name="frm" action="artistUpdate">
				<input type="hidden" name="num" value="${artist.getNum() }">
				<input type="hidden" name="nonmakeImg" value="${artist.getArtistPicture() }">
				<table>
					<tr>
						<td>
							<c:choose>
								<c:when test="${artist.getArtistPicture()=='/files/null' }">
									이미지가 없습니다.
								</c:when>
								<c:otherwise>
									<img src=".${artist.getArtistPicture() }">
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<table>
								<tr>
									<th>작가이름</th>
									<td><input type="text" name="name" value="${artist.getArtistName() }"></td>
								</tr>
								
								<tr>
									<th>작가 사진</th>
									<td><input type="file" name="picture" value="${artist.getArtistPicture() }"></td>
								</tr>
								<tr>
									<th>작가 핸드폰</th>
									<td><input type="file" name="phone" value="${artist.getArtistPhone() }"></td>
								</tr>
								<tr>
									<th>작가 이메일</th>
									<td><input type="text" name="email" value="${artist.getArtistEmail() }"></td>
								</tr>
								<tr>
									<th>작가 주소</th>
									<td><input type="text" name="address" value="${artist.getArtistAddress() }"></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<input type="submit" value="수정">
				<input type="reset" value="다시작성">
				<input type="button" value="목록" onclick="location.href='artistList'">
			</form>
		</div>
		<script>
			function check(){
				if(document.frm.name.value.length==0){
					alert("작가이름을 입력해주세요.");
					frm.name.focus();
					return false;
				}
				if(document.frm.phone.value.length==0){
					alert("작가 전화번호를 입력해주세요.");
					frm.price.focus();
					return false;
				}
				if(document.frm.email.value.length==0){
					alert("작가 이메일을 입력해주세요.");
					frm.price.focus();
					return false;
				}
				if(document.frm.address.value.length==0){
					alert("작가 주소를 입력해주세요.");
					frm.price.focus();
					return false;
				}
				return true;
			}
		</script>
	</body>
</html>
