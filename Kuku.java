/**九九を出題し正答率を表示する */

import java.io.*;

public class Kuku
{
	/** 出題数 */
	public static final int ProblemNum = 3;
	public static void main(String[] args)
	{
		int CorrectCount = 0;
		for (int i = 0; i < ProblemNum; i++)
		{
			boolean result = quiz(i);
			if (result)
			{
				System.out.println("Correct!");
				CorrectCount++;
			}
			else
			{
				System.out.println("Wrong...");
			}
		}
		System.out.println("Your correct rate is " + CorrectCount * 100.0 / ProblemNum + "%");
	}

	public static boolean quiz(int n)
	{
		int x = (int) (Math.random() * 9) + 1;
		int y = (int) (Math.random() * 9) + 1;
		System.out.println("Q." + n + " " + x + " * " + y + " = ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String line = reader.readLine();
			int answer = Integer.parseInt(line);
			return answer == x * y;
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Input is Invalid");
		}
		return false;
	}
}
