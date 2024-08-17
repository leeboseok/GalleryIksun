package dto;

//주문 내역
public class Ordered {
	private int orderedNum;
	private int orderedProductNum; // 주문 상품 번호
	private String orderedProductQty; // 주문 수량
	private String ordererName; // 주문자 이름
	private String ordererPhone; // 주문자 전화번호
	private String ordererEmail; // 주문자 이메일
	private String recipientName; // 수령인 이름
	private String recipientAddress; // 수령 주소
	private String recipientPhone; // 수령인 전화번호
	private String recipientEmail; // 수령인 이메일
	private String orderedRequest; // 배송요청사항
	private String orderedAt; // 주문 일시
	private String status; // 결제 완료 여부 ( 번호 부여/ 결제 대기중=0, 결제 완료=1, 결제 취소=0 )
	public int getOrderedNum() {
		return orderedNum;
	}
	public void setOrderedNum(int orderedNum) {
		this.orderedNum = orderedNum;
	}
	public int getOrderedProductNum() {
		return orderedProductNum;
	}
	public void setOrderedProductNum(int orderedProductNum) {
		this.orderedProductNum = orderedProductNum;
	}
	public String getOrderedProductQty() {
		return orderedProductQty;
	}
	public void setOrderedProductQty(String orderedProductQty) {
		this.orderedProductQty = orderedProductQty;
	}
	public String getOrdererName() {
		return ordererName;
	}
	public void setOrdererName(String ordererName) {
		this.ordererName = ordererName;
	}
	public String getOrdererPhone() {
		return ordererPhone;
	}
	public void setOrdererPhone(String ordererPhone) {
		this.ordererPhone = ordererPhone;
	}
	public String getOrdererEmail() {
		return ordererEmail;
	}
	public void setOrdererEmail(String ordererEmail) {
		this.ordererEmail = ordererEmail;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientAddress() {
		return recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public String getRecipientEmail() {
		return recipientEmail;
	}
	public void setRecipientEmail(String recipientEmail) {
		this.recipientEmail = recipientEmail;
	}
	public String getOrderedRequest() {
		return orderedRequest;
	}
	public void setOrderedRequest(String orderedRequest) {
		this.orderedRequest = orderedRequest;
	}
	public String getOrderedAt() {
		return orderedAt;
	}
	public void setOrderedAt(String orderedAt) {
		this.orderedAt = orderedAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
