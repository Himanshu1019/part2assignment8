package ass8;

import java.util.Scanner;

public class uc1employee {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculate c=new Calculate();
			c.m1();

		}
	}
			class Calculate
			{
				
				public static void m1()
				{
					int hour=160,wage,total;
				int win =(int) Math.floor(Math.random()*10)%2;
				if (win==1) 
				{
					System.out.println(" employeer is present");
					Scanner s = new Scanner(System.in);
					System.out.println("enter the amount per hour for an employeer ");
					wage = s.nextInt();
					
					total=hour*wage;
					System.out.println(" the total wage for the employeer this month is  "+ total);
				}
				else if(win==0)
				{
					
					System.out.println("  sorry today employeer is absent");
					
				}
				
			}
			
		



	}


