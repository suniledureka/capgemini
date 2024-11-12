interface Nums
{
	int add(int x, int y);
}

class Calculator 
{
	public static void main(String[] args) 
	{
		Nums ref = new Nums(){
		  public int add(int x, int y){
			  return x + y;
		  }
		};

		int x = 12;
		int y = 23;

		int sum = ref.add(x, y);

		System.out.printf("%d + %d = %d", x, y, sum);

		Nums ref1 = new Nums(){
		  public int add(int x, int y){
			  return x + y;
		  }
		};
	}
}
