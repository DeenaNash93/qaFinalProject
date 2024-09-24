package sanity;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;


@Listeners(utilities.Listeners.class)
public class AtidStoreWeb extends CommonOps
{
    @Test(description = "Test 01 - verify header title")
    @Description("This test verifies the main header title")
    public void test_01_verifyHeaderTitle()
    {

       Verifications.verifyTextInElement(AtidStoreMain.head_AtidStore,"ATID Demo Store");

    }

    @Test(description = "Test 02 - verify main logo Image")
    @Description("This test verifies the main logo image")
    public void test_02_verifyMainLogo()
    {
       Verifications.visualElement("LogoMainPic");

    }

    @Test(description = "Test 03 - verify main upper menu")
    @Description("This test verifies the main upper menu")
    public void test_03_verifyUpperMenuPage()
    {
        Verifications.visibilityOfElements(AtidStoreUpperMenu.ListProgressSteps);

    }

    @Test(description = "Test 04 - verify number element on main upper menu")
    @Description("This test verifies the number of elements on  main upper menu")
    public void test_04_verifyNumOfElemsUpperMenuPage()
    {
        Verifications.numberOfElements(AtidStoreUpperMenu.ListProgressSteps,7);

    }
    @Test(description = "Test 05 - verify the chosen price by the slider")
    @Description("This test verifies if the chosen price by the button slider really works")
    public void test_05_verifyBtnFilter()
    {


        UIActions.click(AtidStoreMain.btn_Shop);
        UIActions.DragAndDropBy(AtidProductPage.slider,-70 ,0);
        Verifications.verifyPriceFilter(AtidProductPage.price,"180");
        UIActions.click(AtidProductPage.slider);
    }

    @Test(description = "Test 06 - verify the chosen price on products")
    @Description("This test verifies the chosen price by the filter on products")
    public void test_06verifyProductPrice()
    {


        UIActions.click(AtidStoreMain.btn_Shop);
        UIActions.DragAndDropBy(AtidProductPage.slider,-70 ,0);
        UIActions.click(AtidProductPage.slider);
        UIActions.click(AtidProductPage.btn_filter);
        Verifications.verifyPriceElement(AtidProductPage.ListPrices,180);

    }

    @Test(description = "Test 07 - verify the chosen price on products on sale")
    @Description("This test verifies the chosen price by the filter on products")
    public void test_07verifyProductSalePrice()
    {


        UIActions.click(AtidStoreMain.btn_Shop);
        UIActions.DragAndDropBy(AtidProductPage.slider,(-(AtidProductPage.price_slider.getSize().getWidth())/22* 7),0);
        UIActions.click(AtidProductPage.slider);
        UIActions.click(AtidProductPage.btn_filter);
        Verifications.verifyPriceElement(AtidProductPage.ListSalePrices,180);

    }


    @Test(description = "Test 08 - Search Products", dataProvider = "data-provider-products", dataProviderClass = utilities.ManageDDT.class)
    @Description("This test searches for products using DDT ")
    public void test_08SearchingProducts(String product, String shouldExist)
    {
        UIActions.click(AtidStoreMain.btn_Shop);
        WebFlows.SearchAndVerifyProduct(product,shouldExist);

    }


}
