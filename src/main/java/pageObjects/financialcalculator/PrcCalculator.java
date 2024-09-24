package pageObjects.financialcalculator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class PrcCalculator
{
    private AppiumDriver mobiledriver;
    public PrcCalculator(AppiumDriver mobiledriver)
    {
        this.mobiledriver=mobiledriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobiledriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(id = "yPercentInput")
    public AndroidElement txt_x1;

    @AndroidFindBy(id = "xAmountInput")
    public AndroidElement txt_y1;

    @AndroidFindBy(xpath = "//*[@id='reset']")
    public AndroidElement btn_reset1;

    @AndroidFindBy(xpath = "//*[@id='xValueInput']")
    public AndroidElement txt_x2;

    @AndroidFindBy(xpath = "//*[@id='yValueInput']")
    public AndroidElement txt_y2;

    @AndroidFindBy(xpath = "//*[@id='percentReset']")
    public AndroidElement getBtn_reset2;


    @AndroidFindBy(xpath = "//*[@id='xInput']")
    public AndroidElement txt_x3;

    @AndroidFindBy(xpath = "//*[@id='yInput']")
    public AndroidElement txt_y3;

    @AndroidFindBy(xpath = "//*[@id='changeReset']")
    public AndroidElement btn_reset3;

    @AndroidFindBy(id = "percentValueResult")
    public AndroidElement result01;

    @AndroidFindBy(xpath = "//*[@id='percentResult']")
    public AndroidElement result02;

    @AndroidFindBy(xpath = "//*[@id='changeResult']")
    public AndroidElement result03;

    @AndroidFindBy(xpath = "//*[@class='android.widget.ImageButton']")
    public AndroidElement btn_back;





}
