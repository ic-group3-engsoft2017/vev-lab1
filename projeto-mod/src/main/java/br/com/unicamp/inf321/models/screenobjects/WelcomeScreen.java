package br.com.unicamp.inf321.models.screenobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;
import org.aspectj.weaver.ast.And;

public class WelcomeScreen {
	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
	@AndroidFindBy(xpath = "//*[@text='Já é um cliente? Faça loginScreen']")
	private AndroidElement loginButton;

	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/new_user")
	@AndroidFindBy(xpath = "//*[@text='Novo na Amazon? Crie uma conta']")
	private AndroidElement createAccountButton;

	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
	@AndroidFindBy(xpath = "//*[@text='Pular loginScreen']")
	private AndroidElement skipLoginButton;

	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/nav-search-field")
	@AndroidFindBy(xpath = "//*[@id=\"nav-search-keywords\"]")
	private AndroidElement searchBar;

	@HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@AndroidFindBy(xpath = "//*[@id=\"nav-button-search\"]", priority = 1)
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/nav-button-search", priority = 2)
	private AndroidElement searchButton;

	public AndroidElement getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(AndroidElement searchBar) {
		this.searchBar = searchBar;
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

	public AndroidElement getSkipLoginButton() {
		return skipLoginButton;
	}

	public void setSkipLoginButton(AndroidElement skipLoginButton) {
		this.skipLoginButton = skipLoginButton;
	}

	public AndroidElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(AndroidElement searchButton) {
		this.searchButton = searchButton;
	}
}
