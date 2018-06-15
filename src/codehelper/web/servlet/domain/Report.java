package codehelper.web.servlet.domain;

import java.util.Date;

public class Report {
	
	public enum Type {
	}
	
	private int id;
	private String memberId;
	private Type contents;
	private Date date;
	private int questionId;
	private int answerId;
	private String attacker;
	private boolean check;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;

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
	
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public int getAnswerId() {
		return answerId;
	}
	
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	
	public boolean isCheck() {
		return check;
	}
	
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	public String getAttacker() {
		return attacker;
	}
	
	public void setAttacker(String attacker) {
		this.attacker = attacker;
	}

}
