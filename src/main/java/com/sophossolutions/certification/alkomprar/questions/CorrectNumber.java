package com.sophossolutions.certification.alkomprar.questions;

import static com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductListPage.itemsTotal;

import java.util.List;

import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductListPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para verificar que el numero de item ingresado sea menor al
 * numero total de items
 * 
 * @author manco.5@hotmail.com
 */
public class CorrectNumber implements Question<Boolean> {

	private String number;

	public CorrectNumber(List<String> number) {
		this.number = number.get(1);
	}

	// Metodo para retornar el contenido de la etiqueta HTML que contiene el total
	// de items de la lista de productos
	@Override
	public Boolean answeredBy(Actor actor) {
		//Cast de un String a un entero 
		itemsTotal = Integer
				.parseInt(AlkomprarProductListPage.TOTAL_ITEMS.resolveFor(actor).getAttribute("data-yotpo-element-id"));

		return verifyItems(itemsTotal, Integer.parseInt(number));
	}

	//Condicional verificando el numero total de items de la lista
	private Boolean verifyItems(int itemsTotal, int number) {
		if (number <= itemsTotal && number > 0) {
			return true;
		} else {
			return false;
		}
	}

	//Metodo que devuelve una instancia de la clase CorrectNumber
	public static CorrectNumber is(List<String> number) {
		return new CorrectNumber(number);
	}
}