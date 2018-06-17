package codehelper.web.servlet.controller.question;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.AnswerServiceLogic;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/choose.do")
public class ChooseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		AnswerService answerService = new AnswerServiceLogic();
		
		String questionId = request.getParameter("questionId");
		String answerId = request.getParameter("answerId");
		
		questionService.choose(Integer.valueOf(questionId), Integer.valueOf(answerId));
		answerService.choose(Integer.valueOf(questionId), Integer.valueOf(answerId));
		
		request.setAttribute("questionId", questionId);
		request.getRequestDispatcher("questionDetail.do").forward(request, response);
	}

}