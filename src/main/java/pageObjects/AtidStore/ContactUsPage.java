package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage
{
    @FindBy(how = How.XPATH, using = "//input[@id='wpforms-15-field_0']")
    public WebElement txt_Name;


    @FindBy(how = How.XPATH, using = "//input[@id='wpforms-15-field_5']")
    public WebElement txt_Subject;


    @FindBy(how = How.XPATH, using = "//input[@id='wpforms-15-field_4']")
    public WebElement txt_Email;



    @FindBy(how = How.XPATH, using = "//textarea[@id='wpforms-15-field_2']")
    public WebElement txt_Message;

    @FindBy(how = How.ID, using = "wpforms-submit-15")
    public WebElement btn_Send;

    @FindBy(how = How.XPATH, using = "//div[@id='wpforms-confirmation-15']/p")
    public WebElement text_contacting;




}
