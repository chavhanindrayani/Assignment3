import java.util.*;
class excluding5and6
{
	public static void main(String args[])
	{
		int num = 10;
		for(int i=1; i<=num; i++)
		{
		     if(i == 5 || i == 6)
		     {
		          continue;
			 }
			 else
			 {
				 System.out.println(i+"\s");
			 }
		 }
	}
}