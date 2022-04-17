package week1.day1;

public class SumOfDigits 
{
	public static void main(String[] args)
	{
		int input = 123;int sum=0;
		while(input>0)
		{
			int modulo=input%10;
			input = input/10;
			sum=sum+modulo;
		}
		System.out.println("Sum of the digits: "+sum);
	}
}
