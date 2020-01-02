package com.tesco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StepByStepRecipePage extends BasePage {

    public StepByStepRecipePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(css = "li h2")
    private List<WebElement> recipeLinks;


    public RecipeDetailsPage clickOnOneOfRecipeLinks()
    {
       recipeLinks.get(5).click();
       return new RecipeDetailsPage(driver);
    }
}
