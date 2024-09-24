package sanity;

import extentions.MobileActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.MobileFlows;


@Listeners(utilities.Listeners.class)
public class FNCalculator extends CommonOps
{
    @Test(description = "Test 01 - verify financial calculator")
    @Description("This test verifies the financial calculators")
    public void test_01_verifyPrcCalculator01()
    {
        MobileActions.tap(FinancialMain.PRC_Calculator);
        MobileFlows.calculatePRC(prcCalculator.txt_x1, prcCalculator.txt_y1, "100","50");
        Verifications.verifyTextInMobileElement(prcCalculator.result01, "50.0000");
        MobileActions.tap(prcCalculator.btn_back);

    }


    @Test(description = "Test 02 - verify financial calculator")
    @Description("This test verifies the financial calculators")
    public void test_02_verifyPrcCalculator02()
    {
        MobileActions.tap(FinancialMain.PRC_Calculator);
        MobileFlows.calculatePRC(prcCalculator.txt_x2, prcCalculator.txt_y2, "23","60");
        Verifications.verifyTextInMobileElement(prcCalculator.result02, "38.3333%");
        MobileActions.tap(prcCalculator.btn_back);

    }

    @Test(description = "Test 01 - verify financial calculator")
    @Description("This test verifies the financial calculators")
    public void test_03_verifyPrcCalculator03()
    {
        MobileActions.tap(FinancialMain.PRC_Calculator);
        MobileFlows.calculatePRC(prcCalculator.txt_x3, prcCalculator.txt_y3, "100","50");
        Verifications.verifyTextInMobileElement(prcCalculator.result03, "-50.0000%");
        MobileActions.tap(prcCalculator.btn_back);

    }

}
