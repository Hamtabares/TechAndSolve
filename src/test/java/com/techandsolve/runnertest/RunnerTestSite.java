package com.techandsolve.runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue="com.techandsolve.definitions",tags= "@Escenario5")
public class RunnerTestSite {

}