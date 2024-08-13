<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입 약관</title>
	</head>
	<body>
		<div id="wrap">
			<h1>회원가입 약관</h1>
			<form method="post" action="register.jsp" id="signupForm">
				<h2>제1조 (목적)</h2>
		        <p>
		            본 약관은 [사이트 이름] (이하 '회사')가 제공하는 모든 서비스(이하 '서비스')의 회원가입에 관한 조건과 절차, 
		            회사와 회원의 권리와 의무, 책임 사항 및 기타 필요한 사항을 규정함을 목적으로 합니다.
		        </p>
		        
		        <h2>제2조 (회원가입)</h2>
		        <p>
		            1. 회원가입은 본 약관에 동의한 후, 회사가 정한 절차에 따라 회원 가입을 신청하고 회사가 이를 승인함으로써 성립됩니다.<br>
		            2. 회원 가입을 위한 필수 정보는 다음과 같습니다: 아이디, 비밀번호, 이름, 이메일 주소 등.<br>
		            3. 회사는 회원가입 신청자의 신원 및 정보의 진위를 확인할 수 있으며, 허위 정보 입력 시 회원가입이 거부될 수 있습니다.
		        </p>
		        
		        <h2>제3조 (개인정보 처리방침)</h2>
		        <p>
		            1. 회사는 개인정보 보호 관련 법령에 따라 회원의 개인정보를 수집, 이용, 관리합니다.<br>
		            2. 개인정보의 수집 및 이용 목적, 수집 항목, 보유 및 이용 기간 등 자세한 사항은 개인정보 처리방침에서 확인할 수 있습니다.<br>
		            3. 회원은 언제든지 개인정보 열람, 수정, 삭제를 요청할 수 있으며, 회사는 이를 즉시 처리합니다.
		        </p>
		        
		        <h2>제4조 (이용자의 의무)</h2>
		        <p>
		            1. 회원은 본 약관 및 회사의 정책을 준수해야 합니다.<br>
		            2. 회원은 타인의 개인정보를 도용하거나 허위 정보를 입력해서는 안 됩니다.<br>
		            3. 회원은 서비스를 이용함에 있어 법령을 준수하고 사회적 윤리와 도덕에 맞게 행동해야 합니다.
		        </p>
		        
		        <h2>제5조 (서비스 제공의 제한)</h2>
		        <p>
		            1. 회사는 다음과 같은 경우 서비스 제공을 제한하거나 중단할 수 있습니다: 시스템 점검, 유지보수, 천재지변 등.<br>
		            2. 회사는 서비스 제공의 중단으로 인한 손해에 대해 책임을 지지 않습니다.
		        </p>
		        
		        <h2>제6조 (계약 해지 및 종료)</h2>
		        <p>
		            1. 회원은 언제든지 서비스 이용을 중단하고 계정을 해지할 수 있습니다.<br>
		            2. 회사는 회원이 본 약관을 위반한 경우, 즉시 계정을 정지하거나 해지할 수 있습니다.
		        </p>
		        
		        <h2>제7조 (면책 조항)</h2>
		        <p>
		            1. 회사는 서비스 이용과 관련하여 발생하는 회원의 손해에 대해 책임을 지지 않습니다.<br>
		            2. 회사는 서비스의 중단, 오류 등으로 인한 손해에 대해 책임을 지지 않습니다.
		        </p>
		        
		        <h2>제8조 (기타 법적 사항)</h2>
		        <p>
		            1. 본 약관에 관한 법적 사항은 대한민국 법령을 따릅니다.<br>
		            2. 본 약관과 관련하여 발생하는 모든 분쟁은 서울중앙지방법원을 제1심 법원으로 합니다.
		        </p>
		        <p>본 약관은 [시행일자]부터 시행됩니다.</p>
				<input type="checkbox" name="terms_agreed" id="terms_agreed">회원가입약관의 내용에 동의합니다.
				<table>
					<tr>
						<th>목적</th>
					</tr>
					<tr>
						<th>항목</th>
						<th>보유기간</th>
					</tr>
					<tr>
						<td>이용자 식별 및 본인여부 확인</td>
					</tr>
					<tr>
						<td>아이디, 이름, 비밀번호</td>
						<td>회원 탈퇴 시까지</td>
					</tr>
					<tr>
						<th>고객서비스 이용에 관한 통지,<br>
							CS대응을 위한 이용자 식별
						</th>
					</tr>
					<tr>
						<td>연락처(이메일, 휴대전화번호)</td>
						<td>회원 탈퇴 시까지</td>
					</tr>
				</table>
				<input type="checkbox" name="privacy_agreed" id="privacy_agreed">개인정보처리방침안내의 내용에 동의합니다.
				<input type="checkbox" id="all">전체동의
				<input type="submit" value="회원가입">
			</form>
		</div>
		<script>
			document.addEventListener('DOMContentLoaded', function(){
				const form=document.getElementById('signupForm');
				const allCheckbox=document.getElementById('all');
				const termsCheckbox=document.getElementById('terms_agreed');
				const privacyCheckbox=document.getElementById('privacy_agreed');
				
				//"전체동의" 체크박스를 클릭하면 'terms_agreed'와 'privacy_agreed'체크박스를 동시에 체크하거나 해제.
				function toggleCheckboxes(isChecked){
					termsCheckbox.checked=isChecked;
					privacyCheckbox.checked=isChecked;
				}
				
				//체크박스 상태를 확인하고 "전체동의" 체크박스 업데이트.
				function updateAllCheckbox(){
					if(termsCheckbox.checked&&privacyCheckbox.checked){
						allCheckbox.checked=true;
					}else{
						allCheckbox.checked=false;
					}
				}
				
				//폼 제출시 체크박스 상태를 확인.
				function validateForm(event){
					let messages=[];
					if(!termsCheckbox.checked&&!privacyCheckbox.checked){
						messages.push('회원가입 약관과 개인정보처리방침안내에 동의해주세요.');
					}else if(!termsCheckbox.checked){
						messages.push('회원가입 약관에 동의해주세요');
					}else if(!privacyCheckbox.checked){
						messages.push('개인정보처리방침안내에 동의해주세요.');				
					}
					
					if(messages.length>0){
						event.preventDefault();
						alert(messages.join('\n'));
					}
				}
				
				//폼 제출시 유효성 검사 수행.
				form.addEventListener('submit', validateForm);
				//"전체동의" 체크박스 상태 변경 시 두 체크박스의 상태를 동기화.
				allCheckbox.addEventListener('change', function(){
					toggleCheckboxes(this.checked);
				});
				//두개의 체크박스가 선택되었을때 "전체동의" 체크박스 활성화.
				termsCheckbox.addEventListener('change', updateAllCheckbox);
				privacyCheckbox.addEventListener('change', updateAllCheckbox);
			});
		</script>
	</body>
</html>