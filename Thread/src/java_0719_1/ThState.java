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
	������� Ŭ����ó�� ����� �� �ִ� ��� - Enum
	NEW, RUNNABLE, BLOCKED, WATING, TIMED_WATING, TERMINATED
	 1		2		  3		  4			5			 6	
	 
	 �� �̸��� ���ȭ, �̸��� ������� ���� ���´�. 
	 
	 
	 menu - 1. ���Ͽ���
	 		2. ��������
	 		3. �ٸ��̸�����
	 		4. ȯ�漳��
	 		5. ����
	 
	 		enum Menu
	 		{
	 			���Ͽ���, ��������, SAVEAS, SET, EXIT
	 		}
	 		
	 		int menu = scan.nextInt();
	 		
	 		switch(menu)
	 		{
	 			case Menu.���Ͽ��� : ...
	 			case Menu.�������� : ...
	 			case Menu.SAVEAS : ...
	 			case Menu.SET	: ...
	 			case Menu.EXIT	: ...
	 		}
	 
	 
	 
	 
	 
	 
	 
	 
 */ 
