package org.step;

import org.basee.NaveenBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends NaveenBase {

	public static NaveenBase automation = new NaveenBase();

	@Before
	public void browserAndUrl() {
		automation.initDriver("chrome");

		automation.LaunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@After
	public void quitAndClose() {

		automation.quiteAndClose();
	}
}
