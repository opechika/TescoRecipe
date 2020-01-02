package com.tesco.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipeDetailsPage extends BasePage {
    public RecipeDetailsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "title")
    private WebElement recipeTitle;


    public void isRecipeDisplayed()
    {
        Assert.assertTrue(recipeTitle.isDisplayed());
    }
}
