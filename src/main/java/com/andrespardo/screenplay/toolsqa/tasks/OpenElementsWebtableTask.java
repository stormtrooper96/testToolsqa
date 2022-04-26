package com.andrespardo.screenplay.toolsqa.tasks;


import com.andrespardo.screenplay.toolsqa.user_interface.homepage.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenElementsWebtableTask implements Task {

    public static OpenElementsWebtableTask on(){
        return instrumented(OpenElementsWebtableTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Scroll.to(HomePage.ElELEMENTS),
                Click.on(HomePage.ElELEMENTS));

    }
}
