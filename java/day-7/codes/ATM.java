import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Bank bank =  null;
		Scanner sc = new Scanner(System.in);

		System.out.print("Which Bank's Card is this? [1.SBI | 2.ICICI]: ");
		int cardType = sc.nextInt();

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("Card Read Error --- Try Again");
			    return;
		}//switch

		System.out.println("\n================== WELCOME TO " + bank.getClass().getName() + " ==================\n");

		bank.deposit(1000);
		bank.withdraw(500);

		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
		System.out.println(bank.n);

		//bank.n = 25; //cannot assign a value to static final variable n

		bank.gstCalculation();
		//bank.staticMethod(); //illegal static interface method call
		Bank.staticMethod();

		System.out.println(bank.toString());

		sc.close();
	}
}
