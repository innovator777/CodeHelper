package codehelper.web.servlet.domain;

public class CoinHistory {
	
	public enum Type {
		CHARGE,
		EXCHANGE,
	}
	
	private int id;
	private String member;
	private Type type;
	private int qId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMember() {
		return member;
	}
	
	public void setMember(String member) {
		this.member = member;
	}
	
	public Type getKind() {
		return type;
	}
	
	public void setKind(Type type) {
		this.type = type;
	}
	
	public int getQId() {
		return qId;
	}
	
	public void setQId(int qId) {
		this.qId = qId;
	}
}
