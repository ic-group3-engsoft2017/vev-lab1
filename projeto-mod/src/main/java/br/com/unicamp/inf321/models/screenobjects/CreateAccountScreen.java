package br.com.unicamp.inf321.models.screenobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

public class CreateAccountScreen {
  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(xpath = "//*[@content-desc=\"Cadastre-se com seu número de celular\"]", priority = 1)
  @AndroidFindBy(xpath = "//*[@content-desc=\"Inscreva-se com seu endereço de e-mail\"]", priority = 1)
  private AndroidElement screenTitle;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(id = "auth-already-have-account")
  @AndroidFindBy(xpath = "//*[@content-desc=\"Você já tem uma conta?\"]")
  private AndroidElement loginLink;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(id = "ap_use_email-announce", priority = 1)
  @AndroidFindBy(xpath = "//*[@content-desc=\"Usar seu e-mail\"]", priority = 3)
  private AndroidElement useEmailButton;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(xpath = "//*[@content-desc=\"Seu endereço de e-mail\"]")
  @AndroidFindBy(id = "ap_email")
  private AndroidElement emailField;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(xpath = "//*[@content-desc=\"Criar sua conta da Amazon\"]", priority = 1)
  @AndroidFindBy(id = "continue", priority = 2)
  private AndroidElement createAccountButton;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(id = "ap_use_mobile-announce", priority = 1)
  @AndroidFindBy(xpath = "//*[@content-desc=\"Usar seu número celular\"]", priority = 3)
  private AndroidElement usePhoneButton;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(id = "ap_phone_number", priority = 1)
  @AndroidFindBy(xpath = "//*[@text=\"DDD + Número de celular\"]", priority = 2)
  private AndroidElement phoneField;

  @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
  @AndroidFindBy(xpath = "//*[@content-desc='Continuar']", priority = 1)
  @AndroidFindBy(id = "continue", priority = 2)
  private AndroidElement continueButton;

  @AndroidFindBy(xpath = "//*[@content-desc=\"Nós lhe enviaremos uma verificação de texto.\"]", priority = 1)
  private AndroidElement phoneTitleText;

  public AndroidElement getScreenTitle() {
    return screenTitle;
  }

  public void setScreenTitle(AndroidElement screenTitle) {
    this.screenTitle = screenTitle;
  }

  public AndroidElement getLoginLink() {
    return loginLink;
  }

  public void setLoginLink(AndroidElement loginLink) {
    this.loginLink = loginLink;
  }

  public AndroidElement getUseEmailButton() {
    return useEmailButton;
  }

  public void setUseEmailButton(AndroidElement useEmailButton) {
    this.useEmailButton = useEmailButton;
  }

  public AndroidElement getEmailField() {
    return emailField;
  }

  public void setEmailField(AndroidElement emailField) {
    this.emailField = emailField;
  }

  public AndroidElement getCreateAccountButton() {
    return createAccountButton;
  }

  public void setCreateAccountButton(AndroidElement createAccountButton) {
    this.createAccountButton = createAccountButton;
  }

  public AndroidElement getUsePhoneButton() {
    return usePhoneButton;
  }

  public void setUsePhoneButton(AndroidElement usePhoneButton) {
    this.usePhoneButton = usePhoneButton;
  }

  public AndroidElement getPhoneField() {
    return phoneField;
  }

  public void setPhoneField(AndroidElement phoneField) {
    this.phoneField = phoneField;
  }

  public AndroidElement getContinueButton() {
    return continueButton;
  }

  public void setContinueButton(AndroidElement continueButton) {
    this.continueButton = continueButton;
  }

  public AndroidElement getPhoneTitleText() {
    return phoneTitleText;
  }

  public void setPhoneTitleText(AndroidElement phoneTitleText) {
    this.phoneTitleText = phoneTitleText;
  }



}
