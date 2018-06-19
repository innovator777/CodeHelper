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

@WebServlet("/memberRemove.do")
public class MemberRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService memberService = new MemberServiceLogic();
		
		String password = request.getParameter("password");
		
		Member member = memberService.findMember((String)request.getSession().getAttribute("loginId"));
		
		System.out.println(password);
		System.out.println(member.getPassword());
		if(member.getPassword().equals(password)) {
			memberService.removeMember((String)request.getSession().getAttribute("loginId"));
		
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect(request.getContextPath());
		}
		else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('비밀번호가 틀렸습니다!!!');");
			out.println("history.back();");
			out.println("</script>");
		}
	}

}
