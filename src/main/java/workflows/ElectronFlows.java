package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ElectronFlows extends CommonOps
{

    @Step("Add New Task to the List")
    public static void addNewTask(String taskName)
    {

        UIActions.updateText(todoMain.txt_create, taskName);
         UIActions.insertKey(todoMain.txt_create, Keys.RETURN);

    }
    @Step("Count and Return number of tasks list")
    public static int getNumberOfTasks()
    {
       return todoMain.list_tasks.size();
    }

    @Step("Deletes all the tasks from the list task")
    public static void emptyList()
    {
        for(int i=0;i<getNumberOfTasks();i++)
        {
            UIActions.mouseHover(todoMain.delete_btn);
        }

    }


}
