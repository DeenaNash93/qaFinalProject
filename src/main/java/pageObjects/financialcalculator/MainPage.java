package pageObjects.financialcalculator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainPage
{
     private AppiumDriver mobiledriver;
     public MainPage(AppiumDriver mobiledriver)
     {
         this.mobiledriver=mobiledriver;
         PageFactory.initElements(new AppiumFieldDecorator(mobiledriver, Duration.ofSeconds(3)),this);
     }

    @AndroidFindBy(xpath="//*[@bounds='[545,919][798,1131]']")
    public AndroidElement PRC_Calculator;



}
