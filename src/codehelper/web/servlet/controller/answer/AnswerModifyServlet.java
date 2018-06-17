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
import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.service.logic.AnswerServiceLogic;

@WebServlet("/answerModify.do")
public class AnswerModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnswerService answerService = new AnswerServiceLogic();
		String answerId = request.getParameter("answerId");
		String questionId = request.getParameter("questionId");
		Answer answer = answerService.findById(Integer.valueOf(answerId));
		
		request.setAttribute("answer", answer);
		request.setAttribute("questionId", questionId);
		request.getRequestDispatcher("/views/answer_modify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnswerService answerService = new AnswerServiceLogic();
		
		String answerId = request.getParameter("answerId");
		String contents = request.getParameter("contents");
		String questionId = request.getParameter("questionId");
		
		Answer answer = answerService.findById(Integer.valueOf(answerId));
		answer.setContents(contents);
		Date today = new Date(Calendar.getInstance().getTimeInMillis());
		answer.setCreatedDate(today);
		answerService.modifyAnswer(answer);
		
		request.setAttribute("questionId", Integer.valueOf(questionId));
		request.getRequestDispatcher("questionDetail.do").forward(request, response);
		
	}

}
