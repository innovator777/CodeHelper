package codehelper.web.servlet.controller.question;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

/**
 * Servlet implementation class QuestionCountServlet
 */
@WebServlet("/questionCount.do")
public class QuestionCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		
		String questionId = request.getParameter("questionId");
		
		Question question = questionService.find(Integer.valueOf(questionId));
		question.setReadCount(question.getReadCount() + 1);
		questionService.modifyQuestion(question);
		
		request.setAttribute(questionId, "questionId");
		request.getRequestDispatcher("questionDetail.do").forward(request, response);
	}

}
