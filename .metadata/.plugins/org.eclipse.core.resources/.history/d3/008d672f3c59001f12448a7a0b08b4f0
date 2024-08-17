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
}