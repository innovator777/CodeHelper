package codehelper.web.servlet.domain;

import java.util.Date;

public class Report {
	
	public enum Type {
		// 상의 필요
	}
	
	private int id;
	private Member writer;
	private Type contents;
	private Date date;
	private Question question;
	private Answer answer;
	private boolean check;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Member getWriter() {
		return writer;
	}
	
	public void setWriter(Member writer) {
		this.writer = writer;
	}
	
	public Type getContents() {
		return contents;
	}
	
	public void setContents(Type contents) {
		this.contents = contents;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public Answer getAnswer() {
		return answer;
	}
	
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	public boolean isCheck() {
		return check;
	}
	
	public void setCheck(boolean check) {
		this.check = check;
	}
}
