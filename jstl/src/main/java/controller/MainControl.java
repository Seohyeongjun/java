package controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MainActive;
import service.MemberJoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
/////////////////////////////////////////////////////////////////////////////////////////////////
	
	private HashMap<String, MainActive> map = new HashMap<>();
	
/////////////////////////////////////////////////////////////////////////////////////////////////	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ResourceBundle rb = ResourceBundle.getBundle("class_bundle/mainProp");
		Enumeration key = rb.getKeys();	// key : signUp.do ...
		
		while(key.hasMoreElements()) {
			String k = (String)key.nextElement();	// signUp.do, signIn.do...
			String value = rb.getString(k);			// service.SignUpPage, service.MemberJoin...
			
			try {
				Class<?> hcl = Class.forName(value);	// 메모리에 로드
				MainActive his = (MainActive)hcl.newInstance();
				map.put(k, his);
				
			}catch(Exception e) {
				System.out.println("mainProp 파일 Map변환 실패");
			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doMethode(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		doMethode(request, response);
	}
	
	protected void doMethode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	// 요청시 입력값에 대한 인코딩
		
		String uri = request.getRequestURI();		// home.jsp에서 회원가입을 누를 시 uri : /signUp.do
		String cmd = uri.substring(uri.lastIndexOf("/")+1);	// cmd : signUp.do
		
		String view="/";	// 사용자가 보는 뷰페이지
		
		MainActive target = map.get(cmd);
		view = target.action(request, response);
		
		if(view!=null) {
			RequestDispatcher rd = request.getRequestDispatcher(view);
			rd.forward(request, response);
		}
	}
}

/*
if(cmd.equals("signUp.do"))		// 회원가입 양식 페이지 이동
{
	if(request.getMethod().equals("POST")) {	// request.getMethod() : 사용자 요청방식
		MemberJoin save = new MemberJoin();
		save.join(request, response);
	}
	else {
		view="member/signUp.html";
	}
}

	else if(cmd.equals("signIn.do"))	// 로그인 양식 페이지 이동
	{
		view="member/signIn.jsp";
	}
	else if(cmd.equals("board.do"))
	{
		view="member/board.html";
	}
*/