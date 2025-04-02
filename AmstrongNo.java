import java.util.*;
class AmstrongNo
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();

		int sum=0;
		int rem=0;
		int copy=n;

		while(n>0)
		{
			rem=n%10;
			sum=rem*rem*rem+sum;
			n=n/10;
		}
		if(copy == sum)
		{
			System.out.println("This number is amstrong");
		}
		else
		{
			System.out.println("This number is not amstrong");
        }
	}
}