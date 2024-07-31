package java_0711_1;

class PasswordException extends Exception
{
	public PasswordException(String msg)
	{
		super(msg);
	}
	
}

public class ExceptionTest5 {

	static void setPassword(String password) throws PasswordException
	{	// ���� �߻��� setPassword�޼��� ���� �ߴ� �� throw ����
		if(password==null)
			throw new PasswordException("��й�ȣ�� �Է��Ͻÿ�");
		if(password.length()<8)
			throw new PasswordException("8�� �̻� �Է��Ͻÿ�");
		if(password.matches("[a-zA-Z]+"))
			throw new PasswordException("��й�ȣ�� ���ڳ� Ư������ ����");
		// �� if�� �߿� �ϳ��� ����(throw)�� �߻����� ������ ��й�ȣ ����
	}
	public static void main(String[] args) {
		
		try
		{
			setPassword("asdfqwe12");
		}
		catch(PasswordException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

// ����� ���� ����ó�� Ŭ���� �����
