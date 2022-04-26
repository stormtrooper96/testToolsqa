package com.andrespardo.screenplay.toolsqa.questions;

import com.andrespardo.screenplay.toolsqa.user_interface.homepage.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoadingRightHomeQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return  HomePage.ICON.isVisibleFor(actor)&&
                HomePage.CARDS.isVisibleFor(actor)&&
                HomePage.ElELEMENTS.isVisibleFor(actor)&&
                HomePage.BANNER.isVisibleFor(actor);
    }
    public static Question<Boolean> value(){return new LoadingRightHomeQuestion();}
}
