package JavaAssisment;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENTER THE VALUE OF A");
		int a =sc.nextInt();
		
		System.out.println("ENTER THE VALUE OF b");
		int b =sc.nextInt();
		
		System.out.println("ENTER THE VALUE OF c");
		int c=sc.nextInt();
		
		System.out.println("ENTER THE VALUE OF d");
		int d=sc.nextInt();
	
		int x= a+b;
		
		int y=c+d;
		 System.out.println("Sum of a and b (x): " + x);
	        System.out.println("Sum of c and d (y): " + y);
		if (x>y)
		{
			System.out.println("The sum of a and b is greater than the sum of c and d");
		}
		//else
		//{
			//System.out.println("");
		//}
		
		

	}

}
