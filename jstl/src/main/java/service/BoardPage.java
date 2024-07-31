package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardPage implements MainActive{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "board/board.jsp";
	}

}
