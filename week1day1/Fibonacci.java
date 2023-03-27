package week1day1;

public class Fibonacci {

	public static void main(String[] args) {
		int num=8,sum=0,first=0,sec=1;
		System.out.println(first);
		System.out.println(sec);
		for(int i=2;i<num;i++)
		{
			sum=first+sec;
			System.out.println(sum);
			first=sec;
			sec=sum;
			
		}

	}

}
