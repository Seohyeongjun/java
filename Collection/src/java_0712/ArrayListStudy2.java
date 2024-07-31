package java_0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		ArrayList<Asset> asset = new  ArrayList<>();
		
		asset.add(new Asset("우리은행", "1004-91-123455", "이순신", 3450000));
		asset.add(new Asset("농협", "34-123-349393", "김유신", 513350));
		asset.add(new Asset("신한은행", "394-3412-2323", "박팽년", 891003));
		asset.add(new Asset("국민은행", "39-2384-19939", "최무선", 899900));
		asset.add(new Asset("우리은행", "1002-93-878888", "문익점", 28300));
		asset.add(new Asset("신한은행", "293-0123-1234", "이율곡", 98000));
		asset.add(new Asset("우리은행", "1006-23-123456", "김시민", 1920000));
		asset.add(new Asset("국민은행", "23-2555-29991", "이율곡", 932000));
		
//		System.out.println(asset);
		// 문제1. 우리은행을 이용하는 사람들 정보만 출력
		// 문제2. 잔액이 100만원 이상인 사람만 정보 출력
		// 문제3. 최무선이 우리은행 계좌를 가지고 있는지 확인하고 없으면 우리은행 계좌개설(1007-23-128954)
		for(Asset a : asset)
		{
			System.out.println(a);
		}
		
		System.out.println("\n== 문제1. 우리은행을 이용하는 사람들 정보만 출력 ==");
		for(Asset a : asset)
		{
			if(a.getBank().contains("우리은행"))	// equals도 같은 출력
				System.out.println(a);
		}
		
		System.out.println("\n== 문제2. 잔액이 100만원 이상인 사람만 정보 출력 ==");
		asset.forEach
			(b -> { 
					if(b.getBalance() >=1000000)
						System.out.println(b);
				});
//		for(Asset a : asset)
//		{
//			if(a.getBalance()>=1000000)
//				System.out.println(a);
//		}
//		
		System.out.println("\n== 최무선이 우리은행 계좌를 가지고 있는지 확인하고 없으면 우리은행 계좌개설(1007-23-128954) ==");
		
		Asset ass = new Asset("우리은행", "1007-23-128954", "최무선", 0);
		if(!asset.contains(ass))
		{
			asset.add(ass);
		}
		
		asset.forEach(info -> System.out.println(info));
		
//		for(Asset a : asset)
//		{
//			if(a.getHolder().contains("최무선"))
//			{
//				System.out.println("변경 전 : "+a);
//				if(!a.getBank().contains("우리은행"))
//				{
//					String bank="우리은행";
//					String acc="1007-23-128954";
//					
//					a.setBank(bank);
//					a.setAccontNum(acc);
//				}
//				
//				System.out.println("변경 후 : "+a);
//			}
//
//		}			
		
	}
}
