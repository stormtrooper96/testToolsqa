package com.andrespardo.screenplay.toolsqa.step_definitions;

import com.andrespardo.screenplay.toolsqa.questions.LoadingRightHomeQuestion;
import com.andrespardo.screenplay.toolsqa.tasks.GoToElementsTabTask;
import com.andrespardo.screenplay.toolsqa.tasks.OpenPageTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HomePageSteps {
    public Actor aa= Actor.named("a");


    @Before
    public void set_TheStage( ) {
        setTheStage(new OnlineCast());
    }

    @Given("Actor is open url {string}")
    public void sergeyIsOpenUrl(String string) {
    aa.attemptsTo(OpenPageTask.openBroswer(string));
    }

    @When("he looks up Start Elements")
    public void heLooksUpStartElements() {
        aa.attemptsTo(
                Ensure.that(LoadingRightHomeQuestion.value().answeredBy(aa).toString()).isEqualToIgnoringCase("true")

        );
    ;
    }

}
