interface Bank
{
	int n =25;

	void deposit(float amt);
	void withdraw(float amt);

	default void gstCalculation(){
		System.out.println("GST Calculation method");
	}

	static void staticMethod(){
		System.out.println("static method in java 8 interfaces");
	}
}