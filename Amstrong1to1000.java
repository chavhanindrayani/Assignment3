import java.util.*;
class Amstrong1to1000
{
	public static void main(String args[])
	{
		for(int i=1; i<=1000; i++)
		{
		int sum = 0;
		int rem = 0;
		int num = i;
		int temp = num;

		while(num > 0)
		{
			rem = num % 10;
			sum = sum + (rem*rem*rem);
			num = num / 10;
		}
		if(temp == sum)
		{
			System.out.println("Amstrong = " +temp);
		}
	    }
	}
}