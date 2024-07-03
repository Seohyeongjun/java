package homework_dice_240703;

public class diceGame {

	public static void main(String[] args) {
		/*
		 주사위 게임
		 
		 j형준과 s석완이가 주사위 게임을 한다.
		 주사위는 하나, 육면이다.
		 주사위의 값이 큰 사람이 이긴다.(랜덤)
		 
		 주사위 값 구하는 메서드
		 
		 주사위 값 비교하여 누가 이겼는지 출력하는 메서드	 
		 
		 */
		Dice dice = new Dice();
		
		String name1="j형준";
		String name2="s석완";
		
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
			System.out.printf("%s 패 : %d\n%s 승 : %d\n",name1, nameNum1, name2, nameNum2);
		else if(result>0)
			System.out.printf("%s 승 : %d\n%s 패 : %d\n",name1, nameNum1, name2, nameNum2);
		else
			System.out.printf("%s : %d\n%s : %d \n비김",name1, nameNum1, name2, nameNum2);
	}
}
