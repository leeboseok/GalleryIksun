<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>글쓰기</title>
	</head>
	<body>
		<div id="wrap">
			<form method="post" action="boardWrite">
				제목<input type="text" name="boardTitle">
				내용<input type="text" name="boardContent">
				글쓴이<input type="text" name="boardAuthor">
				<input type="submit" value="제출!">
			</form>
		</div>
	</body>
</html>