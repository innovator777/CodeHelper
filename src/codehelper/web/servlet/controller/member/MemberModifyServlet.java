package codehelper.web.servlet.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.logic.MemberServiceLogic;

@WebServlet("/memberModify.do")
public class MemberModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = (String)request.getSession().getAttribute("loginId");
		
		MemberService memberService = new MemberServiceLogic();
		Member member = memberService.findMemeber(id);
		
		request.setAttribute("member", member);
		request.getRequestDispatcher("views/member_modify.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password1");
		String name = request.getParameter("nickname");
		
		MemberService memberService = new MemberServiceLogic();
	
		String id = (String)request.getSession().getAttribute("loginId");
		
		Member member = memberService.findMemeber(id);
		member.setPassword(password);
		member.setName(name);
		memberService.modifyMember(member);
		
		request.getSession().setAttribute("name", member.getName());
		
		response.sendRedirect(request.getContextPath()+"/memberList.do");
	}

}
