package java_0709;

public class Game {

	private String name;
	private String type;
	private String company;
	private String flatForm;
	private int age;
	
	public Game(){}
	public Game(String name, String type, String company, String flatForm, int age)
	{
		this.name=name;
		this.type=type;
		this.company=company;
		this.flatForm=flatForm;		
		this.age=age;
	}
	
	@Override
	public String toString()
	{
		return name+", "+type+", "+company+", "+flatForm+", "+age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlatForm() {
		return flatForm;
	}
	public void setFlatForm(String flatForm) {
		this.flatForm = flatForm;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	
	
}

// ���� ����� �帣, �÷���
// �帣�� �׼�, ���÷���, FPS ��
// �÷����� PC, PS4, switch, XBOX ��