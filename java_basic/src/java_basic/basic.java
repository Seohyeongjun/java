package java_basic;

public class basic {
	public static void main(String[] args)
	{
//		byte a=-128; //0111/1111 , -128~127
		int a=1400;
		float b=3.14f; // 실수형 float, double
			
		boolean c=true;	// boolean 타입은 true 또는 false만 저장
		
		String word="이순신";	// String은 데이터 타입은 아니나 문자열을 위해 자바에서 만든 타입. 내부에는 char형으로 배열화 되어 있다.
		System.out.println("String word : "+word);
		// 0000 0000 / 0000 0000 / 0000 0000 / 0000 0000
		
		System.out.println("java test "+b); /* System.out.println 단축키 syso + ( Left Ctrl + space bar ) */
		
		int width=50;
		int height=20;
		int area=width*height;
		
		System.out.println("넓이는 너비 "+width+" * 높이 "+height+" = "+area);
		
		// 키보드를 30개 구매해야 한다.
		// hp 게이밍 키보드의 가격이 8000원이라면 총 구매금액은 얼마인가?
		int keyboardNum=30;
		int hpKeyboardPrice=8000;
		int total=keyboardNum*hpKeyboardPrice;
		System.out.println("키보드 수량 : "+keyboardNum+"개, 키보드 가격 : "+hpKeyboardPrice+"원, 총합 : "+total+"원");
		System.out.print("java 출력방법 : print ");
		System.out.print("출력은 자동 줄바꿈 안됨");
		System.out.printf(" print \n 줄바꿈\n"); // \n 은 엔터의 특수문자, 다른 print문에서도 사용가능
		// 서식 문자 - 형식지정문자
		System.out.printf("키보드 수량 : %d, 키보드 가격 : %d, 총합은 : %d", keyboardNum, hpKeyboardPrice, total);
		// %d : 10진수 
		// %u : 10진수 정수
		// %f : 10진수 실수
		// %c : 문자
		// %s : 문자열
		// %b : boolean(true, false)
		// %o : 8진수 정수
		// %x : 16진수 정수
		
		System.out.printf("\n %.2f", 170.5658);	// printf는 println이나 print와는 다르게 자리수를 정할 수 있다(소숫점 이하 기본6자리). %.(자릿수)f
		
		
	}
}
