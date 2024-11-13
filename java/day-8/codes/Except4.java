class Except4 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int z = x / y;
		System.out.printf("%d / %d = %d\n", x, y, z);
	  }catch(ArithmeticException ex){
		  System.out.println("cannot divide a number by 0");
	  }
		System.out.println("---- done ----");
	}
}
