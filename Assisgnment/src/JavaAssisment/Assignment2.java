package JavaAssisment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a= sc.nextInt();
		if (a%2==0) {
			System.out.println("The number is even");
		}
		else
			System.out.println("The number is odd");
		
		

	}

}
