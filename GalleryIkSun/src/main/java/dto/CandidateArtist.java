package dto;

//작가 등록 신청자
public class CandidateArtist {
	private int num;
	private String candidateName;       // 작가 등록 신청자 이름
	private String candidatePhone; 		// 작가 등록 신청자 전화번호
	private String candidateEmail; 		// 작가 등록 신청자 이메일
	private String candidateProfile;	// 작가 등록 신청자 파일 (file로 받음)
	private String candidateCareer; 	// 작가 등록 신청자 커리어 (file로 받음)
	private String priceConfirmation;   // 가격 협상 동의서 ( file로 받음, 서식필요)
	private String candidateCreatedAt;  // 작가 등록 신청자 데이터베이스 등록 시간
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidatePhone() {
		return candidatePhone;
	}
	public void setCandidatePhone(String candidatePhone) {
		this.candidatePhone = candidatePhone;
	}
	public String getCandidateEmail() {
		return candidateEmail;
	}
	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}
	public String getCandidateProfile() {
		return candidateProfile;
	}
	public void setCandidateProfile(String candidateProfile) {
		this.candidateProfile = candidateProfile;
	}
	public String getCandidateCareer() {
		return candidateCareer;
	}
	public void setCandidateCareer(String candidateCareer) {
		this.candidateCareer = candidateCareer;
	}
	public String getPriceConfirmation() {
		return priceConfirmation;
	}
	public void setPriceConfirmation(String priceConfirmation) {
		this.priceConfirmation = priceConfirmation;
	}
	public String getCandidateCreatedAt() {
		return candidateCreatedAt;
	}
	public void setCandidateCreatedAt(String candidateCreatedAt) {
		this.candidateCreatedAt = candidateCreatedAt;
	}
	
	
}
