package sanity;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;


@Listeners(utilities.Listeners.class)
public class AtidStoreWebDB extends CommonOps
{

        @Test(description = "Test 01 - Filling with text the Contact Field texts From Database")
        @Description("This test fills Contact Field texts from Database and Verifies It")
        public void test_01_ContactAtidStore()
        {
                UIActions.click(AtidStoreUpperMenu.BTN_CONTACT_US);
                WebFlows.AtidContactDB();
                Verifications.verifyTextInElement(AtidContatUs.text_contacting,"Thanks for contacting us! We will be in touch with you shortly.");

        }

    }
