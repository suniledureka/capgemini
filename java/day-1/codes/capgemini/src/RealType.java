
public class RealType {

	public static void main(String[] args) {
		//float sal = 2500.75; //Type mismatch: cannot convert from double to float
		//float sal = 2500.75f;
		//float sal = 2500.75F;
		float sal = (float)2500.75;
		System.out.println("my salary = " + sal);
		
		//double data = 3500.5;
		//double data = 3500.5d;
		double data = 3500.5D;
		System.out.println(data);
	}

}
