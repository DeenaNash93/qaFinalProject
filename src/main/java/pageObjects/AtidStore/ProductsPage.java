package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProductsPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='price_slider ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']/span[2]")
    public WebElement slider;


    @FindBy(how = How.XPATH, using = "//span[@class='to']")
    public WebElement price;

    @FindBy(how = How.XPATH, using = "//ul/li/div[2]/span/span/bdi")
    public List<WebElement> ListPrices;

    @FindBy(how = How.XPATH, using = "//ul/li/div[2]/span/ins/span/bdi")
    public List<WebElement> ListSalePrices;

    @FindBy(how = How.XPATH, using = "//ul[@class='products columns-4']/li")
    public List<WebElement> ListProducts;

    @FindBy(how = How.XPATH, using = "//button[@class='button']")
    public WebElement btn_filter;

    @FindBy(how = How.CSS, using = "input[id='wc-block-search__input-1']")
    public WebElement txt_search;

    @FindBy(how = How.CSS, using = "button[aria-label='Search']")
    public WebElement btn_search;

    @FindBy(how = How.CSS, using = "div[class='price_slider ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content'")
    public WebElement price_slider;


}
