package com.sophossolutions.certification.alkomprar.questions;

import static com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductPage.productNameInitial;

import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarComponents;
import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarMyCartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Clase Question para verificar que el producto haya sido agregado al carrito
 * 
 * @author manco.5@hotmail.com
 */
public class InMyCart implements Question<Boolean> {

	private String productNameFinal;

	//Metodo que captura el nombre del producto en el carrito de compras
	@Override
	public Boolean answeredBy(Actor actor) {

		// System.out.println(productNameInitial);
		
		// El actor intenta hacer click al boton del carrito 
		actor.attemptsTo(Click.on(AlkomprarComponents.MY_CART_BUTTON));
		
		// Captura el String deltitulo del producto en el carrito
		productNameFinal = Text.of(AlkomprarMyCartPage.TITLE_PRODUCT).viewedBy(actor).asString();
		
		// System.out.println(productNameFinal);
		
		return prouct(productNameInitial, productNameFinal);
	}

	private Boolean prouct(String productNameInitial, String productNameFinal) {
		if (productNameInitial.equalsIgnoreCase(productNameFinal)) {
			return true;
		} else {
			return false;
		}
	}

	// Constructor de la clase
	public static InMyCart isTheProduct() {
		return new InMyCart();
	}
}
