package codehelper.web.servlet.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.store.MemberStore;
import codehelper.web.servlet.store.logic.MemberStoreLogic;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");

		MemberStore memberStore = new MemberStoreLogic();
		
		Member member = memberStore.retrieve("loginId");
		
		if(loginId.equals(member.getId())&&password.equals(member.getPassword()))
		{
			HttpSession session = request.getSession();
			session.setAttribute("memberId", loginId);
			session.setAttribute("memberName", member.getName());
			response.sendRedirect(request.getContextPath());
		}
	}

}
