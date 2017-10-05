package br.com.unicamp.inf321.models.screenobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

public class ProductDetailScreen {

    //
    @AndroidFindBy(xpath = "//*[@content-desc='Fazer loginScreen' and @class='android.view.View']")
    private AndroidElement screenTitle;

    @AndroidFindBy(id = "ap_email")
    private AndroidElement emailField;

    @AndroidFindBy(id = "ap_password")
    private AndroidElement passwordField;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(id = "buybox.addToCart")
    @AndroidFindBy(xpath = "//*[@content-desc='Esqueci a senha']")
    private AndroidElement addToCart;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "", priority = 1)
    @AndroidFindBy(id = "nav-logo-link", priority = 2)
    private AndroidElement goHome;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"anonCarousel10\"]/ol/li[3]/span/a/div/div", priority = 1)
    @AndroidFindBy(id = "image-wrapper", priority = 2)
    private AndroidElement productImage;


}
