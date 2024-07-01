package java_0701;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// 동적 배영 만들기
		// 기존의 배열 크기를 늘리거나 줄여서 사용하는 배열
//		int [] num = new int [] {10, 20, 30, 40, 50};
//		int size = num.length;
//		int [] temp = new int [size+1];
//		System.out.println("크기 증가 전 : "+Arrays.toString(num));
//		System.out.print(num+"\n");
//		System.out.print(temp+"\n");
//		for(int i=0; i<size; i++)
//			temp[i]=num[i];
//		
//		num=temp;
//		num[5]=60;
//		System.out.print(num+"\n");
//		System.out.print(temp+"\n");
//		System.out.println("크기 증가 후 : "+Arrays.toString(num));
//		temp[5]=70;
//		System.out.println("크기 증가 후 : "+Arrays.toString(num));
//		System.out.println("크기 증가 후 : "+Arrays.toString(temp));
////////////////////////////////////////////////////////////////
		
		// 문자열에서 같다 비교는 .equals()로 한다.
		// 문자열에 특정문자나 문자열 포함여부는 .contains()로 한다.
		// 다음 주소 중 선화동 주소만 추출하여 배열에 저장 하시오.
		// 배열에 잘 저장되었는지 확인 출력은 Array 이용하여 출력
		
//		String[] addr = new String[] {"대전 중구 선화동 25", "대전 중구 선화동 92", "대전 서구 둔산동 111", "대전 서구 둔산동 1023",
//										"대전 유성구 노은동 93", "대전 중구 대흥동 932", "대전 동구 가양동 945", "대전 중구 선화동 1234",
//										"대전 중구 대흥동 23", "대전 중구 선화동 984"};
//	
//		String getAddr = "선";
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
//				System.out.println(getAddr+" 이(가) 포함된 주소 -"+(i+1)+"- : "+getAddrArray[i]);
//		
/////////////////////////////////////////////////////////////////////////////////////////////////		
		// 2차원 배열
		
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
