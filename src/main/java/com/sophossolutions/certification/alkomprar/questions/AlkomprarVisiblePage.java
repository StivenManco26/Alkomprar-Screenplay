package com.sophossolutions.certification.alkomprar.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para verificar la conexion de internet, comparando con un
 * elemento de la pagina inicial de Alkomprar
 * 
 * @author manco.5@hotmail.com
 */

public class AlkomprarVisiblePage implements Question<Boolean> {

	// verifica si el boton SEARCH esta visible para el actor
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(AlkomprarHomePage.SEARCH_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> isVisible() {
		return new AlkomprarVisiblePage();
	}

}