package dto;

//상품
public class Product {
	private int num;
	private String productTitle;
	private String productAuthor;
	private String productPicture;
	private int productPrice;
	private String productDescription;
	private String productGenre;
	private String productCreatedAt;
	private String productStatus;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getProductAuthor() {
		return productAuthor;
	}
	public void setProductAuthor(String productAuthor) {
		this.productAuthor = productAuthor;
	}
	public String getProductPicture() {
		return productPicture;
	}
	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductGenre() {
		return productGenre;
	}
	public void setProductGenre(String productGenre) {
		this.productGenre = productGenre;
	}
	public String getProductCreatedAt() {
		return productCreatedAt;
	}
	public void setProductCreatedAt(String productCreatedAt) {
		this.productCreatedAt = productCreatedAt;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	
}
