package selenium.Task2_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static junit.framework.TestCase.assertTrue;


public class Task2_check_feedback {

    @FindBy(how = How.TAG_NAME, using = "span")
    private List<WebElement> spanElement;

    @FindBy(xpath = "//button[@class='w3-btn w3-green w3-xlarge']")
    private WebElement btnYes;
    @FindBy(xpath = "//button[@class='w3-btn w3-red w3-xlarge']")
    private WebElement btnNo;


    public void checkResultFeedbackEmpty() {
        for(WebElement spans : spanElement){
            assertTrue(spans.getText().equals("") || spans.getText().equals("null"));
        }
    }

    public void chckButtonYesNoColors() {
        assertTrue(btnYes.getCssValue("background-color").equals("rgba(76, 175, 80, 1)"));
        assertTrue(btnYes.getCssValue("color").equals("rgba(255, 255, 255, 1)"));
        assertTrue(btnNo.getCssValue("background-color").equals("rgba(244, 67, 54, 1)"));
        assertTrue(btnNo.getCssValue("color").equals("rgba(255, 255, 255, 1)"));
    }

    //TODO:
    public void chckFieldsRok(String name){
        assertTrue(spanElement.get(0).getText().equals(name));
    }
}
