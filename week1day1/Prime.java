package week1day1;

public class Prime {

	public static void main(String[] args) {
			int num=17,count = 0;
			for(int i=1;i<=num;i++)
				{
					if(num%i==0)
						{
							count++;
						}
					else
						{
						continue;
						}
					
				}
			if(count==2)
			{
			System.out.println("Prime Number");	
			}
			else
			{
				System.out.println("not prime");
			}
			}
	}


