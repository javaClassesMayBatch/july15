package july15.exception;

import java.util.Scanner;

public class Introduction {

	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numerator: ");
		int numerator = sc.nextInt();
		System.out.println("enter denominator: ");
		int denominator = sc.nextInt();
		try{			
			System.out.println("Result is: "+numerator/denominator);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("exiting program 1");
		
		System.out.println("enter first num: ");
		int first = sc.nextInt();
		System.out.println("enter second num12: ");
		int second = sc.nextInt();
		System.out.println("Result is: "+(first+second));
		System.out.println("exiting program 2");
		
	}
}
