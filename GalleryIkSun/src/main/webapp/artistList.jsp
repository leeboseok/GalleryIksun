<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>작가목록</title>
		<!-- <link rel="stylesheet" href="css/productList.css"> -->
	</head>
	<body>
		<div id="wrap">
		<h1>작가 리스트</h1>
		<table>
			<tr>
				<td>
					<a href="artistWrite">작가등록</a>
				<td>
			</tr>
			<tr>
				<th>번호</th>
				<th>작가이름</th>
				<th>작가사진</th>
				<th>작가핸드폰</th>
				<th>작가이메일</th>
				<th>작가주소</th>
				<th>작가등록일시</th>
			</tr>
			<c:forEach items="${artistlist }" var="artist">
				<tr>
					<td>${artist.getNum() }</td>
					<td>${artist.getArtistName() }</td>
					<td><img src=".${artist.getArtistPicture() }"></td>
					<td>${artist.getArtistPhone() }</td>
					<td>${artist.getArtistEmail() }</td>
					<td>${artist.getArtistAddress() }</td>
					<td>${artist.getArtistCreatedAt() }</td>
					<td><a href="artistUpdate?num=${artist.getNum() }">작가정보 수정</a></td>
					<td><a href="artistDelete?num=${artist.getNum() }">작가정보 삭제</a></td>
				</tr>
			</c:forEach>
			</table>
		</div>
	</body>
</html>