package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberJoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		// TODO Auto-generated method stub
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
		
		if(cmd.equals("signUp.do"))
		{
			MemberJoin save = new MemberJoin();
			save.join(request, response);
			
			
			view="member/signUp.html";
		}
		else if(cmd.equals("signIn.do"))
		{
			view="member/signIn.jsp";
		}
		else if(cmd.equals("board.do"))
		{
			view="member/board.html";
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(view);
		rd.forward(request, response);
	}
	

}
