package com.tesco.pages;

import com.tesco.common.CommonLibs;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends CommonLibs
{
    public String BASE_URL = "https://www.tesco.com/";
    public Select select;
    public JavascriptExecutor js;

    public void launchUrl()
    {
      driver.navigate().to(BASE_URL);
    }
    public void selectElementByVisibleText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectElementByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectElementByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }

    public void scrollElementToView(WebElement element)
    {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollDownOnAPage()
    {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}
