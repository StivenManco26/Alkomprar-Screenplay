package com.sophossolutions.certification.alkomprar.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.sophossolutions.certification.alkomprar.exceptions.ItemNumberIncorrect.getErrorItemNumber;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.certification.alkomprar.exceptions.ItemNumberIncorrect;
import com.sophossolutions.certification.alkomprar.models.SearchModel;
import com.sophossolutions.certification.alkomprar.questions.CorrectNumber;
import com.sophossolutions.certification.alkomprar.questions.InMyCart;
import com.sophossolutions.certification.alkomprar.tasks.AddsToShoppingCar;
import com.sophossolutions.certification.alkomprar.tasks.EnterTheProduct;
import com.sophossolutions.certification.alkomprar.tasks.OpenTheBrowser;
import com.sophossolutions.certification.alkomprar.userinterfaces.AlkomprarHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AlkomprarSearchStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;

	private Actor stiven = Actor.named("stiven");

	private AlkomprarHomePage alkomprarHomePage;

	// Inicialización del driver a cargo del actor
	@Before
	public void setUp() {
		stiven.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Stiven wants search a product in alkomprar page$")
	public void thatStivenWantsSearchAProductInAlkomprarPage() {
		stiven.wasAbleTo(OpenTheBrowser.on(alkomprarHomePage));
	}

	@When("^he enters the product$")
	public void heEntersTheProduct(List<SearchModel> product) {
		stiven.attemptsTo(EnterTheProduct.forSearch(product.get(1)));
	}

	@When("^he adds the product number$")
	public void heAddsTheProductNumber(List<String> number) {
		stiven.should(
				seeThat(CorrectNumber.is(number)).orComplainWith(ItemNumberIncorrect.class, getErrorItemNumber()));
		stiven.attemptsTo(AddsToShoppingCar.item(number));
	}

	@Then("^he should see the results page$")
	public void heShouldSeeTheResultsPage() {
		stiven.should(seeThat(InMyCart.isTheProduct()));
	}
}
