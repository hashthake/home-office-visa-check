package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {

    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    public ResultPage() {
        PageFactory.initElements(driver,this);
    }

    public String getResultMessage(){

        String result = getTextFromElement(resultMessage);

        return result;
    }

    public void confirmResultMessage(String expectedMessage){

        if (getResultMessage().equalsIgnoreCase(expectedMessage)){
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}
