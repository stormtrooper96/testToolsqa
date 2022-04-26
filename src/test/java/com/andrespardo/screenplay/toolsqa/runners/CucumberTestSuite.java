package com.andrespardo.screenplay.toolsqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.andrespardo.screenplay.toolsqa.step_definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true
)
public class CucumberTestSuite {}
