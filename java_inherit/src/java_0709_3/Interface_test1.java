package java_0709_3;

interface RestCustomer		// �Ĵ翡 ã�ƿ��� �մ�
{
	public void setCustomer(String customer);
	public String food();
	public String aaaa();
}

class ReservCustomerA implements RestCustomer	// ����մ� A
{
	String customer;		// ����մ�

	@Override
	public void setCustomer(String customer) {
		this.customer=customer;		
	}

	@Override
	public String food() {
		return customer+" û���常 �ش�";		
	}	
	
	@Override
	public String aaaa()
	{
		return customer;
	}
}

class ReservCustomerB implements RestCustomer	// ����մ� B
{
	String customer;		// ����մ�
	
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;		
	}

	@Override
	public String food() {
		return customer+" �������� �ش�";
	}	
	
	@Override
	public String aaaa() {
		return "aaa";
	}
}

class AAA
{
	int a=123;
//	System.out.println("AAA");
}

class Owner		// ����
{
	void fddd(AAA aaa)
	{
		System.out.println(aaa.a+"AAAaaa");
	}
	void food(ReservCustomerA cusA)
	{
		System.out.println(cusA.food());		
	}
	void food(ReservCustomerB cusB)
	{
		System.out.println(cusB.food());
	}
}

public class Interface_test1 {
	public static void main(String[] args)
	{
		Owner ow = new Owner();
		
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		
		a.setCustomer("A-�̼���");
		b.setCustomer("B-�庸��");
		
		ow.food(a);
		ow.food(b);
		
		AAA aaa=new AAA();
		ow.fddd(aaa);		
	}
}


// ��Ʈ�� Ŭ���� 
//		- ����� ��û ó�� Ŭ����
// ���� Ŭ����, �������̽� 
//		- ����� ��û�� �ʿ��� ������ ���� �� ���� ���� Ŭ����
// �����͸� �����ϴ� Ŭ����
//		VO, DTO - ����ڿ��� ������ ������ Ŭ����
//		ENtity - �����ͺ��̽��� ������ ������ Ŭ����
// �����ͺ��̽� ó�� �������̽� 
//		- repository
