package FB1;

import org.junit.Assert;
import org.junit.Test;

public class Test4 {
	@Test
	public void test()
	{
		Fb fizzbuzz=new Fb();
		Assert.assertEquals("Number entered is not in range of 1-100",fizzbuzz.action(130));
		Assert.assertEquals("1",fizzbuzz.action(1));
		Assert.assertEquals("Number entered is not in range of 1-100",fizzbuzz.action(0));
		Assert.assertEquals("23",fizzbuzz.action(23));
		Assert.assertEquals("91",fizzbuzz.action(91));
		
	}

}
