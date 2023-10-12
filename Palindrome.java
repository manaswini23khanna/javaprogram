package pack1;
import java.util.Scanner;

public class Palindrome 
{
	static Scanner sc = new Scanner(System.in);
	static int CheckPrime(int original)
	{
		int rev = 0;
		int temp = original;
		while (temp > 0)
		{
			int lastdigit = temp % 10;
			rev = rev * 10 + lastdigit;
			temp = temp / 10;
		}
		if(original == rev)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	static void m1()
	{
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		for(int i = a; i <= b; i++)
		{
			if(CheckPrime(i)==1)
			{
				System.out.println(i+ " ");
			}
		}
	}

	public static void main(String[] args) 
	{
		m1();
		

	}

}