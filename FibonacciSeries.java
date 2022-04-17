package week1.day1;

public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		// input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		int firstNum = 0, secNum = 1,range=8;
		System.out.println("Fibonacci Series for 8");
		System.out.println(firstNum);
		for(int i=1;i<range;i++)
		{
			int sum= firstNum + secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(firstNum);
		}
	}
}
