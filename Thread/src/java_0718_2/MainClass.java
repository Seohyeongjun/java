package java_0718_2;

public class MainClass {

	public static void main(String[] args) {
		
		Web web1 = new Web("첫째 ");
		Web web2 = new Web("   둘째 ");
		Web web3 = new Web("      셋째 ");
		Web web4 = new Web("         넷째 ");
		
		web1.setPriority(Thread.MAX_PRIORITY);
		web2.setPriority(Thread.NORM_PRIORITY);
		web3.setPriority(Thread.MIN_PRIORITY);
		web4.setPriority(Thread.MAX_PRIORITY);
		
		web1.start();
		web2.start();
		web3.start();
		web4.start();
		
		
	}
}
