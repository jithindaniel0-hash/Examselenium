package test_pkg;

import org.testng.annotations.Test;

import base_pkg.Orange_base;

public class Orange_logintest extends Orange_base{
	
	@Test(priority = 1)
	public void loginTest()
	{
		loginobj.loginMtd();
	}

}
