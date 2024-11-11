class A
{
	void display(){
		System.out.println("in class A");
	}
}

class B extends A
{
	void display(){
		System.out.println("in class B");
	}
}

class Polymorphism 
{
	public static void main(String[] args) 
	{
		//A ref = new A();
		//B ref = new B();
		A ref = new B();
		ref.display();
	}
}
