package com.andrespardo.screenplay.toolsqa.tasks;


import com.andrespardo.screenplay.toolsqa.user_interface.webtableform.FormTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendFormTask implements Task {
    private static   String department,nameP,surnameP,salaryP,emailP,ageP;

    public SendFormTask() {
    }


    public static SendFormTask on(String deparment, String name, String surname, String salary,String email,String age){
        department =deparment;
        nameP=name;
        surnameP=surname;
        salaryP=salary;
        emailP=email;
        ageP=age;

        return instrumented(SendFormTask.class,deparment,name,surname,salary,email);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(department).into(FormTable.DEPARMENT));
        actor.attemptsTo(Enter.theValue(salaryP).into(FormTable.SALARY));
        actor.attemptsTo(Enter.theValue(nameP).into(FormTable.FIRTSNAME));
        actor.attemptsTo(Enter.theValue(surnameP).into(FormTable.LASTNAME));
        actor.attemptsTo(Enter.theValue(emailP).into(FormTable.EMAIL));
        actor.attemptsTo(Enter.theValue(ageP).into(FormTable.AGE));


        actor.attemptsTo(Click.on(FormTable.SUBMIT));
    }
}
