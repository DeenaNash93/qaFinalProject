package sanity;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;


@Listeners(utilities.Listeners.class)
public class TodoListElectron extends CommonOps
{

    @Test(description = "Test 01 - Add And Verify New Task")
    @Description("This test adds new task to the list and verifies it")
    public void test_01_addAndVerifyNewTask()
    {

        ElectronFlows.addNewTask("Study Physics");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(),1);


    }
    @Test(description = "Test 02 - Add And Verify New Task")
    @Description("This test adds new task to the list and verifies it")
    public void test_02_addAndVerifyNewTasks()
    {
        ElectronFlows.addNewTask("Learn song lyrics");
        ElectronFlows.addNewTask("Exercise Math");
        ElectronFlows.addNewTask("Learn Java Script");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(),3);


    }

    @Test(description = "Test 03 - Add And Verify New Tasks and verify if they are completed")
    @Description("This test adds new task to the list and verifies if they are all completed")
    public void test_03_addAndVerifyNewTasks()
    {

        ElectronFlows.addNewTask("Exercise Python");
        ElectronFlows.addNewTask("Learn Java Script");
        ElectronFlows.addNewTask("Sleep early");
        UIActions.click(todoMain.allDone_btn);

        Verifications.verifyAllCompleteTasks(todoMain.list_done_tasks);


    }
}
