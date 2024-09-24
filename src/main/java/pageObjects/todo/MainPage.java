package pageObjects.todo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage
{
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Create a task']")
    public WebElement txt_create;

    @FindBy(how = How.CLASS_NAME, using = "taskWrapper_2u8dN")
    public List<WebElement> list_tasks;

    @FindBy(how = How.CLASS_NAME, using = "destroy_19w1q")
    public WebElement delete_btn;

    @FindBy(how = How.XPATH, using = "//div[@class='allCompletedIconWrapper_2rCqr']")
    public WebElement allDone_btn;

    @FindBy(how = How.XPATH, using = "//div/*[@class='label_5i8SP completed_bHv-Q']")
    public List<WebElement> list_done_tasks;
}
