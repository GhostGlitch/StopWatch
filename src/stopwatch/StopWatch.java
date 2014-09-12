package stopwatch;

public class StopWatch
{
	public void start()
	{
		for (int minutes = 0; minutes <= 60; minutes++)
		{
			for (int seconds = 0; seconds <= 60; seconds++)
			{
				for (int centiseconds = 0; centiseconds <= 10; centiseconds++)
				{
					for (int clr = 0; clr < 50; clr++)
					{
					System.out.println();
					}
					System.out.print(minutes + ":" + seconds + ":" + centiseconds);
					try
					{
						Thread.sleep(100);
					}
					catch (InterruptedException ex)
					{
						Thread.currentThread().interrupt();
					}
				}
			}
		}
	}
}
