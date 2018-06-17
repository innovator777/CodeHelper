package codehelper.web.servlet.controller.member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		QuestionService questionService = new QuestionServiceLogic();
		MemberService memberService = new MemberServiceLogic();
		AnswerService answerService = new AnswerServiceLogic();
		
		String id =(String)request.getSession().getAttribute("loginId");
		Member member = memberService.findMember(id);

		
		List<Question> questions = questionService.findByMemeber(member);
		for (Question question : questions) {
			List<Answer> answers = answerService.findByQuestion(question.getId());
			question.setAnswers(answers);
		}
		
		List<Answer> answers = answerService.findByMember(id);
		List<String> questionTitles = null;
		
		if(answers != null && !answers.isEmpty()) {
			questionTitles = new ArrayList<>();
			for(Answer answer : answers) {
				Question question = questionService.find(answer.getQuestionId());
				questionTitles.add(question.getTitle());
			}
			request.setAttribute("questionTitles", questionTitles);
		}
		
		request.setAttribute("questions", questions);
		request.setAttribute("answers", answers);
		request.setAttribute("name", member.getName());
		request.setAttribute("id", member.getId());
		request.setAttribute("balance", member.getBalance());
		
		request.getRequestDispatcher("/views/my_member.jsp").forward(request, response);
	}

}
