package selenium.sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.*;

public class Sample3Task {
    WebDriver driver;

    // method which is being run before each test
    @Before
    public void startingTests() throws Exception {
        // from Sample 1:
        String libWithDriversLocation = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver.exe");
        // declaration above:
        driver = new ChromeDriver();

        //open page:
        driver.get("https://kristinek.github.io/site/examples/locators");
    }

    // method which is being run after each test
    @After
    public void endingTests() throws Exception {
        driver.quit();
    }

    @Test
    public void assertEqualsTask() throws Exception {

        int expectedNumberOfElements = 5;
        int actualNumberOfElements = driver.findElements(By.className("test")).size();
        assertEquals(expectedNumberOfElements, actualNumberOfElements);


//         TODO:
//         check how many element with class "test" there are on page (5)
        assertEquals(5, driver.findElements(By.className("test")).size());
        assertEquals("This is also a button", driver.findElement(By.id("buttonid")).getAttribute("value"));
//         check that value of second button is "This is also a button"
    }

    public void assertTrueExamples() throws Exception {

    }
        @Test
        public void assertTrueTask () throws Exception {

//         TODO:
//         check that it is True that value of second button is
//         "this is Also a Button" if you ignore Caps Locks
//         fail with custom error message:
        }

        @Test
        public void assertFalseTask () throws Exception {
            assertFalse(driver.findElement(By.name("randomButton2")).getAttribute("value").equals("This is a button"));
        }
//         TODO:
//        check that it is False that value of second button is "This is a button"


        @Test
        public void failTask () throws Exception {
            List<WebElement> elements = driver.findElements(By.className("test"));
            for (WebElement element : elements) {
                assertFalse(element.getText().contains("number:\"190"));
//        TODO:
//        check that none of items with class "test"
//        contain number 190
            }

        }}