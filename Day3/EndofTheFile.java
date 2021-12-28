
import java.io.*;
import java.util.Scanner;

public class EndofTheFile
{
	public static void main(String arg[])
	{	
		String s="Hello world\nI am a file\nRead me until end-of-file";
		Scanner scan=new Scanner(s);
		for (int i=1; scan.hasNext(); i++ )
			System.out.println(i+ " "+scan.nextLine());
	}	
}


 /*Ouput :
1 Hello world
2 I am a file
3 Read me until end-of-file
*/