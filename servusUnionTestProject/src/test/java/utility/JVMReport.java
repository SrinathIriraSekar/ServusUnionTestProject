package utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void makeJVMReport(String report) {
		File location = new File(System.getProperty("user.dir","\\target"));
		Configuration configuration = new Configuration(location,"servusUnionTestProject");
		configuration.addClassifications("OS","Windows 10");
		configuration.addClassifications("Browser", "chrome");
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(report);
		ReportBuilder bulider = new ReportBuilder(jsonfiles,configuration);
		bulider.generateReports();
	}
}
