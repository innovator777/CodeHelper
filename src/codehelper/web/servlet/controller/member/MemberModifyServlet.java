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

@WebServlet("/memberModify.do")
public class MemberModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("memberId");
		
		MemberService memberService = new MemberServiceLogic();
		Member member = memberService.findMemeber(id);
		
		request.setAttribute("member", member);
		request.getRequestDispatcher("views/modifyMember.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password1");
		String name = request.getParameter("nickname");
		
		MemberService memberService = new MemberServiceLogic();
	
		HttpSession session = request.getSession();
		Member member = (Member)session.getAttribute("member");
		
		member.setPassword(password);
		member.setName(name);
		memberService.modifyMember(member);
		
		response.sendRedirect(request.getContextPath());
	}

}
