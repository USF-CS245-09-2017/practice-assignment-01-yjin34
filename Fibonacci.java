import java.util.Scanner;

public class Fibonacci
{
	int fibonacci(int n, String type)
	{
		if (type.equals("recursive"))
		{
			return fibonacci_recursive(n);
		}
		else
		{
			return fibonacci_iterative(n);
		}
	}

	int fibonacci_recursive(int n)
	{
			if (n <= 1)
			{
				return n;
			}
			else
			{
				return fibonacci_recursive(n-1)+fibonacci_recursive(n-2);
			}
	}

	int fibonacci_iterative(int n)
	{
			int a0 = 0;
			int a1 = 1;
			int a2;
			if (n <= 1)
			{
				return n;
			}
			else
			{
				for (int i = 0; i < n-1; i++ )
				{
					a2 = a0 + a1;
					a0 = a1;
					a1 = a2;
				}
				return a1;
			}

	}


}