class Except6
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int z = x / y;
		System.out.printf("%d / %d = %d\n", x, y, z);
	  }catch(Exception ex){
		  System.out.println("exception occured!!!");

		  System.out.println("message = " + ex.getMessage());

		  System.out.println("toString() = " + ex.toString()); //object_type + message
		  System.out.println();

		  ex.printStackTrace(); // toString() + callstack
		  System.out.println();

		  if(ex instanceof ArithmeticException){	
		    System.out.println("CAN'T DIVIDE AN INTEGER BY ZERO");
		  }
	  }

	  System.out.println("---- done ----");
	}
}
