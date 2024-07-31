package java_0710_2;

public class InnerClass1 {
	public static void main(String[] args) {
		Out out = new Out();
		out.num=100;
//		out.obj.age=34;		// 인스턴스내부클래스가 private로 Out클래스 밖에서는 사용할 수 없다.
//		out.obj.setname("이순신");	// 인스턴스내부클래스가 private로 Out클래스 밖에서는 사용할 수 없다.
		
//		Out.인스턴스내부클래스 in = out.new 인스턴스내부클래스();	// 인스턴스내부클래스가 private로 Out클래스 밖에서는 사용할 수 없다.
		
	}	
	
}


// static으로 선언 및 정의한 변수와 메서드는 인스턴스 메서드에서 사용가능
// 인스턴스 변수, 메서드는 static메서드에서 사용 불가

class Out{
	static int count;	// 클래스 변수
	int num;			// 인스턴스 변수
	private String job;	// 인스턴스 변수
	인스턴스내부클래스 obj = new 인스턴스내부클래스();
	
	interface Car{
		void make();
	}
	
	void makeCar() {
	
		Car c = new Car() {
			@Override
			public void make() {
				System.out.println("익명 클래스(c)를 통해 만들기");
			}
		};
		c.make();
	}
	
	
	void buyComputer() {
		
		class 지역클래스{	// 메서드 내부에서 사용 가능한 클래스	
			int weight;
			void del() {
				
			}			
		}
		지역클래스 ob=new 지역클래스();
		
	}
	
	static void save() {
		
	}	
	
	static class 정적클래스{
		static int birth;
		static void update() {
			
		}
		
	}
	
	
	private class 인스턴스내부클래스{
		public int age;
		private String name;
		void setname(String name) {
			this.name=name;			
		}
		void create() {
			count=10;
		}
	}	
	
}

/* 내부 클래스 - 클래스 내부에서만 사용 가능한 클래스
 * 1. 인스턴스 내부 클래스
 * 2. 정적 내부 클래스
 * 3. 지역 내부 클래스
 * 4. 익명 내부 클래스 
 */
 