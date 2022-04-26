package com.andrespardo.screenplay.toolsqa.questions;

import com.andrespardo.screenplay.toolsqa.user_interface.homepage.ElementsPage;
import com.andrespardo.screenplay.toolsqa.user_interface.homepage.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoadingRightElementsMenuQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return  ElementsPage.ICON.isVisibleFor(actor)&&
                ElementsPage.BANNER.isVisibleFor(actor)&&
                ElementsPage.CARD_WEB_TABE.isVisibleFor(actor);
    }

    public static Question<Boolean> value(){return new LoadingRightElementsMenuQuestion();}
}
