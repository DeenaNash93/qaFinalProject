package pageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage
{
    @FindBy(how = How.NAME, using = "אחת")
    public WebElement btn_one;

    @FindBy(how = How.NAME, using = "שמונה")
    public WebElement btn_eight;

    @FindBy(how = How.NAME, using = "ועוד")
    public WebElement btn_plus;

    @FindBy(how = How.NAME, using = "שווה")
    public WebElement btn_equals;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
    public WebElement field_result;

    @FindBy(how = How.NAME, using = "נקה")
    public WebElement btn_clear;

    @FindBy(how = How.NAME, using = "פתח ניווט")
    public WebElement btn_options;

    @FindBy(how = How.NAME, using = "רגיל מחשבון")
    public WebElement btn_regular;

    @FindBy(how = How.NAME, using = "מדעי מחשבון")
    public WebElement btn_science;


    @FindBy(how = How.NAME, using = "Pi")
    public WebElement btn_PI;



}
