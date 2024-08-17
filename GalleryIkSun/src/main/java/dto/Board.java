package dto;

//게시판
public class Board {
	private int num;
	private String boardTitle; 			// 게시판 글 제목
	private String boardContent; 		// 게시판 글
	private String boardAuthor; 		// 게시판 글 작성자
	private String boardCreatedAt; 		// 게시판 글 등록 시간
	private int boardView; 				// 게시판 글 조회수
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardAuthor() {
		return boardAuthor;
	}
	public void setBoardAuthor(String boardAuthor) {
		this.boardAuthor = boardAuthor;
	}
	public String getBoardCreatedAt() {
		return boardCreatedAt;
	}
	public void setBoardCreatedAt(String boardCreatedAt) {
		this.boardCreatedAt = boardCreatedAt;
	}
	public int getBoardView() {
		return boardView;
	}
	public void setBoardView(int boardView) {
		this.boardView = boardView;
	}
	
}	