package codehelper.web.servlet.controller.answer;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Answer;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.logic.AnswerServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;

@WebServlet("/answerAdd.do")
public class AnswerAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnswerService answerService = new AnswerServiceLogic();
		MemberService memberService = new MemberServiceLogic();
		
		String contents = request.getParameter("contents");
		String questionId = request.getParameter("questionId");
		
		Answer answer = new Answer();
		answer.setContents(contents);
		Date today = new Date(Calendar.getInstance().getTimeInMillis());
		answer.setCreatedDate(today);
		answer.setQuestionId(Integer.parseInt(questionId));
		
		String loginId = (String)request.getSession().getAttribute("loginId");
		answer.setMemberId(loginId);
		
		answerService.addAnswer(answer);
		
		request.setAttribute("questionId", questionId);
		request.getRequestDispatcher("/questionDetail.do").forward(request, response);
	}

}
