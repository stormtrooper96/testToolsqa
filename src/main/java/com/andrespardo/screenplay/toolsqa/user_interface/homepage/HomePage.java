package com.andrespardo.screenplay.toolsqa.user_interface.homepage;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target ICON= Target.the("LOGO PAGE").locatedBy("//img[@src='/images/Toolsqa.jpg']");

    public static final Target BANNER= Target.the("BANNER HOME PAGE").locatedBy("//img[@alt='Selenium Online Training']");
    public static final Target CARDS= CardMenu.CARDS;
    public static final Target ElELEMENTS = CardMenu.ElELEMENTS;

}
