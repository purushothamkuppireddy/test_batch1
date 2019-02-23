package testpack;
import java.math.*;
import java.util.Scanner;

public class testcat {

	public static void main(String[] args) {
		
		System.out.println("enter the positions of catA,catB and mouse");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(Math.abs(c-a)==Math.abs(b-c))
		{
			System.out.println("mouse will escape");
			
			
		}
		else if(Math.abs(a-c)>Math.abs(b-c))
		{
			System.out.println("cat B");
		}
		else
		{
			System.out.println("cat A");
		}
		
	}

}
