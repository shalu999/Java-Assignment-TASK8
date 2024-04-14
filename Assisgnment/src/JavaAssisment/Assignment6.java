package JavaAssisment;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		if (age>=60) {
			System.out.println("You age is above 60 so you are Senior Citizen");
		}
		else
		{
			System.out.println("You age is below 60 so you are  not a Senior Citizen");
		}

	}

}
