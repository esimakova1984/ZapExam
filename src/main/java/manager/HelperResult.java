package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperResult extends HelperBase {
    public HelperResult(WebDriver driver) {
        super(driver);
    }

    public void searchBook(String text) {
        type(By.xpath("//*[@id = 'twotabsearchtextbox']"), text);
        click(By.xpath("//*[@id = 'nav-search-submit-button']"));
    }

    public void checkTotalResult() {
        String result = driver.findElement(By.xpath("//*[h1]")).getText().split(" ")[2];
        System.out.println("Total 'Harry Potter the Order of the Phoenix' books: " + result);
    }

    public void addFilterLaguageEnglish() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)", "");
        click(By.xpath("//*[@id='p_n_feature_nine_browse-bin/3291437011']/span/a/span"));
    }

    public void checkLongestBookName() {
        int maxLength = 0;
        String longestBookName = null;
        List<WebElement> list = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement el : list) {
            if (el.getText().length() > maxLength) {
                maxLength = el.getText().length();
                longestBookName = el.getText();
            }
        }
        System.out.println("The longest book name: " + longestBookName);
    }

    public void checkEnglishLanguageTotalResult() {
        String result = driver.findElement(By.xpath("//*[h1]")).getText().split(" ")[2];
        System.out.println("Total 'Harry Potter the Order of the Phoenix' english books: " + result);
    }
}
