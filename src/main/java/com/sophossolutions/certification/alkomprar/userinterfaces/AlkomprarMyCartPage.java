package com.sophossolutions.certification.alkomprar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AlkomprarMyCartPage extends PageObject{
	//*[@id='shopping-cart-table']/tbody/tr/td/h2
	//*[@id='shopping-cart-table']/div/h1
	//*[@class='product-name']/a
	public static final Target TITLE_PRODUCT = Target.the("title product").locatedBy("//*[@id='shopping-cart-table']/tbody/tr/td/h2");

}
