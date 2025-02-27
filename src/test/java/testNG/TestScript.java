package testNG;

import org.testng.annotations.Test;

import Baseclass.SampleBaseclass;

public class TestScript extends SampleBaseclass{

	@Test
	public void demo1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void demo2()
	{
		System.out.println("test2");
	}
}
