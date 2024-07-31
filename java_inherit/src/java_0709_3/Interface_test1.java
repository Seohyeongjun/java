package java_0709_3;

interface RestCustomer		// 식당에 찾아오는 손님
{
	public void setCustomer(String customer);
	public String food();
	public String aaaa();
}

class ReservCustomerA implements RestCustomer	// 예약손님 A
{
	String customer;		// 예약손님

	@Override
	public void setCustomer(String customer) {
		this.customer=customer;		
	}

	@Override
	public String food() {
		return customer+" 청국장만 준다";		
	}	
	
	@Override
	public String aaaa()
	{
		return customer;
	}
}

class ReservCustomerB implements RestCustomer	// 예약손님 B
{
	String customer;		// 예약손님
	
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;		
	}

	@Override
	public String food() {
		return customer+" 돈가스만 준다";
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

class Owner		// 사장
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
		
		a.setCustomer("A-이순신");
		b.setCustomer("B-장보고");
		
		ow.food(a);
		ow.food(b);
		
		AAA aaa=new AAA();
		ow.fddd(aaa);		
	}
}


// 컨트롤 클래스 
//		- 사용자 요청 처리 클래스
// 서비스 클래스, 인터페이스 
//		- 사용자 요청에 필요한 데이터 가공 및 수집 실행 클래스
// 데이터만 저장하는 클래스
//		VO, DTO - 사용자에게 제공할 데이터 클래스
//		ENtity - 데이터베이스에 저장할 데이터 클래스
// 데이터베이스 처리 인터페이스 
//		- repository
