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

public class AddsToShoppingCar implements Task {

	private String number;

	public AddsToShoppingCar(List<String> number) {
		this.number = number.get(1);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(itemsTotal);
		actor.attemptsTo(Click.on(AlkomprarProductListPage.LIST_PRODUCT_SELECT.of(number)));
		productNameInitial = Text.of(AlkomprarProductPage.PRODUCT_NAME).viewedBy(actor).asString();
		actor.attemptsTo(Click.on(AlkomprarProductPage.ADDS_TO_SHOPPING_CAR_HEADER));

	}

	public static AddsToShoppingCar item(List<String> number) {
		return instrumented(AddsToShoppingCar.class, number);
	}

}
