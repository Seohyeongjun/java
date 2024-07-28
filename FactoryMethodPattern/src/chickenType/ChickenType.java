package chickenType;

public enum ChickenType {

	Fried("< 후라이드 치킨 >"),
	Garlic("< 마늘양념 치킨 >"),
	SoySauce("< 간장양념 치킨 >");
	
	private final String value;
	
	ChickenType(String value){
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
