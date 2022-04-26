package com.andrespardo.screenplay.toolsqa.user_interface.homepage;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WebTable {
    public static final Target ADD= Target.the("WEBTABLE ADD BUTTON PAGE").locatedBy("//button[@id='addNewRecordButton']");
    public static final Target FIRSTNAME= Target.the("WEBTABLE FIRSTNAME FIELD PAGE").locatedBy("//input[@id='firstName']");


}
