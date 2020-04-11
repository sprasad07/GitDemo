package com.practice.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test
    public void shouldAnswerWithTrue()
    {
		Assert.assertTrue(true);
		System.out.println("New Test Pass");
    }
	
	@Test
	public void SampleTest()
	{
		Assert.assertTrue(true);
		System.out.println("Sample Test Pass");
	}
}
