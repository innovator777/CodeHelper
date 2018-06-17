package codehelper.web.servlet.controller.question;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/questionSearch.do")
public class QuestionSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		
		String searchType = request.getParameter("searchType");
		String searchEdit = request.getParameter("searchEdit");
		
		List<Question> questionList = null;
		
		if(!searchType.isEmpty() && !searchEdit.isEmpty()) {
			int value = Integer.valueOf(searchType);
			if(value == 1) {
				questionList = questionService.findByTitle(searchEdit);
			}
			else if (value == 2) {
				questionList = questionService.findByContents(searchEdit);
			}
			
			request.setAttribute("questionList", questionList);
			request.getRequestDispatcher("questionSearchList.do").forward(request, response);
		}
		
	}

}
