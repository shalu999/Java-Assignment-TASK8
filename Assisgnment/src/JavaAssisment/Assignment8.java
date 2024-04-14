package JavaAssisment;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		int a;
		
		//Creating the object of Scanner class
		Scanner sc= new Scanner(System.in);
		//Taking the input from keyboard
		System.out.println("Enter the Integer ");
		a=sc.nextInt();
		
		
		//Converting the Integer to string
		String b= Integer.toString(a);
		
		//calling the length method and assigning the the length of the String to length variable
		int length=b.length();
		
		//Printing the output
		System.out.println("The lenth of the Integer is "+length);

	}

}
