package FB1;

import org.junit.Assert;
import org.junit.Test;

public class Test2 {
	@Test
	public void test()
	{
		Fb fizzbuzz=new Fb();
		Assert.assertEquals("Buzz",fizzbuzz.action(20));
	}

}
