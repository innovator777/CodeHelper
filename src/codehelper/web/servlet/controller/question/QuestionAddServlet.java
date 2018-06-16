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

@WebServlet("/questionAdd.do")
public class QuestionAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		
		Question question = new Question();
		question.setTitle(request.getParameter("qTitle"));
		question.setContents(request.getParameter("qContents"));
		Date today = new Date(Calendar.getInstance().getTimeInMillis());
		question.setCreateDate(today);
		Member member = (Member)request.getSession().getAttribute("member");
		question.setWriterId(member.getId());
		
		int result = questionService.addQuestion(question);
		if (result == 1) {
			request.setAttribute("questionId", question.getId());
			request.getRequestDispatcher("question_detail.jsp").forward(request, response);
		}
	}

}
