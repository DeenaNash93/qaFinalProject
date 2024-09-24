package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class UpperMenuPage
    {
        @FindBy(how = How.XPATH, using = "//div[contains(@class,'site-header-primary-section-center')]/div/div/div/nav/div/ul/li")
        public List<WebElement> ListProgressSteps;

        @FindBy(how = How.LINK_TEXT, using = "Contact Us")
        public WebElement BTN_CONTACT_US;



    }
