package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {

    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @FindBy (xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public SelectNationalityPage() {

        PageFactory.initElements(driver,this);
    }

    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }
}
