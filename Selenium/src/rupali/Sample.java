package rupali;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Number");
		
	Scanner scan=new Scanner(System.in);
	
	int a=scan.nextInt();
	
	
		if ((a>0)&&(a<=100))
		{
			System.out.println("a is small number");
		
	}
		else if((a>=101)&&(a<=1000))
		{
			System.out.println("A is Medium number");
		}
		else if((a>=1001)&&(a<=10000))
		{
			System.out.println("A is High number");
		}
		else
		{
			System.out.println("Number is negative or invalid");
		}

	}
	
}

	
		
	
			
		