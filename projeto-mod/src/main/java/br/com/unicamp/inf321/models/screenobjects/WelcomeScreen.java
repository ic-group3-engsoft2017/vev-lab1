package br.com.unicamp.inf321.models.screenobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

public class WelcomeScreen {
	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
	@AndroidFindBy(xpath = "//*[@text='Já é um cliente? Faça login']")
	private AndroidElement loginButton;

	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/new_user")
	@AndroidFindBy(xpath = "//*[@text='Novo na Amazon? Crie uma conta']")
	private AndroidElement createAccountButton;

	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
	@AndroidFindBy(xpath = "//*[@text='Pular login']")
	private AndroidElement skipLoginButton;
	
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

	public AndroidElement getSkipLoginButton() {
		return skipLoginButton;
	}

	public void setSkipLoginButton(AndroidElement skipLoginButton) {
		this.skipLoginButton = skipLoginButton;
	}
}
