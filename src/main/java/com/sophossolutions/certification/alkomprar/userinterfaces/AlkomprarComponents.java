package com.sophossolutions.certification.alkomprar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de los componentes de Alkomprar
 * 
 * @author manco.5@hotmail.com
 */
public class AlkomprarComponents extends PageObject {

	public static final Target MY_CART_BUTTON = Target.the("my cart button").locatedBy("//*[@class='top-link-cart']");

}
