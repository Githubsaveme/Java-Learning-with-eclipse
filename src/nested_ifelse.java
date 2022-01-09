// This is nested_ifelse program.

 class nested_ifelse {

	public static void main(String[] args) {

		
		int num1=10,num3=30;
		double num2=100.3;
		if(num1>num2)
		{
		if(num1>num3)
		{
			System.out.print("Maximum No.="+num1 ); 	
		}
		else 
		{
			System.out.print("Maximum no.="+num3);	
		}
		}
		
		else
		{
		if(num2>num3)
         {
        	 System.out.print("Maximun Num-"+num2);
         }
         else
         {
        	 System.out.print("Maximum No-"+num3); 
         }
		   
		}
	
		}
	 }	
	

