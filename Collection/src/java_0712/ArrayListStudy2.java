package java_0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		ArrayList<Asset> asset = new  ArrayList<>();
		
		asset.add(new Asset("�츮����", "1004-91-123455", "�̼���", 3450000));
		asset.add(new Asset("����", "34-123-349393", "������", 513350));
		asset.add(new Asset("��������", "394-3412-2323", "���س�", 891003));
		asset.add(new Asset("��������", "39-2384-19939", "�ֹ���", 899900));
		asset.add(new Asset("�츮����", "1002-93-878888", "������", 28300));
		asset.add(new Asset("��������", "293-0123-1234", "������", 98000));
		asset.add(new Asset("�츮����", "1006-23-123456", "��ù�", 1920000));
		asset.add(new Asset("��������", "23-2555-29991", "������", 932000));
		
//		System.out.println(asset);
		// ����1. �츮������ �̿��ϴ� ����� ������ ���
		// ����2. �ܾ��� 100���� �̻��� ����� ���� ���
		// ����3. �ֹ����� �츮���� ���¸� ������ �ִ��� Ȯ���ϰ� ������ �츮���� ���°���(1007-23-128954)
		for(Asset a : asset)
		{
			System.out.println(a);
		}
		
		System.out.println("\n== ����1. �츮������ �̿��ϴ� ����� ������ ��� ==");
		for(Asset a : asset)
		{
			if(a.getBank().contains("�츮����"))	// equals�� ���� ���
				System.out.println(a);
		}
		
		System.out.println("\n== ����2. �ܾ��� 100���� �̻��� ����� ���� ��� ==");
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
		System.out.println("\n== �ֹ����� �츮���� ���¸� ������ �ִ��� Ȯ���ϰ� ������ �츮���� ���°���(1007-23-128954) ==");
		
		Asset ass = new Asset("�츮����", "1007-23-128954", "�ֹ���", 0);
		if(!asset.contains(ass))
		{
			asset.add(ass);
		}
		
		asset.forEach(info -> System.out.println(info));
		
//		for(Asset a : asset)
//		{
//			if(a.getHolder().contains("�ֹ���"))
//			{
//				System.out.println("���� �� : "+a);
//				if(!a.getBank().contains("�츮����"))
//				{
//					String bank="�츮����";
//					String acc="1007-23-128954";
//					
//					a.setBank(bank);
//					a.setAccontNum(acc);
//				}
//				
//				System.out.println("���� �� : "+a);
//			}
//
//		}			
		
	}
}
