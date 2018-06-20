package codehelper.web.servlet.controller.member;

import java.io.IOException;
import java.io.PrintWriter;

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
		HttpSession session = request.getSession();
		
		if(loginId.equals("admin") && password.equals("admin")) {
			session.setAttribute("name", "������");
			session.setAttribute("isAdmin", true);
			session.setAttribute("loginId", loginId);
			session.setAttribute("isLogged", true);
			response.sendRedirect(request.getContextPath());
		}
		else {
			Member member = memberService.login(loginId, password);
			if(member !=null && loginId.equals(member.getId())&&password.equals(member.getPassword())) {
				session.setAttribute("name", member.getName());
				session.setAttribute("isAdmin", false);
				session.setAttribute("loginId", loginId);
				session.setAttribute("isLogged", true);
				response.sendRedirect(request.getContextPath());
			}
			else {
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('아이디와 비밀번호를 확인해주세요.');");
				out.println("history.back();");
				out.println("</script>");
			}
		}
		
	}

}
