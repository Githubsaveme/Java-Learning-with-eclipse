import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		int num;
		System.out.print("ENTER NUMBER=");
		Scanner s= new Scanner(System.in);
	      num=s.nextInt();
	     
	      while(num>=0)
	      {
	    	  if(num%2==0)
	    	  {
	    		System.out.println("EVEN NUMBER");
	    		break;
	    	  }
	    	  else
	    	  {
	    		  System.out.println("ODD NUMBER");  
	    		  break;
	    	  }
	      }
		  System.out.println("While loop end");  

	}

}
