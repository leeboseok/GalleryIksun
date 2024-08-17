package dto;


//배송 정보
public class Shipping {
	private int num;
	private int shippingNum;// 배송번호
	private String trackingNumber; // 운송장 번호
	private String shippingCompany; // 배송 회사
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getShippingNum() {
		return shippingNum;
	}
	public void setShippingNum(int shippingNum) {
		this.shippingNum = shippingNum;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public String getShippingCompany() {
		return shippingCompany;
	}
	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}
}
