package WebHadir.utils;

public enum TestCases {

	T1("Testing the authentication SignIn"),
	T2("Testing the employee reporting"),
	T3("Testing the authentication in manage position");
	
	private String testName;

	private TestCases(String values) {
		// TODO Auto-generated constructor stub
		this.testName = values;
	}

	public String getTestName() {
		return testName;
	}
	
}
