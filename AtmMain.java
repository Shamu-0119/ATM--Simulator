package atm;

import java.util.Scanner;

public class AtmMain {
	
	private static int status;
	
	public static void main(String[] args) {
		AtmImpl impl=new AtmImpl();
		Scanner scanner=new Scanner(System.in);
		int accNum=12345;
		int accPin=5183;
		System.out.println("!*!*!*!WELCOME TO ATM MACHINE!*!*!*!");
		System.out.println("INSERT YOUR ATM CARD!!");
		System.out.println("ENTER YOUR ACCOUNT NUMBER:- ");
		int accNum1=scanner.nextInt();
		System.out.println("ENTER YOUR ATM PIN:- ");
		int pin=scanner.nextInt();
		if(accNum==accNum1 && accPin==pin) 
		{
			while(true) {
				System.out.println(" 1.ViewAvailable Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View MiniStatement\n 5.Exit\n");
				System.out.println("ENTER YOUR CHOICE:- ");
				int n=scanner.nextInt();
				if(n==1) 
				{
					impl.viewBalance();
				}
				else if(n==2)
				{
					System.out.println("Enter the amount to be withdrawn:- ");
					double withdraw=scanner.nextDouble();
					impl.withdrawAmount(withdraw);
				}
				else if(n==3)
				{
					System.out.println("Enter the amount to deposit:- ");
					double deposit=scanner.nextDouble();
					impl.depositAmount(deposit);
				}
				else if(n==4)
				{
					impl.viewMiniStatement();
				}
				else if(n==5)
				{
					System.out.println("COLLECT YOUR ATM CARD\n THANK YOU!");
					System.exit(status);
				}
			}
		}
		else 
		{
			System.out.println("INCORRECT ATM NUMBER OR PIN!!!");
		}
		
		scanner.close();

	}

}
