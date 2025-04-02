import java.util.*;
class primeOrNot
{
	public static void main(String args[])
	{
		int i = 0;
		int j = 0;

		for(i=1; i<=10; i++)
		{
			for(j=2; j<=10; j++)

			if(i % j == 0)
			{
					System.out.println("This is prime number ");
			}
			else
			{
				    System.out.println("This is not prime number ");
		    }
		}
	}

}