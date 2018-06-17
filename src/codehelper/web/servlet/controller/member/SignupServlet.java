package codehelper.web.servlet.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.store.MemberStore;
import codehelper.web.servlet.store.logic.MemberStoreLogic;

@WebServlet("/signup.do")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginId = request.getParameter("loginId");
		String email=request.getParameter("email");
		String password = request.getParameter("password1");
		String name = request.getParameter("nickname");
				
		Member member= new Member();
				
		member.setId(loginId+"@"+email);
		member.setPassword(password);
		member.setName(name);
		member.setBalance(0);
				
		MemberStore memberStore = new MemberStoreLogic();
				
		memberStore.create(member);
		
		response.sendRedirect(request.getContextPath());
	}
}
