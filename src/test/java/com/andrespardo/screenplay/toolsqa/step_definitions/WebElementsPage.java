package com.andrespardo.screenplay.toolsqa.step_definitions;

import com.andrespardo.screenplay.toolsqa.questions.LoadingRightElementsMenuQuestion;
import com.andrespardo.screenplay.toolsqa.questions.LoadingRightHomeQuestion;
import com.andrespardo.screenplay.toolsqa.tasks.GoToElementsTabTask;
import com.andrespardo.screenplay.toolsqa.tasks.OpenPageTask;
import com.andrespardo.screenplay.toolsqa.user_interface.homepage.ElementsPage;
import com.andrespardo.screenplay.toolsqa.user_interface.homepage.HomePage;
import com.andrespardo.screenplay.toolsqa.user_interface.homepage.WebTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class WebElementsPage {
    @Steps
    HomePageSteps homePageSteps;
    @Managed
    WebDriver driver;
    @Given("Actor Go to elements page")
    public void actorGoToElementsPage() {
        homePageSteps.aa.can(BrowseTheWeb.with(driver));
        homePageSteps.aa.attemptsTo(GoToElementsTabTask.on());
        System.out.println("Elemento 1");
    }
    @When("he looks up Elements Menu Right")
    public void heLooksUpElementsMenuRight() {
        homePageSteps.aa.attemptsTo(
                Ensure.that(LoadingRightElementsMenuQuestion.value().answeredBy(homePageSteps.aa).toString()).isEqualToIgnoringCase("true")

        );
    }
    @Then("Press Button Web Tables")
    public void pressButtonWebTables() {
        homePageSteps.aa.attemptsTo(
                Click.on(ElementsPage.CARD_WEB_TABE));
    }
    @Then("Press Button Add register")
    public void pressButtonAddRegister() {
        homePageSteps.aa.attemptsTo(
                Click.on(WebTable.ADD));
    }

    @Then("Send data to register: firstname {string} lastname {string} userEmail {string}  age {string} salary {int}  departamentcartagena")
    public void sendDataToRegisterFirstnameLastnameUserEmailAgeSalaryDepartamentcartagena(String string, String string2, String string3, String string4, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
