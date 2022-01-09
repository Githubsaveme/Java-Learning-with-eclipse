/*
 This is condition_ifelse Program
 */

import java.util.Scanner;
public class condition_ifelse {

	public static void main(String[] args) { 
		
		// This is Password Program
	/*	int pwd;
		System.out.print("Enter passwd:-");
		Scanner obj=new Scanner(System.in);
		pwd = obj.nextInt();
		if(pwd == 343434) // if u enter 343434 then output will come otherwise else print.
		
		{
			System.out.println("My Name:- Vishal Kumar");
	    	System.out.println("Age:- 21");
	    	System.out.println("Class: B.Tech (CSE) ");
	    	System.out.println("Semester:- 7th");
	    	System.out.println("Collage/university:- CT university ");
}
		else
			System.out.println("This is Wrong..."); //this else for other output if password doesn't match then it will execute
		
*/

		// This is vote program if candidate greater than or equal to 18 than eligible for vote. 
		int age;
		System.out.print("ENTER AGE-");
		Scanner obj=new Scanner(System.in);
		age =obj.nextInt();
		if (age>=18)  // If your age greater than 18 than you will eligible for vote.

		{
		
		System.out.println("ELIGIBLE FOR VOTE ");
		}
		
		else
			System.out.print("NOT ELIGIBLE FOR VOTE");
		 }
}