<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>글 상세보기</title>
		<link rel="stylesheet" href="css/productUpdate.css">
	</head>
	<body>
		<div>
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