package homework_dice_240703;

public class diceGame {

	public static void main(String[] args) {
		/*
		 �ֻ��� ����
		 
		 j���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
		 �ֻ����� �ϳ�, �����̴�.
		 �ֻ����� ���� ū ����� �̱��.(����)
		 
		 �ֻ��� �� ���ϴ� �޼���
		 
		 �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���	 
		 
		 */
		Dice dice = new Dice();
		
		String name1="j����";
		String name2="s����";
		
		int nameNum1=dice.getDice();
		int nameNum2=dice.getDice();
		
		dice.outDice(name1, nameNum1, name2, nameNum2);

	}

}


class Dice
{
	int getDice()
	{
		int diceNum=(int)(Math.random()*6)+1;
		return diceNum;		
	}
	
	void outDice(String name1, int nameNum1, String name2, int nameNum2)
	{
		int result=nameNum1-nameNum2;
		
		if(result<0)
			System.out.printf("%s �� : %d\n%s �� : %d\n",name1, nameNum1, name2, nameNum2);
		else if(result>0)
			System.out.printf("%s �� : %d\n%s �� : %d\n",name1, nameNum1, name2, nameNum2);
		else
			System.out.printf("%s : %d\n%s : %d \n���",name1, nameNum1, name2, nameNum2);
	}
}
