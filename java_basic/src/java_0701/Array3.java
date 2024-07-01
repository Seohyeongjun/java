package java_0701;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args)
	{
		// 배열에 20개의 랜덤 숫자 저장(1~30)
		// 배열에 저장된 데이터 중에서 5의 배수는 몇개인지 출력
		
		int randomMaxNum=30;
		int [] randomNum = new int[20];
		int MulNum=5;
		int count=0;
		
		for(int i=0; i<randomNum.length; i++)
		{
			randomNum[i]=(int)(Math.random()*randomMaxNum)+1;
			if(randomNum[i]%MulNum==0)
				count++;
			System.out.print(randomNum[i]+" ");
		}
		System.out.println("\n5의 배수는 "+count+"개");
		
	}
}
