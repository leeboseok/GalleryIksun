<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 비밀번호 확인</title>
    <link rel="stylesheet" href="css/member_confirm.css">
</head>
<body>
    <div id="mb_confirm">
        <h1>회원 비밀번호 확인</h1>
        <p>
            <strong>비밀번호를 한번 더 입력해주세요.</strong>
        </p>
        <p>
            회원님의 정보를 안전하게 보호하기 위해 비밀번호를 한번 더 확인합니다.
        </p>
        <form>
            <input type="hidden" name="mb_id" value="admin">
        </form>
        <fieldset>
            <p><span class="confirm_id">회원아이디</span></p>
            <p><span id="mb_confirm_id">${data.getID}</span></p>
            <input type="password" placeholder="비밀번호" required>
            <input type="submit" value="확인" id="btn_submit">
        </fieldset>
    </div>
</body>
</html>