class GreetingsTest 
{
	public static void main(String[] args) 
	{
		/*
		//-- using anonymous class concept
		Greetings obj = new Greetings(){
			public void showGreetings(){
				System.out.println("Greetings from Capgemini");
			}
		};

		obj.showGreetings();
		*/


		//-- using lambad expression
		Greetings greetObj1 = () -> {
									System.out.println("Greetings from Capgemini");
						};
		greetObj1.showGreetings();
	

		//-- using lambad expression
		Greetings greetObj2 = () -> System.out.println("Greetings from Capgemini");
		greetObj2.showGreetings();
	}
}
