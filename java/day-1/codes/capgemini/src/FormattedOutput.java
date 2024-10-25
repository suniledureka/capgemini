
public class FormattedOutput {

	public static void main(String[] args) {
		float data = 8574.56412f;
		System.out.println(data);
		System.out.printf("%f\n", data);
		System.out.printf("%.0f\n", data);
		System.out.printf("%.1f\n", data);
		System.out.printf("%.2f\n", data);
		System.out.printf("%.3f\n", data);
		
		int empno = 100678;
		String empName = "Sanjay Patil";
		float sal = 948500.5f;
		
		int empno1 = 101;
		String empName1 = "Praveen";
		float sal1 = 948500.5f;		
		
		System.out.printf("%-7d %-20s %.2f\n", empno, empName, sal);
		System.out.printf("%-7d %-20s %.2f", empno1, empName1, sal1);
	}
}
