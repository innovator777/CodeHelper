package codehelper.web.servlet.domain;

public enum ReportType {
	A(1), B(2), C(3);

	private int value;

	ReportType(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public static ReportType valueOf(int value) {
		switch (value) {
		case 1:
			return A;
		case 2:
			return B;
		case 3:
			return C;
		default:
			throw new AssertionError("Unknown vlaue " + value);
		}
	}
}