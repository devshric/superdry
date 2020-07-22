package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //annotations ran in runner class
@CucumberOptions(
features = "./src/test/resources/features",
glue = {"com.stepDefinition"},
tags =  {"@smoke"}
)


public class SmokeRunner {

}
