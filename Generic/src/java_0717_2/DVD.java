package java_0717_2;

public class DVD extends Media {

	private String director;	// ����
	
	public DVD(String id, String title, String director)
	{
		super(id, title);
		this.director=director;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+", ���� : "+director;
	}

	public String getAuthor() {
		return director;
	}

	public void setAuthor(String director) {
		this.director = director;
	}
	
}
