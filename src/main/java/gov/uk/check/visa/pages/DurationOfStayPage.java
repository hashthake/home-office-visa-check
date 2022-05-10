package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {


    @FindBy(xpath = "//label[normalize-space()='6 months or less']")
    WebElement lessThanSixMonths;

    @FindBy(xpath = "//label[normalize-space()='longer than 6 months']")
    WebElement moreThanSixMonths;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

        public void selectLengthOfStay(String moreOrLess) {

            switch (moreOrLess) {
                case "6 months or less":
                    clickOnElement(lessThanSixMonths);
                    break;

                case "longer than 6 months":
                    clickOnElement(moreThanSixMonths);
                    break;

            }
        }
        public void clickNextStepButton() {
            clickOnElement(nextStepButton);
    }
}
