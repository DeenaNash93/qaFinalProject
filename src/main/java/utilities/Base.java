package utilities;


import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.AtidStore.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Base
{

        //General

        protected static WebDriverWait wait;
        protected static Actions action;
        protected static SoftAssert softAssert;
        protected static Screen screen;
        protected static String platform;

        //Web
        protected static WebDriver driver;


        //Mobile

        protected static AppiumDriver mobileDriver;
        protected static DesiredCapabilities dc = new DesiredCapabilities();

        //RestAPI

        protected static RequestSpecification httpRequest;
        protected static Response response;
        protected  static JSONObject params= new JSONObject();
        protected static JsonPath jp;

        //Data Base

        protected  static Connection con;
        protected  static Statement stmt;
        protected  static ResultSet rs;

        //Pages Objects- Web
        protected static pageObjects.AtidStore.MainPage AtidStoreMain;
        protected static UpperMenuPage AtidStoreUpperMenu;
        protected static ProductsPage AtidProductPage;
        protected static ContactUsPage AtidContatUs;

        //Page Objects- Mobile
        protected static  pageObjects.financialcalculator.MainPage FinancialMain;
        protected static pageObjects.financialcalculator.PrcCalculator prcCalculator;

        //Page Objects-Electron
        protected static pageObjects.todo.MainPage todoMain;

        //Page Objects-Desktop
        protected static pageObjects.calculator.MainPage calcuMain;

       


}
