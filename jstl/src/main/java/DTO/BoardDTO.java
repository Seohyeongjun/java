package DTO;

public class BoardDTO {
	private int board_id;
	private String writer;
	private String title;
	private String content;
	private int hit;
	
	public BoardDTO(String writer, String title, String content) {
		this.writer=writer;
		this.title=title;
		this.content=content;
	}
	public BoardDTO(int board_id, String writer, String title, String content, int hit) {
		this(writer, title, content);
		this.board_id=board_id;
		this.hit=hit;
	}
	

}
