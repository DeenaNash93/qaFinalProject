package utilities;


import org.openqa.selenium.support.PageFactory;


public class ManagePages extends Base
{
    public static  void initAtidStore()
    {
      AtidStoreMain = PageFactory.initElements(driver, pageObjects.AtidStore.MainPage.class);
      AtidStoreUpperMenu= PageFactory.initElements(driver, pageObjects.AtidStore.UpperMenuPage.class);
      AtidProductPage=PageFactory.initElements(driver, pageObjects.AtidStore.ProductsPage.class);
      AtidContatUs= PageFactory.initElements(driver, pageObjects.AtidStore.ContactUsPage.class);
    }

    public static void initFinancialCalculator()
    {
        FinancialMain=new pageObjects.financialcalculator.MainPage(mobileDriver);
        prcCalculator= new pageObjects.financialcalculator.PrcCalculator(mobileDriver);

    }

    public static  void initTODO()
    {
        todoMain= PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
    }


    public static  void initCalculator()
    {
        calcuMain= PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);


    }
}
