package com.sophossolutions.certification.alkomprar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina del carrito de comprar
 * de Alkomprar
 * 
 * @author manco.5@hotmail.com
 */
public class AlkomprarMyCartPage extends PageObject {
	public static final Target TITLE_PRODUCT = Target.the("title product")
			.locatedBy("//*[@id='shopping-cart-table']/tbody/tr/td/h2");

}
