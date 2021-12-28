import java.util.Scanner;
public class Primes
{
	public static void main(String arg[])
	{
		Scanner s =new Scanner(System.in);
		int count=0;
		int n=s.nextInt();
		s.close();
		for(int i=2; i<n/2; i++)
		{
			if (n % i == 0)
				count++;
		}
		
		if( count== 0)
			System.out.println(n+" is a prime number.");
		else
			System.out.println(n+" is NOT a prime number.");
	}
}
/*
3
3 is a prime number.
PS C:\suchi\javaprograms> java Primes
9
9 is NOT a prime number.
PS C:\suchi\javaprograms> java Primes
-9
-9 is a prime number.
*/