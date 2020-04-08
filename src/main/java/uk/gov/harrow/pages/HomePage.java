package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {
    By loginRegisterLink= By.xpath("//span[@class='icon-fallback']");

    public void clickOnloginRegisterLink(){
        clickOnElement(loginRegisterLink);
    }

}
