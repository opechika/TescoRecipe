package com.tesco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RecipeInspirationPage extends BasePage {

    public RecipeInspirationPage(WebDriver driver)
    {
       this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[text() = 'Step-by-step recipes']")
    private WebElement stepByStepsGuideLink;


    public StepByStepRecipePage clickOnStepByStepGuideLink()
    {
        stepByStepsGuideLink.click();

        return new StepByStepRecipePage(driver);
    }
}
