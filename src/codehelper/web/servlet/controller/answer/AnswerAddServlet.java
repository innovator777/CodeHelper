package codehelper.web.servlet.controller.answer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Answer;
import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.service.logic.AnswerServiceLogic;

@WebServlet("/answerAdd.do")
public class AnswerAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AnswerService service = new AnswerServiceLogic();
		
		Answer answer = new Answer();
		
	}

}
