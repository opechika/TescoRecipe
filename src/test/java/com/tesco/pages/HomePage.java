package com.tesco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "[title=\"Recipes\"]")
    private WebElement recipeTab;
    @FindBy(xpath = "//*[text() = 'Recipe inspiration']")
    private WebElement recipeInspirationLink;

    public void clickOnRecipeTab()
    {
        recipeTab.click();
    }
    public RecipeInspirationPage clickOnRecipeInspirationLink()
    {
        recipeInspirationLink.click();
        return new RecipeInspirationPage(driver);
    }
}
