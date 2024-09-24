package workflows;

import extentions.UIActions;
import io.qameta.allure.Step;

import utilities.CommonOps;

public class DesktopFlows extends CommonOps
{
    @Step("Calculate Addition: 1 + 8")
    public static void calculateAddition()
    {
        UIActions.click(calcuMain.btn_clear);
        UIActions.click(calcuMain.btn_one);
        UIActions.click(calcuMain.btn_plus);
        UIActions.click(calcuMain.btn_eight);
        UIActions.click(calcuMain.btn_equals);
    }

    @Step("Calculate Choose: Type of calculator")
    public static void calculatorType()
    {
        UIActions.click(calcuMain.btn_options);
        UIActions.click(calcuMain.btn_science);


    }
}
