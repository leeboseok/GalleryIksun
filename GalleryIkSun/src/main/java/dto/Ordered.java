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
}
