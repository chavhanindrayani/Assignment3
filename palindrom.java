import java.util.*;

class palindrom
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int rev=0;
		int rem=0;
		int c=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(c == rev)
		{
			System.out.println("this is palindrom number");
		}
		else
		{
			System.out.println("this is not palindrom number");
		}
	}
}