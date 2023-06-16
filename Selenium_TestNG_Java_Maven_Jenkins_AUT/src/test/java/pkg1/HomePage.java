package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver=null;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setSearchText(String value)          //sending some text
    {
        String loc="//input[@id='searchbox']";
        WebElement ele=this.driver.findElement(By.xpath(loc));
        ele.sendKeys(value);
    }

    public void clickSearchButton()                 //after that click the button
    {
        String loc="//input[@id='searchsubmit']";
        WebElement ele=this.driver.findElement(By.xpath(loc));
        ele.click();
    }

    public String getH1Heading()      //returning the text
    {
        String loc="//section[@id='main']/h1";
        WebElement ele=this.driver.findElement(By.xpath(loc));
        return ele.getText();                     //getText doesn't have parameter
    }
}
