package java_0710_1;

abstract class Unit{
	int hp;
}

interface Repairable {
	public void repair();
}

class Marine extends Unit{
	Marine(){	super.hp=50;	}
//	@Override
//	public void repair() {
//		System.out.println("치료");
//	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){	super.hp=100;	}
	@Override
	public void repair() {
		System.out.println("수리");
	}
}

class Tank extends Unit implements Repairable{
	Tank(){	super.hp=150;	}
	@Override
	public void repair() {
		System.out.println("수리");
	}
}

public class interfaceTest3 {
	public static void main(String[] args) {
	
		Unit marine = new Marine();
		Dropship dropship = new Dropship();
		Tank tank = new Tank();
		
		marine.hp-=10;
		dropship.hp-=20;
		tank.hp-=50;
		
		System.out.println(marine.hp);
		System.out.println(dropship.hp);
		System.out.println(tank.hp);
		
		dropship.repair();
		tank.repair();
	}
}
