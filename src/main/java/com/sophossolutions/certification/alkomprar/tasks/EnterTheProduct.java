package com.sophossolutions.certification.alkomprar.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.certification.alkomprar.models.SearchModel;
import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterTheProduct  implements Task {

	//private String product;
	private SearchModel searchModel;
	
	// public EnterTheProduct(List<String> product) {
	// this.product = product.get(1).toString();
	// }
	public EnterTheProduct(SearchModel searchModel) {
		this.searchModel = searchModel;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(searchModel.getProducto()).into(AlkomprarHomePage.SEARCH_TEXTBOX),
				Click.on(AlkomprarHomePage.SEARCH_BUTTON));
	}
	
	public static EnterTheProduct forSearch(SearchModel searchModel) {
		return instrumented(EnterTheProduct.class, searchModel);
	}

}
