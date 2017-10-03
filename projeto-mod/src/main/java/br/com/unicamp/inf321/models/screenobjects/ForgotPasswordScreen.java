package br.com.unicamp.inf321.models.screenobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

public class ForgotPasswordScreen {
  @AndroidFindBy(xpath = "//*[@content-desc='Auxílio de senha']")
  private AndroidElement screenTitle;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(xpath = "//*[@text='Seu e-mail ou número de telefone celular']")
  @AndroidFindBy(id = "ap_email")
  private AndroidElement emailField;

  @AndroidFindBy(xpath = "//*[@content-desc='Insira o endereço de e-mail ou o número do telefone celular associado à sua conta Amazon.']")
  private AndroidElement helpText;

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

  public AndroidElement getHelpText() {
    return helpText;
  }

  public void setHelpText(AndroidElement helpText) {
    this.helpText = helpText;
  }
}
