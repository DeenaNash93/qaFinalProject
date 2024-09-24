package extentions;


import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;
import java.util.List;

import static org.testng.Assert.*;
public class Verifications extends CommonOps
{
    //WebElement Verifications

    @Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));

        assertEquals(elem.getText(), expected);
    }

    @Step("Verify Text In Element Desktop")
    public static void verifyTextInElementDesktop(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));

        assertEquals(elem.getAttribute("Name"), expected);
    }
    @Step("Verify Number Of Elements")
    public static void numberOfElements(List<WebElement> elems, int expected) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expected);

    }


    @Step("Verify Visibility Of Elements (Soft-Assertion)")
    public static void visibilityOfElements(List<WebElement> elems)
    {
        for (WebElement elem : elems)
        {
            softAssert.assertTrue(elem.isDisplayed(), "Sorry " + elem.getText() + "  not displayed");
        }
        softAssert.assertAll("Some elements were not displayed");
    }

    @Step("Verify Element Visually")
    public static void visualElement(String expectedImageName) {
        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error compare image file" + findFailed);
        }
    }

    @Step("Verify Filter Button ")
    public static void verifyPriceFilter(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));

        assertEquals(elem.getText().split(" ")[0], expected);
    }

    @Step("Verify the Price of Products")
    public static void verifyPriceElement(List<WebElement> elems, int price)
    {


        for (WebElement elem : elems)
        {
            wait.until(ExpectedConditions.visibilityOf(elem));
            softAssert.assertTrue((int)Float.parseFloat(elem.getText().split(" ")[0])<=price);

        }
        softAssert.assertAll("Some elements were not as the same as the filtered Price");

    }

    @Step("Verify if List of Elements are Displayed")
    public static void ExistanceOfElement(List<WebElement> elememts)
    {
        assertTrue(elememts.size()>0);
    }

    @Step("Verify if List of Elements are not Displayed")
    public static void nonExistanceOfElement(List<WebElement> elememts)
    {
       assertFalse(elememts.size()>0);
    }

    //MobileElement Verifications
    @Step("Verify Text In Element on Mobile")
    public static void verifyTextInMobileElement(MobileElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));

        assertEquals(elem.getText(), expected);
    }
    @Step("Verify text with other text")
    public static void verifyText(String actual, String expected)
    {
        assertEquals(actual, expected);

    }
    @Step("Verify Number with Number")
    public static void verifyNumber(int actual, int expected)
    {
        assertEquals(actual, expected);

    }


    @Step("Verify if all tasks are completed")
    public static void verifyAllCompleteTasks(List<WebElement> elems)
    {
        for(WebElement elem:elems)
        {
            String attribute01= elem.getAttribute("class");
            String [] array01= attribute01.split(" ");
            String [] array02= array01[1].split("_");
            assertEquals(array02[0],"completed");
        }

    }
    @Step("Verify if Elements are Displayed")
    public static void ExistanceOfElement(WebElement elememt)
    {
        assertTrue(elememt.isDisplayed());
    }

}