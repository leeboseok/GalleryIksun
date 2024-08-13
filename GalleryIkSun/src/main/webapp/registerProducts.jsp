<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품등록 - 관리자</title>
		<link rel="stylesheet" href="css/registerProduct.css">
	</head>
	<body>
		<div id="wrap">
			<form method="post" enctype="multipart/form-data" name="frm">
				<table>
					<tr>
						<th>상품명</th>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<th>사진</th>
						<td><input type="file" name="picture"></td>
					</tr>
					<tr>
						<th>가격</th>
						<td><input type="text" name="price">원</td>
					</tr>
					<tr>
						<th>설명</th>
						<td><textarea cols="80" rows="10" name="description"></textarea></td>
					</tr>
					<tr>
						<th>장르</th>
						<td>
							<input type="radio" name="genre" value="동양화">동양화
							<input type="radio" name="genre" value="서양화">서양화
						</td>
					</tr>
				</table>
				<br>
				<input type="submit" value="등록" onclick="return check()">
				<input type="reset" value="다시작성">
				<input type="button" value="목록보기" onclick="location.href='productList'">
			</form>
		</div>
		<script>
			function check(){
				if(document.frm.name.value.length==0){
					alert("상품명을 써주세요.");
					frm.name.focus();
					return false;
				}
				if(document.frm.price.value.length==0){
					alert("가격을 써주세요");
					frm.price.focus();
					return false;
				}
				if(isNan(document.frm.price.value)){
					alert("숫자를 입력해야 합니다.");
					frm.price.focus();
					return false;
				}
				return true;
			}
		</script>
	</body>
</html>