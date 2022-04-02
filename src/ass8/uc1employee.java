package ass8;



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
					int hour=20,wage=20,total;
				int win =(int) Math.floor(Math.random()*10)%2;
				if (win==1) 
				{
					System.out.println(" employeer is present");
					total=hour*wage;
					System.out.println(" the total wage for the employeer todays is "+ total);
				}
				else if(win==0)
				{
					
					System.out.println(" employeer is absent");
					System.out.println(" please bring the part time worker");
					int hr=8;
					wage=25;
					total=hr*wage;
					
					System.out.println(" the total wage for the part time eemployeer todays is "+ total);
					
				}
				
			}
			
		



	}


