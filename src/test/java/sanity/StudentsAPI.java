package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ApiFlows;

@Listeners(utilities.Listeners.class)
public class StudentsAPI extends CommonOps
{
    @Test(description = "Test 01: Get property information from student list")
    @Description("This test verifies the data student property by expected text")
    public void test01_verifyStudent()
    {

        Verifications.verifyText(ApiFlows.getStudentProperty("firstName[0]"),"Vernon");
    }

    @Test(description = "Test 02: Add student and verify")
    @Description("This test add new student to the list and verifies it")
    public void test02_addStudentAndVerify()
    {
        ApiFlows.postStudent("Deena","Nash","deenanash63@gmail.com","QA Engineer");

        Verifications.verifyText(ApiFlows.getStudentProperty("firstName[100]"),"Deena");
    }

    @Test(description = "Test 03: Update student and verify")
    @Description("This test updates student from the list and verifies it")
    public void test03_updateStudentAndVerify()
    {
        String id= ApiFlows.getStudentProperty("id[100]");
        ApiFlows.putStudent("Deena","Nash","deenanash30@gmail.com","QA Engineer",id);
        Verifications.verifyText(ApiFlows.getStudentProperty("email[100]"),"deenanash30@gmail.com");


    }

    @Test(description = "Test 04: Delete student and verify")
    @Description("This test deletes student from the list and verifies it")
    public void test04_deleteStudentAndVerify()
    {

        String id= ApiFlows.getStudentProperty("id[100]");
        ApiFlows.deleteStudent(id);
        Verifications.verifyText(ApiFlows.findStudent("101"),"404");



    }
}
