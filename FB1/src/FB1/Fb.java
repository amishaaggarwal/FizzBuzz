package FB1;

public class Fb {

	public String action(int i) 
	{
		if(i<=100 && i>=1)
		{
			if(i%15==0)
				return "FizzBuzz";
			else if(i%3==0)
				return "Fizz";
			else if(i%5==0)
				return "Buzz";
			else
				return i+"";
		}
		else
			return "Number entered is not in range of 1-100";
	}

}
