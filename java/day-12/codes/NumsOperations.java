class NumsOperations 
{
	public static void main(String[] args) 
	{
		int x = 12;
		int y = 13;
		
		/*
		Nums numsRef1 = new Nums(){
			public int addNum(int x, int y){
				return x+y;
			}
		};
		*/
	
		/*
		Nums numsRef1 = (int a, int b) -> {
				return a+b;
			};
		*/

		Nums  numsRef1 = (a, b) -> (a+b);
		int z = numsRef1.addNum(x, y);
		System.out.printf("%d + %d = %d", x, y, z);

	}
}
