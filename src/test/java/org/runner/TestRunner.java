package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\features\\naveen.feature",
glue= "org.step",
plugin= "json:target\\generateReport.json"
)

public class TestRunner {
	
	@AfterClass
	public static void report () {
		
		JVMReport.genetateReport("target\\generateReport.json");
		
	}
	

}
