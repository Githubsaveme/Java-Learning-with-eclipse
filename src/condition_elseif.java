import java.util.Scanner;

public class condition_elseif {

	public static void main(String[] args) {

		int marks;
		System.out.print("ENTER MARKS:- ");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		if(marks>=60 && marks<=100)
		{
		     System.out.print("First DIVISION");
		}
		
		else if(marks>=45 && marks<60)
		{
			System.out.print("Second DIVISION");
		}
        else if(marks>=33 && marks<45)
		{
			System.out.print("Third DIVISION");
		}
			else
		{
            System.out.print("Failed...");
		}
	
	}
}
// This is Condition_elseif program.
