package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And ("User clicks on Login link")
    public void clicks_on_Login_link(){
       new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enters_valid_data(){
        new LoginPage(driver).enterData("aa@gmail.com","Aa123456789!");
    }

    @And("User click on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success message is displayed")
    public void verifies_Success_message(){
        new LoginPage(driver).isMessageTextPresent("You are logged in success");
    }

    @And("User enters valid email and wrong password")
    public void enters_valid_email_and_wrong_password(DataTable table){
        new LoginPage(driver).enterWrongData(table);

    }

    @Then("User verifies Error message is displayed")
    public void verifies_Error_message_is_displayed(){
        new LoginPage(driver).isWrongMessageTextPresent("Login or Password incorrect");

    }
}
