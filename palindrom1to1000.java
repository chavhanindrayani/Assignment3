import java.util.*;
class palindrom1to1000
{
	public static void main(String args[])
	{
        int number = 1000;
		for(int i=1; i<=number; i++)
		{
			int rev = 0;
		    int rem;
		    int num = i;
		    int temp = num;
		    while(num > 0)
		    {
			    rem = num % 10;
			    rev = rev * 10+rem;
			    num = num / 10;
		    }
		    if(temp == rev)
		    {
			     System.out.println("palindrom number = "+temp);
	        }

	     }
     }
}