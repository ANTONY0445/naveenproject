package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.basee.NaveenBase;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport extends NaveenBase{

	public static void genetateReport ( String json ) {
		
		File source = new File ("target");
		Configuration config = new Configuration(source , "Naveen Automation");
		config.addClassifications("Tools", "Cucumber");
		config.addClassifications("jdk", "11");
		
		
		List<String> list = new LinkedList <String >();
		list.add(json);
		
		ReportBuilder report = new ReportBuilder(list, config);
		report.generateReports();
	}
	
}
