package com.sophossolutions.certification.alkomprar.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.alkomprar.com/")
public class AlkomprarHomePage extends PageObject{

	public static final Target SEARCH_TEXTBOX = Target.the("search textbox").located(By.id("search"));
	public static final Target SEARCH_BUTTON = Target.the("search button").located(By.id("searchSubmit"));
	
}
