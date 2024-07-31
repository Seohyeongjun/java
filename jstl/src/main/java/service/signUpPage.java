package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signUpPage implements MainActive{

	@Override
	public String action(HttpServletRequest req, HttpServletResponse res) {
		
		return "member/signUp.html";
	}
}
