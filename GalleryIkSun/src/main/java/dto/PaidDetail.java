package dto;

//결제 내역
public class PaidDetail {
	private int num;
	private int paidProduct; 		// 결제 상품(상품 번호) foreign key (paidProduct) references (product) num;
	private int paidProductQty; 	// 결제 상품 수량
	private int paidAmount; 		// 결제한 총 금액
	private String ordererName;		// 주문자 이름
	private String paidMethod; 		// 결제 수단
	private String paidAt; 			// 결제 시간
	private String paidStatus; 		// 결제 상태( 번호 부여/ 결제 완료=1, 결제 취소=2 )
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPaidProduct() {
		return paidProduct;
	}
	public void setPaidProduct(int paidProduct) {
		this.paidProduct = paidProduct;
	}
	public int getPaidProductQty() {
		return paidProductQty;
	}
	public void setPaidProductQty(int paidProductQty) {
		this.paidProductQty = paidProductQty;
	}
	public int getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getOrdererName() {
		return ordererName;
	}
	public void setOrdererName(String ordererName) {
		this.ordererName = ordererName;
	}
	public String getPaidMethod() {
		return paidMethod;
	}
	public void setPaidMethod(String paidMethod) {
		this.paidMethod = paidMethod;
	}
	public String getPaidAt() {
		return paidAt;
	}
	public void setPaidAt(String paidAt) {
		this.paidAt = paidAt;
	}
	public String getPaidStatus() {
		return paidStatus;
	}
	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}
	
}