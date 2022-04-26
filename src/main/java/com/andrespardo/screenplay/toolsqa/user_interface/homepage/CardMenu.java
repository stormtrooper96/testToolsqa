package com.andrespardo.screenplay.toolsqa.user_interface.homepage;

import net.serenitybdd.screenplay.targets.Target;

public class CardMenu {
    public static final Target CARDS= Target.the("MENU HOME PAGE").locatedBy("//div[@class='category-cards']");
    public static final Target ElELEMENTS = Target.the("ELEMENTS HOME PAGE").locatedBy("//h5[contains(.,'Elements')]");
}
