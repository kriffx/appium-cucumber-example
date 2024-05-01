package br.dev.sampaio.steps;

import br.dev.sampaio.pages.LoginPage;
import io.cucumber.java.en.Then;

public class LoginStep {
    @Then("login with {string} user and {string} password")
    public void login_with_user_and_password(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }
}