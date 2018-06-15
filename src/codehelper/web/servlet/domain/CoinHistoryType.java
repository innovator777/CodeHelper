package codehelper.web.servlet.domain;

public enum CoinHistoryType {
	CHARGE(1),
	EXCHANGE(2),
	ASKED(3),
	CHOSE(4);
	
	private int value;

	CoinHistoryType(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public static CoinHistoryType valueOf(int value) {
		switch (value) {
		case 1:
			return CHARGE;
		case 2:
			return EXCHANGE;
		case 3:
			return ASKED;
		case 4:
			return CHOSE;
		default:
			throw new AssertionError("Unknown vlaue " + value);
		}
	}
}