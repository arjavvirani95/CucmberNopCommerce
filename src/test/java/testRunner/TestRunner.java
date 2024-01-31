package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//FeatureFiles/"}, // all feature file will be executed.
		//features= {".//FeatureFiles/Login.feature"}, // for particular feature file.
		//features= {".//FeatureFiles/LoginDDTExcel.feature"}, // same as above.
		//features= {".//FeatureFiles/Login.feature",".//Features/Registration.feature"},  // suppose you have 3 feature and want to run only 2 of them.
		//features= {"@target/rerun.txt"}, // this will re run failure feature file.
		glue="stepDefinitions", // package name of stepdefinitions files.
		plugin= {"pretty", "html:reports/myreport.html",  // for JUnit ByDefault HTML reports.
				"rerun:target/rerun.txt", // once any scenario failed, rerun.txt file will capture those scenario.
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // this is for extent report plugin.
		},

		dryRun=false,    // checks mapping between scenario steps and step definition methods, true means it will just check every steps has its own method
		monochrome=true, // to avoid junk characters in output
		publish=false,  // to publish report in cucumber server
		//tags="@sanity" // this will execute scenarios tagged with @sanity
		tags="@regression"
		//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
		//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
		//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

}
