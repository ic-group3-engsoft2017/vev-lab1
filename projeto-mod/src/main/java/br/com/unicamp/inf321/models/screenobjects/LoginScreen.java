package br.com.unicamp.inf321.models.screenobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

public class LoginScreen {
  
	@AndroidFindBy(xpath = "//*[@content-desc='Fazer login' and @class='android.view.View']")
  private AndroidElement screenTitle;

  @AndroidFindBy(id = "ap_email")
  private AndroidElement emailField;

  @AndroidFindBy(id = "ap_password")
  private AndroidElement passwordField;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(id = "auth-fpp-link-bottom")
  @AndroidFindBy(xpath = "//*[@content-desc='Esqueci a senha']")
  private AndroidElement forgotPassword;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(xpath = "//*[@content-des=\"Fazer login\" and @class='android.widget.Button']", priority = 1)
  @AndroidFindBy(id = "signInSubmit", priority = 2)
  private AndroidElement loginButton;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(xpath = "//*[@content-desc=\"Criar uma nova conta Amazon\"]", priority = 1)
  @AndroidFindBy(id = "createAccountSubmit", priority = 2)
  private AndroidElement createAccountButton;

  public AndroidElement getScreenTitle() {
    return screenTitle;
  }

  public void setScreenTitle(AndroidElement screenTitle) {
    this.screenTitle = screenTitle;
  }

  public AndroidElement getEmailField() {
    return emailField;
  }

  public void setEmailField(AndroidElement emailField) {
    this.emailField = emailField;
  }

  public AndroidElement getPasswordField() {
    return passwordField;
  }

  public void setPasswordField(AndroidElement passwordField) {
    this.passwordField = passwordField;
  }

  public AndroidElement getForgotPassword() {
    return forgotPassword;
  }

  public void setForgotPassword(AndroidElement forgotPassword) {
    this.forgotPassword = forgotPassword;
  }

  public AndroidElement getLoginButton() {
    return loginButton;
  }

  public void setLoginButton(AndroidElement loginButton) {
    this.loginButton = loginButton;
  }

  public AndroidElement getCreateAccountButton() {
    return createAccountButton;
  }

  public void setCreateAccountButton(AndroidElement createAccountButton) {
    this.createAccountButton = createAccountButton;
  }



}
