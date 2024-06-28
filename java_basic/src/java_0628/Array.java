package java_0628;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] agrs)
	{
		int a[]= {10, 20, 30};
		int b[]= {1,1,1};
		
		int[] arr1=new int[5];
		int[] arr2=new int[] {10, 20, 30, 40};
		
		int arraySize=3;
		int[] arr3=new int[arraySize];
		String[] arrstring=new String[] {"가나ekfk", "다라akqk", "마바tkdk"};
		int[] arr4 = new int[6];
		
		for(int i=0; i<3; i++)
		{
			System.out.println(a[i]);
		}
		
//		Scanner input=new Scanner(System.in);
//		for(int i=0; i<arr1.length; i++)
//		{
//			System.out.print("숫자입력 : ");
//			arr1[i]=input.nextInt();
//		}
//		System.arraycopy();
		
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr3.length);
		System.out.println(arrstring[0]);
		System.out.println(arrstring[1]);
		System.out.println(arrstring[2]);

		for(int i=0; i<a.length; i++)
		{
			arr4[i]=a[i];
			arr4[i+3]=b[i];
		}
		System.out.println(Arrays.toString(arr4));
		for(int i=0; i<a.length; i++)
		{
			a[i]=i+25;
			b[i]=i+13;
		}
		
		System.arraycopy(a, 0, arr4, 0, a.length);
		System.arraycopy(b, 0, arr4, 3, b.length);
		System.out.println(Arrays.toString(arr4));
		
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		
		boolean same=Arrays.equals(a, b);
		System.out.println(same);
	}
}
