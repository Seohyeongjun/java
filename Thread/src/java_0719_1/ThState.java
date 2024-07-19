package java_0719_1;

public enum ThState {

	NEW, RUNNABLE, BLOCKED, WATING, TIMED_WATING, TERMINATED
	
//	int num;
//	ThState(int num)
//	{
//		this.num=num;
//	}
//	int getNum()
//	{
//		return this.num;
//	}

}


/*
	상수들의 클래스처럼 사용할 수 있는 방법 - Enum
	NEW, RUNNABLE, BLOCKED, WATING, TIMED_WATING, TERMINATED
	 1		2		  3		  4			5			 6	
	 
	 각 이름의 상수화, 이름이 순서대로 값을 갖는다. 
	 
	 
	 menu - 1. 파일열기
	 		2. 파일저장
	 		3. 다른이름저장
	 		4. 환경설정
	 		5. 종료
	 
	 		enum Menu
	 		{
	 			파일열기, 파일저장, SAVEAS, SET, EXIT
	 		}
	 		
	 		int menu = scan.nextInt();
	 		
	 		switch(menu)
	 		{
	 			case Menu.파일열기 : ...
	 			case Menu.파일저장 : ...
	 			case Menu.SAVEAS : ...
	 			case Menu.SET	: ...
	 			case Menu.EXIT	: ...
	 		}
	 
	 
	 
	 
	 
	 
	 
	 
 */ 
