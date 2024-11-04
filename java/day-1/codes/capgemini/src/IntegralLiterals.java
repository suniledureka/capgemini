
public class IntegralLiterals {

	public static void main(String[] args) {
		System.out.println(12);
		System.out.println(012);
		System.out.println(0x12);
		System.out.println(0X12);
		System.out.println(0b11);
		System.out.println(0B11);
		System.out.println(010 + 012);
		System.out.println();
		
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(18));
		System.out.println(Integer.toBinaryString(3));
		
		System.out.println(Integer.toHexString(255));
	}

}
