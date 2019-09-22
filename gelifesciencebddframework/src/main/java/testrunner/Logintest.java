package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\My WorkSpace_Eclipse\\gelifesciencebddframework\\src\\main\\java\\Features",
							glue="stepdefinitions",
							format={"pretty"},
							monochrome=true,
							strict=false,
							dryRun=false
							)


public class Logintest {

}
