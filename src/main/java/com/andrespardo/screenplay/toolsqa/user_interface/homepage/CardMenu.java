package com.andrespardo.screenplay.toolsqa.user_interface.homepage;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
 public class CardMenu {
    public static final Target CARDS= Target.the("MENU HOME PAGE").locatedBy("//div[@class='category-cards']");
    public static final Target ElELEMENTS = Target.the("ELEMENTS HOME PAGE").locatedBy("//h5[contains(.,'Elements')]");
}
