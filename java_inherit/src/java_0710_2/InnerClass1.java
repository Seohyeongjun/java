package java_0710_2;

public class InnerClass1 {
	public static void main(String[] args) {
		Out out = new Out();
		out.num=100;
//		out.obj.age=34;		// �ν��Ͻ�����Ŭ������ private�� OutŬ���� �ۿ����� ����� �� ����.
//		out.obj.setname("�̼���");	// �ν��Ͻ�����Ŭ������ private�� OutŬ���� �ۿ����� ����� �� ����.
		
//		Out.�ν��Ͻ�����Ŭ���� in = out.new �ν��Ͻ�����Ŭ����();	// �ν��Ͻ�����Ŭ������ private�� OutŬ���� �ۿ����� ����� �� ����.
		
	}	
	
}


// static���� ���� �� ������ ������ �޼���� �ν��Ͻ� �޼��忡�� ��밡��
// �ν��Ͻ� ����, �޼���� static�޼��忡�� ��� �Ұ�

class Out{
	static int count;	// Ŭ���� ����
	int num;			// �ν��Ͻ� ����
	private String job;	// �ν��Ͻ� ����
	�ν��Ͻ�����Ŭ���� obj = new �ν��Ͻ�����Ŭ����();
	
	interface Car{
		void make();
	}
	
	void makeCar() {
	
		Car c = new Car() {
			@Override
			public void make() {
				System.out.println("�͸� Ŭ����(c)�� ���� �����");
			}
		};
		c.make();
	}
	
	
	void buyComputer() {
		
		class ����Ŭ����{	// �޼��� ���ο��� ��� ������ Ŭ����	
			int weight;
			void del() {
				
			}			
		}
		����Ŭ���� ob=new ����Ŭ����();
		
	}
	
	static void save() {
		
	}	
	
	static class ����Ŭ����{
		static int birth;
		static void update() {
			
		}
		
	}
	
	
	private class �ν��Ͻ�����Ŭ����{
		public int age;
		private String name;
		void setname(String name) {
			this.name=name;			
		}
		void create() {
			count=10;
		}
	}	
	
}

/* ���� Ŭ���� - Ŭ���� ���ο����� ��� ������ Ŭ����
 * 1. �ν��Ͻ� ���� Ŭ����
 * 2. ���� ���� Ŭ����
 * 3. ���� ���� Ŭ����
 * 4. �͸� ���� Ŭ���� 
 */
 