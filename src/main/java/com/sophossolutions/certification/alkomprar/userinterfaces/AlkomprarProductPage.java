package com.sophossolutions.certification.alkomprar.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AlkomprarProductPage extends PageObject {

	public static String productNameInitial;
	public static final Target ADDS_TO_SHOPPING_CAR_HEADER = Target.the("adds to shopping car header").located(By.id("Addtocart_header"));
	public static final Target ADDS_TO_SHOPPING_CAR = Target.the("adds to shopping car").located(By.id("Addtocart"));
	public static final Target QUANTITY = Target.the("quantity count").located(By.name("qty"));
	public static final Target PRODUCT_NAME = Target.the("product name").locatedBy("//*[@class = 'product']/strong");

}
