package codehelper.web.servlet.controller.question;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Answer;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.AnswerServiceLogic;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/questionDetail.do")
public class QuestionDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		AnswerService answerService = new AnswerServiceLogic();
		
		int questionId = (int)request.getAttribute("questionId");
		Question question = questionService.find(questionId);
		
		List<Answer> answers =  answerService.findByQuestion(questionId);
		question.setAnswers(answers);
		
		request.setAttribute("question", question);
		request.getRequestDispatcher("question_detail.jsp").forward(request, response);
	}

}
