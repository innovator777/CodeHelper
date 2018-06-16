package codehelper.web.servlet.controller.question;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/questionRemove.do")
public class QuestionRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		
		String questionId = request.getParameter("questionId");
		questionService.removeQuestion(Integer.valueOf(questionId));
		
		response.sendRedirect(request.getContextPath());
	}

}
