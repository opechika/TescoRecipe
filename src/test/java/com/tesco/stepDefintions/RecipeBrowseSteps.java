package com.tesco.stepDefintions;

import com.tesco.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class RecipeBrowseSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    RecipeInspirationPage recipeInspirationPage = PageFactory.initElements(driver, RecipeInspirationPage.class);
    StepByStepRecipePage stepByStepRecipePage = PageFactory.initElements(driver, StepByStepRecipePage.class);
    RecipeDetailsPage recipeDetailsPage = PageFactory.initElements(driver, RecipeDetailsPage.class);

    @Given("I navigate to Tesco homepage")
    public void tesco_homepage() {
        launchUrl();

    }

    @Given("I click on the Recipes tab")
    public void i_click_on_the_Recipes_tab() {
        homePage.clickOnRecipeTab();
    }

    @Given("I click on the Recipe inspiration")
    public void i_click_on_the_Recipe_inspiration() {
        recipeInspirationPage = homePage.clickOnRecipeInspirationLink();
    }

    @Given("I click on Step by step recipes link")
    public void i_click_on_Step_by_step_recipes_link() {
        stepByStepRecipePage = recipeInspirationPage.clickOnStepByStepGuideLink();
    }

    @When("I click on How to make chesse souffle link")
    public void i_click_on_How_to_make_chesse_souffle_link() {
        recipeDetailsPage = stepByStepRecipePage.clickOnOneOfRecipeLinks();

    }

    @Then("a step to step guide of how to make chesse souffle is displayed")
    public void a_step_to_step_guide_of_how_to_make_chesse_souffle_is_displayed() {
        recipeDetailsPage.isRecipeDisplayed();

    }

}
