package java_0701;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// ���� �迵 �����
		// ������ �迭 ũ�⸦ �ø��ų� �ٿ��� ����ϴ� �迭
//		int [] num = new int [] {10, 20, 30, 40, 50};
//		int size = num.length;
//		int [] temp = new int [size+1];
//		System.out.println("ũ�� ���� �� : "+Arrays.toString(num));
//		System.out.print(num+"\n");
//		System.out.print(temp+"\n");
//		for(int i=0; i<size; i++)
//			temp[i]=num[i];
//		
//		num=temp;
//		num[5]=60;
//		System.out.print(num+"\n");
//		System.out.print(temp+"\n");
//		System.out.println("ũ�� ���� �� : "+Arrays.toString(num));
//		temp[5]=70;
//		System.out.println("ũ�� ���� �� : "+Arrays.toString(num));
//		System.out.println("ũ�� ���� �� : "+Arrays.toString(temp));
////////////////////////////////////////////////////////////////
		
		// ���ڿ����� ���� �񱳴� .equals()�� �Ѵ�.
		// ���ڿ��� Ư�����ڳ� ���ڿ� ���Կ��δ� .contains()�� �Ѵ�.
		// ���� �ּ� �� ��ȭ�� �ּҸ� �����Ͽ� �迭�� ���� �Ͻÿ�.
		// �迭�� �� ����Ǿ����� Ȯ�� ����� Array �̿��Ͽ� ���
		
//		String[] addr = new String[] {"���� �߱� ��ȭ�� 25", "���� �߱� ��ȭ�� 92", "���� ���� �л굿 111", "���� ���� �л굿 1023",
//										"���� ������ ������ 93", "���� �߱� ���ﵿ 932", "���� ���� ���絿 945", "���� �߱� ��ȭ�� 1234",
//										"���� �߱� ���ﵿ 23", "���� �߱� ��ȭ�� 984"};
//	
//		String getAddr = "��";
//		String [] getAddrArray = new String[addr.length];
//		
//		for(int i=0, j=0; i<addr.length; i++)
//		{
//			if(addr[i].contains(getAddr))
//				getAddrArray[j++]=addr[i];
//		}
//		
//		for(int i=0; i<getAddrArray.length; i++)
//			if(getAddrArray[i]!=null)
//				System.out.println(getAddr+" ��(��) ���Ե� �ּ� -"+(i+1)+"- : "+getAddrArray[i]);
//		
/////////////////////////////////////////////////////////////////////////////////////////////////		
		// 2���� �迭
		
//		int [][] arr = new int [5][3];
//		
//		arr[0][0]=10;
//		arr[0][1]=20;
//		arr[0][2]=30;
//		arr[1][0]=40;
//		arr[2][1]=50;
//		
//		
//		int [] a= new int[] {10, 20, 30, 40, 50, 60, 70, 80 ,90, 100};
//		
//		// for(int i=0; i<a.length; i++)
//		for(int data:a)
//		{
//			System.out.println(data);
//		
//		}
//		
		int[][] array1 = new int[2][3];
		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();
		
		int[][] array2 = new int[][] {{1, 2}, {3, 4, 5}};
		System.out.println(array2.length);
		System.out.println(array2[0].length);
		System.out.println(array2[1].length);
		System.out.println();
		
		System.out.print(array2[0][0]+" ");
		System.out.print(array2[0][1]+" ");
		System.out.println();
		System.out.print(array2[1][0]+" ");
		System.out.print(array2[1][1]+" ");
		System.out.print(array2[1][2]);
		System.out.println();

//		for(int i=0; i<array1.length; i++)
//		{
//			for(int j=0; j<array1[i].length; j++)
//				System.out.print(array1[i][j]+" ");
//
//			System.out.println();
//		}
//		System.out.println();

		for(int i=0; i<array2.length; i++)
		{
			for(int j=0; j<array2[i].length; j++)
				System.out.print(array2[i][j]+" ");

			System.out.println();
		}
		System.out.println();
		
		for(int[] array:array2)
		{
			for(int k:array)
				System.out.print(k+" ");
			
			System.out.println();
		}		
	}
}
