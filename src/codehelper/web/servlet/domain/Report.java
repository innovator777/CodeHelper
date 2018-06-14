package codehelper.web.servlet.domain;

import java.util.Date;

public class Report {
	
	public enum Type {
	}
	
	private int id;
	private String writer;
	private Type contents;
	private Date date;
	private int qId;
	private int aId;
	private boolean check;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
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
	
	public int getQId() {
		return qId;
	}
	
	public void setQId(int qId) {
		this.qId = qId;
	}
	
	public int getAId() {
		return aId;
	}
	
	public void setAId(int aId) {
		this.aId = aId;
	}
	
	public boolean isCheck() {
		return check;
	}
	
	public void setCheck(boolean check) {
		this.check = check;
	}
}
