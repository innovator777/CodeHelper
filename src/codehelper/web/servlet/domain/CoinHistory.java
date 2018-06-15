package codehelper.web.servlet.domain;

public class CoinHistory {
	
	private int id;
	private String memberId;
	private CoinHistoryType type;
	private int questionId;
	private int amount;
	private int balance;
	
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
	
	public CoinHistoryType getType() {
		return type;
	}
	public void setType(CoinHistoryType type) {
		this.type = type;
	}
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
