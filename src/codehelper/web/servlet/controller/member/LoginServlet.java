package codehelper.web.servlet.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.logic.MemberServiceLogic;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");

		MemberService memberService = new MemberServiceLogic();
		
		Member member = memberService.login(loginId, password);
		if(loginId.equals(member.getId())&&password.equals(member.getPassword())) {
			
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			response.sendRedirect(request.getContextPath());
		}
		else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}
