import java.util.Scanner;
class Bank
{
	private double bal =5000; 
	private double money;
	private int pwd;
  //Deposite money
	public void Deposite()
	{  
	     System.out.print("Enter pwd: ");
	     Scanner s=new Scanner(System.in);
	     pwd=s.nextInt();
	     //amount deposite
	     System.out.print("Enter Deposite Amount: ");
	     Scanner  dep=new Scanner (System.in);
	     money=dep.nextInt();
            
	     if(pwd==123)
	     {
	     	bal=bal+money;
	     	System.out.print("Deposited money :"+ money);
	     	System.out.print("Total Balance :"+ bal);
	     }
	     else
	     {
	     	System.out.print("Incorrect password...");
	     }
	}
	//Withdraw
	public void Withdraw()
	{
		System.out.print("Enter pwd :");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		//
		System.out.print("Enter Withdraw Amount: ");
	     Scanner  dep=new Scanner (System.in);
	     money=dep.nextInt();
	     if(pwd==123)
	     {
	     	bal=bal-money;
	     	System.out.print("Withdraw money :"+ money);
	     	System.out.print("Total Balance :"+ bal);
	     }
	     else
	     {
	     	System.out.print("Incorrect password...");
	     }

	}
	//checkbalance
	public void Checkbal()
	{
		System.out.print("Enter pwd :");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();

		if(pwd==123)
		{
			System.out.print("Total Balance"+bal);
		}
	}
}
class Customer 
{
	public static void main(String[] args) {
	
	Bank b=new Bank();//object

	int ch;//for switch 
	System.out.println("1.Deposite");
	System.out.println("2.Withdraw");
	System.out.println("3.Checkbal");

	System.out.println("\nEnter Choice :");
	Scanner sw=new Scanner(System.in);
	ch=sw.nextInt();	
	 
	 //switch
	switch(ch)
	{
		case 1 :b.Deposite();
		         break;
		case 2 :b.Withdraw();
		          break;     
		case 3 :b.Checkbal();
		          break;   
		default: System.out.print("Invalid");          
	}



	}

}