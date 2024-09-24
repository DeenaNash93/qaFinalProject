package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage
{
    @FindBy(how = How.XPATH, using = "//div/h1[@class='elementor-heading-title elementor-size-default']")
    public WebElement head_AtidStore;

    @FindBy(how = How.XPATH, using = "//div/div/a[@href='https://atid.store/store/']")
    public WebElement btn_Shop;








}
