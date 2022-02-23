package io.cucumber.fernando;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty"}, features="src/test/resources", glue="io.cucumber.fernando")
public class RunCucumberTest {
}
