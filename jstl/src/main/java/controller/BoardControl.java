package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardControl
 */
@WebServlet("/board")
public class BoardControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("/boardView.jsp");	// �ּҺ����ϰ� ���� ����. �ּ� boardView.jsp�� ����
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		String main=request.getParameter("main");
		String textW=request.getParameter("textW");
		
		request.setAttribute("main", main);
		request.setAttribute("textW", textW);
		
		RequestDispatcher rd = request.getRequestDispatcher("boardWrite.jsp");
		rd.forward(request, response);	// �ּҺ��� ���� ���� ����. �ּ� boardWrite.jsp�� �ȳ���
	}
}
