package week1.day1;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		int input=29;
		boolean flag=false;
		int temp=input/2;
		for(int i=2;i<=temp;i++)
			{
					int modulo =input % i;
					if(modulo==0)
					{
						flag =true;
						break;
					}
			}
		if(flag==false)
			System.out.println(input+" is a prime number");
		else
			System.out.println(input+" is not a prime number");
	}
}
