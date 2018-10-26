package com.sophossolutions.certification.alkomprar.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/alkomprar_buy.feature",
			glue = "com.sophossolutions.certification.alkomprar.stepdefinitions",
			snippets = SnippetType.CAMELCASE)

public class AlkomprarSearchRunner {}
