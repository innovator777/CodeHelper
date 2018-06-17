package codehelper.web.servlet.controller.answer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.service.logic.AnswerServiceLogic;

@WebServlet("/answerRemove.do")
public class AnswerRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnswerService answerService = new AnswerServiceLogic();
		
		String answerId = request.getParameter("answerId");
		String questionId = request.getParameter("questionId");
		
		answerService.removeAnswer(Integer.parseInt(answerId));
		
		request.setAttribute("questionId", questionId);
		request.getRequestDispatcher("questionDetail.do").forward(request, response);
	}

}
