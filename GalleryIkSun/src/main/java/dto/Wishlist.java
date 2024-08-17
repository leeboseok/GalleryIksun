package dto;

//장바구니
public class Wishlist {
	private int num;
	private String wishlistId; 		// 아이디 ( 세션으로 회원등급을 받음 마크업 필요 없음)
	private int wishlistProductNum;		// 상품 번호
	private String wishlistProductTitle;	// 상품 제목
	private String wishlistProductPrice;	// 상품 가격
	private String wishlistproductStatus; 	// 판매 상태 (번호 부여 / 판매중=0, 판매완료=1)
	private String wishlistMemberName; 	// 장바구니 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(String wishlistId) {
		this.wishlistId = wishlistId;
	}
	public int getWishlistProductNum() {
		return wishlistProductNum;
	}
	public void setWishlistProductNum(int wishlistProductNum) {
		this.wishlistProductNum = wishlistProductNum;
	}
	public String getWishlistProductTitle() {
		return wishlistProductTitle;
	}
	public void setWishlistProductTitle(String wishlistProductTitle) {
		this.wishlistProductTitle = wishlistProductTitle;
	}
	public String getWishlistProductPrice() {
		return wishlistProductPrice;
	}
	public void setWishlistProductPrice(String wishlistProductPrice) {
		this.wishlistProductPrice = wishlistProductPrice;
	}
	public String getWishlistproductStatus() {
		return wishlistproductStatus;
	}
	public void setWishlistproductStatus(String wishlistproductStatus) {
		this.wishlistproductStatus = wishlistproductStatus;
	}
	public String getWishlistMemberName() {
		return wishlistMemberName;
	}
	public void setWishlistMemberName(String wishlistMemberName) {
		this.wishlistMemberName = wishlistMemberName;
	}
}