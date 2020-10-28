package FB1;

import org.junit.Assert;
import org.junit.Test;

public class Test3 {
	@Test
	public void test()
	{
		Fb fizzbuzz=new Fb();
		Assert.assertEquals("FizzBuzz",fizzbuzz.action(30));
	}

}
