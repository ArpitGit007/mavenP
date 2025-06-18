package com.GST.mavenP;

import org.testng.annotations.Test;

public class GroupTests {
	
	@Test(groups = "smoke")
	public void smoke() {
		System.out.println("Smoke test");
	}

	@Test(groups = "regression")
	public void regression() {
		System.out.println("Regression test");
	}

	@Test(groups = { "smoke", "regression" })
	public void smokeAndRegression() {
		System.out.println("Smoke and Regression test");
	}
}
