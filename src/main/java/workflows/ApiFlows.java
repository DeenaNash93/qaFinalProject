package workflows;

import extentions.ApiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;



public class ApiFlows extends CommonOps
{
    @Step("Business Flow: Get Student Property")
    public static String getStudentProperty(String jPath)
    {
        response= ApiActions.get("student/list");
        return ApiActions.extractFromJson(response, jPath);
    }


    @Step("Business Flow: New Student in Student List")
    public static void postStudent(String firstName,String lastName, String email,String programme)
    {
        params.put("firstName",firstName);
        params.put("lastName",lastName);
        params.put("email",email);
        params.put("programme",programme);
        ApiActions.post(params,"/student");

    }

    @Step("Business Flow: Update Student in Student List")
    public static void putStudent(String firstName,String lastName, String email,String programme,String id)
    {
        params.put("firstName",firstName);
        params.put("lastName",lastName);
        params.put("email",email);
        params.put("programme",programme);
        ApiActions.put(params,"/student/"+id);

    }

    @Step("Business Flow: Delete Student from Student List")
    public static void deleteStudent(String id)
    {

        ApiActions.delete(id);

    }
    @Step("Business Flow: find Student by id")
    public static String findStudent(String list)
    {
        response = ApiActions.get("student/"+list);
        return response.getStatusCode()+"";

    }
}
