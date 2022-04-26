package com.andrespardo.screenplay.toolsqa.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPageTask implements Task {
    @Managed
    WebDriver driver;
    private static String urlbase = "";
    public static OpenPageTask openBroswer(String url){

        urlbase= url;
        return instrumented(OpenPageTask.class,url);
    }
    @Override
    @Step("the actor open broswer")
    public <T extends Actor> void performAs(T actor) {
    actor.can(BrowseTheWeb.with(driver));
    actor.attemptsTo(Open.url(urlbase));
    }
}
