package com.andrespardo.screenplay.toolsqa.user_interface.webtableform;

import net.serenitybdd.screenplay.targets.Target;

public class FormTable {
    public static final Target FIRTSNAME= Target.the("FIRTS NAME").locatedBy("#firstName");
    public static final Target LASTNAME= Target.the("lastName NAME").locatedBy("#lastName");
    public static final Target EMAIL= Target.the("userEmail NAME").locatedBy("#userEmail");
    public static final Target SALARY= Target.the("salary ").locatedBy("#salary");
    public static final Target DEPARMENT= Target.the("department ").locatedBy("#department");
    public static final Target AGE= Target.the("age  ").locatedBy("#age");

    public static final Target SUBMIT= Target.the("submit ").locatedBy("#submit");


}
