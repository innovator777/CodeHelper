package codehelper.web.servlet.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.logic.MemberServiceLogic;

@WebServlet("/memberRemove.do")
public class MemberRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("memberId");
		
		MemberService memberService = new MemberServiceLogic();
		memberService.removeMember(id);
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		response.sendRedirect(request.getContextPath());
	}

}
