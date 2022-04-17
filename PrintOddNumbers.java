package week1.day1;
public class PrintOddNumbers {
	public static void main(String[] args)
	{
		int input=20;
		System.out.println("Odd Numbers:");
		for(int i=1;i<=input;i++)
		{
			if(i%2!=0)
				System.out.println(i);
			else
				continue;
		}
	}

}
