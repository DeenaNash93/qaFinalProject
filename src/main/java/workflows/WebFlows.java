package workflows;


import extentions.DBActions;
import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;


public class WebFlows extends CommonOps
{

    @Step("Business Flow: Search and Verify Product")
    public static void SearchAndVerifyProduct(String product, String shouldExist)
    {
        UIActions.updateTextByHuman(AtidProductPage.txt_search, product);
        UIActions.click(AtidProductPage.btn_search);

        if(shouldExist.equalsIgnoreCase("exists"))
        {
            Verifications.ExistanceOfElement(AtidProductPage.ListProducts);
        }

        else if(shouldExist.equalsIgnoreCase("no-exist"))
        {
            Verifications.nonExistanceOfElement(AtidProductPage.ListProducts);
        }

        else
            throw new RuntimeException("Invalid Expected Output Option In Data Driven Testing, it should be exists or no-exist");

    }


    @Step("Business Flow: Filling In Details to Contact with Atid Store From Database")
    public  static  void AtidContactDB()
    {
        String query="SELECT Name, Subject, Email, Message FROM ContactAtidStore WHERE id='1'";
        List<String> cred= DBActions.getCredentials(query);
        UIActions.updateText( AtidContatUs.txt_Name,cred.get(0));
        UIActions.updateText( AtidContatUs.txt_Subject,cred.get(1));
        UIActions.updateText( AtidContatUs.txt_Email,cred.get(2));
        UIActions.updateText( AtidContatUs.txt_Message,cred.get(3));
        UIActions.click(AtidContatUs.btn_Send);

    }

}
