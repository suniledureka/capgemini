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

class C extends A
{
	void display(){
		System.out.println("in class C");
	}
}

public class Polymorphism1 
{
	public static void main(String[] args) 
	{
		A aRef = new A();
		B bRef = new B();
		C cRef = new C();

		//A obj = aRef;
		//A obj = bRef;
		A obj = cRef;
		obj.display();

		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof Object);
	}
}
