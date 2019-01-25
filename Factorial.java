import java.util.Scanner;

public class Factorial
{
	public int factorial(int n, String type)
	{
		if (type.equals("iterative"))
		{
			return factorial_iterative(n);
		}
		else
		{
			return factorial_recursive(n);
		}
	}

	public int factorial_iterative(int n)
	{
			int k = 1;
			for(int i = 1; i <= n; i++)
			{
				k *= i;
			}
			return k;
	}

	public int factorial_recursive(int n)
	{
			if (n <= 1)
			{
				return n;
			}
			else 
			{
				return n*factorial_recursive(n-1);
			}
	}

}