package com.sophossolutions.certification.alkomprar.tasks;

import static com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductListPage.itemsTotal;
import static com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductPage.productNameInitial;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductListPage;
import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Clase tarea que implementa Task y que agrega un producto al carrito de
 * compras
 * 
 * @author manco.5@hotmail.com
 */
public class AddsToShoppingCar implements Task {

	private String number;

	public AddsToShoppingCar(List<String> number) {
		this.number = number.get(1);
	}

	// Busca el producto de la lista de items segun el numero recibido del Feature
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(itemsTotal);

		// El actor hace click en el producto de la lista
		actor.attemptsTo(Click.on(AlkomprarProductListPage.LIST_PRODUCT_SELECT.of(number)));

		// Captura el nombre del producto antes de agregar al carrito
		productNameInitial = Text.of(AlkomprarProductPage.PRODUCT_NAME).viewedBy(actor).asString();

		// Click en el boton Agregar al carrito
		actor.attemptsTo(Click.on(AlkomprarProductPage.ADDS_TO_SHOPPING_CAR_HEADER));

	}

	public static AddsToShoppingCar item(List<String> number) {
		return instrumented(AddsToShoppingCar.class, number);
	}

}
