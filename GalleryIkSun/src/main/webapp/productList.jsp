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
				<td colspan="5" style="text-align:right;">
					<a href="productWrite">상품등록</a>
				<td>
			</tr>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>가격</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach items="${productlist }" var="product">
				<tr>
					<td>${product.getNum() }</td>
					<td>${product.getProductTitle() }</td>
					<td>${product.getProductPrice() }원</td>
					<td><a href="productUpdate?num=${product.getNum() }">상품 수정</a></td>
					<td><a href="productDelete?num=${product.getNum() }">상품 삭제</a></td>
				</tr>
			</c:forEach>
			</table>
		</div>
	</body>
</html>