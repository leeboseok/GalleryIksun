<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품</title>
		<link rel="stylesheet" href="css/productList.css">
	</head>
	<body>
		<div id="wrap">
		<h1>상품 리스트</h1>
		<table>
			<tr>
				<th>제목</th>
				<th>작품</th>
				<th>작가명</th>
				<th>작품번호</th>
				<th>장르</th>
				<th>가격(원)</th>
			</tr>
			<c:forEach items="${productlist }" var="product">
				<tr>
					<td>${product.getProductTitle() }</td>
					<td><img src=".${product.getProductPicture() }"></td>
					<td>${product.getProductAuthor() }</td>
					<td>${product.getNum() }</td>
					<td>${product.getProductGenre() }</td>
					<td>${product.getProductPrice() }원</td>
					<td><a href="shop2?num=${product.getNum() }">구매하기</a></td>
				</tr>
			</c:forEach>
			</table>
		</div>
	</body>
</html>