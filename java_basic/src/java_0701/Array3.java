package java_0701;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args)
	{
		// �迭�� 20���� ���� ���� ����(1~30)
		// �迭�� ����� ������ �߿��� 5�� ����� ����� ���
		
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
		System.out.println("\n5�� ����� "+count+"��");
		
	}
}
