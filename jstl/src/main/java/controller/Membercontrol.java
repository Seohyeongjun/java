package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Membercontrol
 */
@WebServlet("/member")
public class Membercontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Membercontrol() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String detail ="�ű�ȸ�� 10�� ���ҽ��ϴ�.";
		
//		response.sendRedirect("/signin.jsp");		// 1. ������ �̵��� �ּ�â�� �ּҰ� ���δ�. 2. �ּҸ� ���� �ּ��̵��� ����. �������� ������ ���� �Ұ�
		// ���� Ŭ������ ���� ������ �����͸� ����ڰ� ���� �������� ����Ϸ��� forward�� ����ؾ� �Ѵ�. 
		// ����ڰ� ���� �������� html���븸 �ʿ��ϰų� ������ �����Ͱ� ���� ��� sendRedirect�� ����Ѵ�. 
		request.setAttribute("message", detail);	// request�� message��� �̸����� detail������ ����
		RequestDispatcher rds = request.getRequestDispatcher("signin.jsp");
		rds.forward(request, response);		// signin.jsp�� forward�ϸ鼭 request�� response�� ������.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
//		System.out.println("��¥ post��û ó���ϳ�?");	// �ܼ�â�� ���
		//�Է��� ���̵�� ��й�ȣ ��������, request�� ���̵�� ��й�ȣ�� �ִ�.
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		if(id.equals("gold") && pw.equals("1234")) {	// ���̵� : gold, ��й�ȣ : 1234�� ��� �α��� ����
			response.sendRedirect("/");	// index.jsp
		}else {	// �α��� ���� ��
			request.setAttribute("fail", "���̵� �Ǵ� ��й�ȣ �Է� ����");	// "fail"�̶��̸��� main.jsp���� ǥ���� �� ��� �Ѵ�. 
			RequestDispatcher rsd = request.getRequestDispatcher("main.jsp");
			rsd.forward(request, response);
		}
	}

}
