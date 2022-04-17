package week1.day1;

public class ConvertToPositiveNumber 
{
	public static void main(String[] args)
	{
		int number=-40;
		if(number<0)
		{
			int output = number * (-1);
			System.out.println(number+" is converted to "+output);
			
		}
		else
			System.out.println("Number is positive");
	}
}
