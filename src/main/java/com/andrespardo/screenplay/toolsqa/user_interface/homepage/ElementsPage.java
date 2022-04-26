package com.andrespardo.screenplay.toolsqa.user_interface.homepage;


import net.serenitybdd.screenplay.targets.Target;

public class ElementsPage {
    public static final Target ICON= Target.the("LOGO PAGE").locatedBy("//img[@src='/images/Toolsqa.jpg']");

    public static final Target BANNER= Target.the("BANNER ELEMENTS PAGE").locatedBy("//div[@class='main-header']");
    public static final Target CARD_WEB_TABE= Target.the("WEB ELEMENT LIST").locatedBy("//span[contains(.,'Web Tables')]");
    public static final Target ElELEMENTS = CardMenu.ElELEMENTS;

}
