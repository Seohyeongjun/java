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
		
		String detail ="신규회원 10명 남았습니다.";
		
//		response.sendRedirect("/signin.jsp");		// 1. 페이지 이동시 주소창에 주소가 보인다. 2. 주소를 통한 주소이동만 가능. 서버와의 데이터 전송 불가
		// 서블릿 클래스에 의해 생성된 데이터를 사용자가 보는 페이지에 출력하려면 forward를 사용해야 한다. 
		// 사용자가 보는 페이지에 html내용만 필요하거나 보여줄 데이터가 없는 경우 sendRedirect를 사용한다. 
		request.setAttribute("message", detail);	// request에 message라는 이름으로 detail변수를 저장
		RequestDispatcher rds = request.getRequestDispatcher("signin.jsp");
		rds.forward(request, response);		// signin.jsp로 forward하면서 request와 response를 보낸다.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
//		System.out.println("진짜 post요청 처리하나?");	// 콘솔창에 출력
		//입력한 아이디와 비밀번호 가져오기, request에 아이디와 비밀번호가 있다.
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		if(id.equals("gold") && pw.equals("1234")) {	// 아이디 : gold, 비밀번호 : 1234일 경우 로그인 성공
			response.sendRedirect("/");	// index.jsp
		}else {	// 로그인 실패 시
			request.setAttribute("fail", "아이디 또는 비밀번호 입력 실패");	// "fail"이란이름은 main.jsp에서 표현할 때 사용 한다. 
			RequestDispatcher rsd = request.getRequestDispatcher("main.jsp");
			rsd.forward(request, response);
		}
	}

}
