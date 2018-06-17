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

@WebServlet("/questionList.do")
public class QuestionListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		AnswerService answerService = new AnswerServiceLogic();
		
		List<Question> questionList = questionService.findAll();
		
		for (Question question : questionList) {
			List<Answer> answers = answerService.findByQuestion(question.getId());
			question.setAnswers(answers);
		}
		
		request.setAttribute("questionList", questionList);
		request.getRequestDispatcher("/views/question_list.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
}
