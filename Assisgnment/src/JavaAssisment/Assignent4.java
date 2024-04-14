package JavaAssisment;

import java.util.Scanner;

public class Assignent4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int a=1;
		for(int i=1;i<=number;i++)
		{
			a=a*i;
			
		}
		System.out.println("factorial "+ a);
	}

}
