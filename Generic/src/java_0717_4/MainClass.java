package java_0717_4;

import java.util.ArrayList;
import java.util.Date;

public class MainClass {

	@Deprecated
	static void aaa()
	{
		
	}
	public static void main(String[] args) {
		
		aaa();
		
		Date today = new Date();
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList();
		
//		today.getYear();
		
		
		
		
	}
	
}


/*
  	�����ڸ� ���� �޸� - �ּ�
  	
  	annotation - �ּ����� �ǹ̸� ������.(ex. @Override)
  		Ư�� �ڵ���� ��ǻ�Ϳ��� ��������
  		
  	����	�� ǥ�� annotation
  	    �� ��Ÿ annotation
  		
  	���� ǥ�� annotation	
  	��   ��
  	��   �� @Override
  	��   �� - �����Ϸ����� �޼��带 �������̵� �ϴ� ���̶�� �˷��ش�.
  	��   ��	
  	��   �� @Eeprecated
  	��   �� - ������ ������� ���� ����̶�� �˷��ش�.
  	��   ��	
  	��   �� @SuperWarnings
  	��   ��	- �����Ϸ� ��� ������� �ʰ� �ϵ��� ����
  	��   ��	
  	��   �� @SuperWarnings("all")			: ��� ��� ���� 
  	��   ��			    ("deprecation") : ������� �ʴ� ��� ��� ����
  	��   �� 			    ("null")		: null�� ���õ� ��� ����
  	��   ��				("unchecked") 	: ��Ȯ�� ���۷��̼� ��� ����
  	��   ��				("unused") 		: ������� �ʴ� �ڵ� �Ǵ� ���ʿ��� �ڵ忡 ���� ��� ����	
  	��   �� 	
  	��   �� @FuctionalInterface
  	��   �� - �Լ��� �������̽�
  	��   �� 	
  	��   �� @SafeVaragrs	
  	��     - ���׸��� ���� ���� ������ �Ű������� ����� �� ��� ��Ÿ���� �ʱ�	  
  	��
  	��
  	���� ��Ÿ annotation
  	    ��
  	    �� @Target
  	    �� - �ֳ����̼��� ���� �� �� ������ ��� ����
  	    ��
  	    �� @Documented
  	    �� - javadoc�� �ۼ��� ������ ����
  	    ��
  	    �� @Inherited
  	    �� - ����Ŭ������ ��ӵǵ��� �� �� ���
  	    ��
  	    �� @Retention
  	    �� - �ֳ����̼� �Ⱓ ����
  	    ��
  	    �� @Repeatable
  	      - �ֳ����̼� �ݺ� ����
  	    
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
 
*/