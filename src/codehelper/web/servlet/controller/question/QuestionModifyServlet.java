package codehelper.web.servlet.controller.question;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/questionModify.do")
public class QuestionModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		
		String questionId = request.getParameter("questionId");
		Question question = questionService.find(Integer.valueOf(questionId));
		request.setAttribute("question", question);
		
		request.getRequestDispatcher("question_modify.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		QuestionService questionService = new QuestionServiceLogic();
		
		Question question = new Question();
		question.setTitle(request.getParameter("qTitle"));
		question.setContents(request.getParameter("qContents"));
		Date today = new Date(Calendar.getInstance().getTimeInMillis());
		question.setCreateDate(today);
		
		questionService.modifyQuestion(question);
		
		request.setAttribute("questionId", question.getId());
		
		request.getRequestDispatcher("question_detail.jsp").forward(request, response);
		
	}

}
