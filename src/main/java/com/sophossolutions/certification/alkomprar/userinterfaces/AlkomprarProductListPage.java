package com.sophossolutions.certification.alkomprar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina que contiene la lista
 * de productos encontrados en Alkomprar
 * 
 * @author manco.5@hotmail.com
 */
public class AlkomprarProductListPage extends PageObject {

	public static Integer itemsTotal;
	public static final Target LIST_PRODUCT_SELECT = Target.the("select product")
			.locatedBy("//*[@class='products-grid first last odd']/li//div[@data-yotpo-element-id='{0}']");
	public static final Target LIST_BUTTON = Target.the("list button").locatedBy("//*[@class='list']");
	public static final Target TOTAL_ITEMS = Target.the("total items").locatedBy(
			"//*[@class='item last salesperson-products-grid-item']/div[@class='yotpo bottomLine yotpo-small']");

}