import java.util.*;
class multiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number = ");
		int n = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			int table = i*n;
			System.out.println(table);
		}
	}
}