import java.util.Scanner;
public class Reverse
{
	public static void main(String arg[])
	{
		Scanner s =new Scanner(System.in);
		String A=s.nextLine();
		for (int i=0;i<A.length(); i++)
		{
			if(A.charAt(i)==A.charAt((A.length()-1)-i))
			{
				if(i==(A.length()-1))
					System.out.println("YES");
				else 
					continue;
			}
			else
			{
				System.out.println("NO");
			        break;
			}
		}
	}
}	
/*
madam
YES

987
NO

suchi
NO
*/