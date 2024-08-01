package membership;

public class BookLoanList {

	private String bookCode;
	private String bookName;
	
	public BookLoanList(String bookCode, String bookName) {
		this.bookCode=bookCode;
		this.bookName=bookName;
	}

	public String toString() {
		return "Ã¥ ÄÚµå : "+bookCode+"( "+bookName+ ")\n";
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}
