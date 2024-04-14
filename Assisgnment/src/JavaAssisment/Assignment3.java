package JavaAssisment;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
	
		int c;
		
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter A");
	int a = sc.nextInt();
	System.out.println("Enter B");
	int b = sc.nextInt();
	   
	c=b;b=a;a=c;
	System.out.println("a " + a);
	System.out.println("b " +  b);
	
	
	}

}
