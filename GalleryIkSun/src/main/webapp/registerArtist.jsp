<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>작가등록 - 관리자</title>
		<link rel="stylesheet" href="css/registerProduct.css">
	</head>
	<body>
		<div id="wrap">
			<form method="post" enctype="multipart/form-data" name="frm">
				<table>
					<tr>
						<th>작가이름</th>
						<td><input type="text" name="name"></td>
					</tr>
					
					<tr>
						<th>작가 사진</th>
						<td><input type="file" name="picture"></td>
					</tr>
					<tr>
						<th>작가 핸드폰</th>
						<td><input type="file" name="phone"></td>
					</tr>
					<tr>
						<th>작가 이메일</th>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<th>작가 주소</th>
						<td><textarea cols="80" rows="10" name="address"></textarea></td>
					</tr>
				</table>
				<br>
				<input type="submit" value="등록" onclick="return check()">
				<input type="reset" value="다시작성">
				<input type="button" value="목록보기" onclick="location.href='artistList'">
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