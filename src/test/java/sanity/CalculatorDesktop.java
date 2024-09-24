package sanity;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;

@Listeners(utilities.Listeners.class)
public class CalculatorDesktop extends CommonOps
{
    @Test(description = "Test 01 - verify addition command")
    @Description("This test verifies addition command")
    public void test_01_verifyAdditionCommand()
    {

        DesktopFlows.calculateAddition();
        Verifications.verifyTextInElementDesktop(calcuMain.field_result,"התצוגה היא 9");

    }

    @Test(description = "Test 02 - verify chosen type of calculator")
    @Description("This test verifies the chosen option type of the calculator")
    public void test_02_verifyChosenType()
    {


        DesktopFlows.calculatorType();
        Verifications.ExistanceOfElement(calcuMain.btn_PI);


    }
}
