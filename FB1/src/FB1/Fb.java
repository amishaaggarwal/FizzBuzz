package FB1;

public class Fb {
	
	public static void main(String[] args){
		for(int i=1;i<=100;i++)
		{
			String r = action(i);
			System.out.println(r);
		}
	}

	public static String action(int i) 
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
