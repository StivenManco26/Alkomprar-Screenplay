package com.sophossolutions.certification.alkomprar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.certification.alkomprar.models.SearchModel;
import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * Clase tarea que implementa Task y que ingresa el producto a buscar
 * 
 * @author manco.5@hotmail.com
 */
public class EnterTheProduct implements Task {

	private SearchModel searchModel;

	public EnterTheProduct(SearchModel searchModel) {
		this.searchModel = searchModel;
	}

	// Metodo para ingresar el nombre del producto recibido desde el feature y luego
	// hacer click en buscar
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(searchModel.getProducto()).into(AlkomprarHomePage.SEARCH_TEXTBOX),
				Click.on(AlkomprarHomePage.SEARCH_BUTTON));
	}

	public static EnterTheProduct forSearch(SearchModel searchModel) {
		return instrumented(EnterTheProduct.class, searchModel);
	}

}
