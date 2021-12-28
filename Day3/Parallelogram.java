import java.util.Scanner;
public class Test3
{
	static int breadth;
	static int height;
	static
	{
		Scanner s=new Scanner(System.in);
		breadth=s.nextInt();
		height=s.nextInt();
	}
	public static void main(String arg[])
	{
		if(height <=100 && breadth<=100 && height >=-100 && breadth>=-100)
		{
			if( height>0 && breadth>0)
				System.out.println(height*breadth);
			else
				System.out.println("java.lang.Exception:Breadth and Height must be positive");
		}
		else
			System.out.println("Invalid Input.");
	}
}

 