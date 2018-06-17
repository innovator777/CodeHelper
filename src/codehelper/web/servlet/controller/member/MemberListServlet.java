package codehelper.web.servlet.controller.member;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codehelper.web.servlet.domain.Answer;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.AnswerServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/memberList.do")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberService memberService = new MemberServiceLogic();
		Member member = (Member)session.getAttribute("member");
		
		String id = member.getId();
		member = memberService.findMemeber(id);

		List<Question> questions = null;
		QuestionService questionService = new QuestionServiceLogic();
		questions = questionService.findByMemeber(member);
		
		List<Answer> answers = null;
		AnswerService answerService = new AnswerServiceLogic();
		answers = answerService.findByMember(id);
		
		request.setAttribute("questions", questions);
		request.setAttribute("answers", answers);
		request.setAttribute("member", member);
		
		request.getRequestDispatcher("/views/my_member.jsp").forward(request, response);
	}

}
