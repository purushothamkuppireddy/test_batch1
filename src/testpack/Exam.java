package testpack;

import java.util.Scanner;

public class Exam {

			int mars(String s1) {
		        String s = "SOS";
		        int count = 0;
		        for (int i = 0; i < s1.length(); i++) {
		            if (s1.charAt(i) != s.charAt(i % 3)){
		            	count++;
		            }
		        }
		        return count;
		    }
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("enter the message in capitals");
				Scanner sc=new Scanner(System.in);
				String earth=sc.next();
				Exam t=new Exam();
				int res=t.mars(earth);
				
				System.out.println(String.valueOf(res));
			}

			


		
		
		
	}
	
	
	

