package week1.day1;
public class Factorial
{
	public static void main(String[] args)
	{
		int fact=1,input=5;
		for(int i=input;i>1;i--)
		{
			fact= fact * i;
		}
		System.out.println("Factorial value: "+fact);
	}
}
