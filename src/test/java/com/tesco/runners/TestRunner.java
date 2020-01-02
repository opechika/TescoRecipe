package com.tesco.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/tesco/features"},
        glue = {"com/tesco/hooks","com/tesco/stepDefintions"},
        plugin = {"pretty", "json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports: target/pretty-cucumber"},
                tags = {"not @ignore"}
)
public class TestRunner {
}
