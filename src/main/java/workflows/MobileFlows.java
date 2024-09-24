package workflows;

import extentions.MobileActions;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import utilities.CommonOps;


public class MobileFlows extends CommonOps
{
    @Step("Business Flow: Fill form and calculate")
    public static void calculatePRC(MobileElement elem_x,MobileElement elem_y, String x, String y)
    {


        MobileActions.tap(elem_x);
        MobileActions.updateText(elem_x,x);
        MobileActions.tap(elem_y);
        MobileActions.updateText(elem_y,y);


    }
}
