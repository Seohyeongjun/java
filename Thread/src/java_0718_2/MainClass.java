package java_0718_2;

public class MainClass {

	public static void main(String[] args) {
		
		Web web1 = new Web("ù° ");
		Web web2 = new Web("   ��° ");
		Web web3 = new Web("      ��° ");
		Web web4 = new Web("         ��° ");
		
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
