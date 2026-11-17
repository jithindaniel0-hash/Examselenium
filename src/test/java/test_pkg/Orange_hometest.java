package test_pkg;

import org.testng.annotations.Test;

import base_pkg.Orange_base;

public class Orange_hometest extends Orange_base{
	
	@Test(priority = 1)
	public void hometest() throws Exception
	{
		homeobj.logoMtd();
		homeobj.adminmtd();
		homeobj.screenmtd();
	}

}
