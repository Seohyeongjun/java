package chickenType;

public enum ChickenType {

	Fried("< �Ķ��̵� ġŲ >"),
	Garlic("< ���þ�� ġŲ >"),
	SoySauce("< ������ ġŲ >");
	
	private final String value;
	
	ChickenType(String value){
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
