package com.sophossolutions.certification.alkomprar.questions;

import static com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductListPage.itemsTotal;

import java.util.List;

import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarProductListPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CorrectNumber implements Question<Boolean>  {
	
	private String number;

	public CorrectNumber(List<String> number) {
		this.number = number.get(1);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		itemsTotal = Integer
				.parseInt(AlkomprarProductListPage.TOTAL_ITEMS.resolveFor(actor).getAttribute("data-yotpo-element-id"));
		
		return verifyItems(itemsTotal, Integer.parseInt(number));
	}

	private Boolean verifyItems(int itemsTotal, int number) {
		if(number <= itemsTotal && number > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static CorrectNumber is(List<String> number) {
		return new CorrectNumber(number);
	}
}