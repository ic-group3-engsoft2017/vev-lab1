package br.com.unicamp.inf321.models.screenobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

public class CartScreen {

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"sc-active-cart\"]/div", priority = 1)
    @AndroidFindBy(id = "sc-cart-header", priority = 2)
    private AndroidElement screenTitle;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"activeCartViewForm\"]/div[2]/div", priority = 1)
    @AndroidFindBy(id = "sc-list-item", priority = 2)
    private AndroidElement productList;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"sc-empty-cart\"]/div/h1", priority = 1)
    @AndroidFindBy(id = "sc-empty-cart", priority = 2)
    private AndroidElement emptyCartText;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"nav-button-search\"]", priority = 1)
    @AndroidFindBy(id = "nav-button-search", priority = 2)
    private AndroidElement searchButton;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "", priority = 1)
    @AndroidFindBy(id = "continue", priority = 2)
    private AndroidElement placeOrder;


    public AndroidElement getScreenTitle() {
        return screenTitle;
    }

    public void setScreenTitle(AndroidElement screenTitle) {
        this.screenTitle = screenTitle;
    }

    public AndroidElement getProductList() {
        return productList;
    }

    public void setProductList(AndroidElement productList) {
        this.productList = productList;
    }

    public AndroidElement getEmptyCartText() {
        return emptyCartText;
    }

    public void setEmptyCartText(AndroidElement emptyCartText) {
        this.emptyCartText = emptyCartText;
    }

    public AndroidElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(AndroidElement searchButton) {
        this.searchButton = searchButton;
    }

    public AndroidElement getPlaceOrder() {
        return placeOrder;
    }

    public void setPlaceOrder(AndroidElement placeOrder) {
        this.placeOrder = placeOrder;
    }
}
