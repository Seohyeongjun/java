package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class SignIn implements MainActive{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		String view ="/";
		
		if(request.getSession().getAttribute("user")!=null) {	// 로그인 상태일 경우 로그오프
			request.getSession().removeAttribute("user");		// user 세션 삭제
		}
		else {	// 로그인 시도
		
			String id = request.getParameter("userId");
			String pw = request.getParameter("userPassword");
			view = request.getParameter("preURL");		// 로그인 전 페이지
			
			// 데이터베이스에서 아이디 비번 조회 하기
			MemberDAO dao = new MemberDAO();
			boolean isSuccess = dao.login(id, pw);	// 아이디 비번 데이터베이스에 존재유무 반환
			
			if(isSuccess) {	// 아이디 비번 데이터베이스에 존재한다면
				request.getSession().setAttribute("user", id);
			}
		}
		try {
			response.sendRedirect(view);	// 페이지 이동
		}catch(Exception e) {
			
		}

		return null;
	}
}
