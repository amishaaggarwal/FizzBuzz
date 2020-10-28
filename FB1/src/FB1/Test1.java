package FB1;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {
	@Test
	public void test()
	{
		Fb fizzbuzz=new Fb();
		Assert.assertEquals("Fizz",fizzbuzz.action(21));
	}

}
