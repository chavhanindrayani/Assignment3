import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int n=1234;
		int rev=0;
		int rem;
		int c = n;

		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse Number = " +rev);
	}
}