package br.com.unicamp.inf321.models.screenobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

public class BuyProductScreen {

	
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"sc-active-cart\"]/div", priority = 1)
    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/sc-cart-header", priority = 2)
    private AndroidElement screenTitle;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"byline\"]", priority = 1)
    private AndroidElement title;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"title\"]", priority = 1)
    private AndroidElement titleDetail;

    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"main-image\"]", priority = 1)
    private AndroidElement images;
    
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"price\"]/tbody/tr[1]/td[1]", priority = 1)
    private AndroidElement listPriceLabel;
        
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"price\"]/tbody/tr[1]/td[2]/span[1]", priority = 1)
    private AndroidElement listPriceValue;
    
    
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"price\"]/tbody/tr[1]/td[1]", priority = 1)
    private AndroidElement dailyPriceLabel;
        
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"price\"]/tbody/tr[1]/td[2]/span[1]", priority = 1)
    private AndroidElement dailyPriceValue;
    
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"deal_expiry_timer_040f47fe\"]", priority = 1)
    @AndroidFindBy(xpath = "deal_expiry_timer_040f47fe", priority = 1)
    private AndroidElement offersEndLabel;
    
    
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"availability\"]/span", priority = 1)
    @AndroidFindBy(xpath = "deal_expiry_timer_040f47fe", priority = 1)
    private AndroidElement availabilityLabel;
    
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]/span[1]", priority = 1)
    private AndroidElement quantitySelect;
    
    @HowToUseLocators(androidAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
    @AndroidFindBy(xpath = "//*[@id=\"add-to-cart-button\"]", priority = 1)
    private AndroidElement addToCardButton;

	public AndroidElement getScreenTitle() {
		return screenTitle;
	}

	public void setScreenTitle(AndroidElement screenTitle) {
		this.screenTitle = screenTitle;
	}

	public AndroidElement getTitle() {
		return title;
	}

	public void setTitle(AndroidElement title) {
		this.title = title;
	}

	public AndroidElement getTitleDetail() {
		return titleDetail;
	}

	public void setTitleDetail(AndroidElement titleDetail) {
		this.titleDetail = titleDetail;
	}

	public AndroidElement getImages() {
		return images;
	}

	public void setImages(AndroidElement images) {
		this.images = images;
	}

	public AndroidElement getListPriceLabel() {
		return listPriceLabel;
	}

	public void setListPriceLabel(AndroidElement listPriceLabel) {
		this.listPriceLabel = listPriceLabel;
	}

	public AndroidElement getListPriceValue() {
		return listPriceValue;
	}

	public void setListPriceValue(AndroidElement listPriceValue) {
		this.listPriceValue = listPriceValue;
	}

	public AndroidElement getDailyPriceLabel() {
		return dailyPriceLabel;
	}

	public void setDailyPriceLabel(AndroidElement dailyPriceLabel) {
		this.dailyPriceLabel = dailyPriceLabel;
	}

	public AndroidElement getDailyPriceValue() {
		return dailyPriceValue;
	}

	public void setDailyPriceValue(AndroidElement dailyPriceValue) {
		this.dailyPriceValue = dailyPriceValue;
	}

	public AndroidElement getOffersEndLabel() {
		return offersEndLabel;
	}

	public void setOffersEndLabel(AndroidElement offersEndLabel) {
		this.offersEndLabel = offersEndLabel;
	}

	public AndroidElement getAvailabilityLabel() {
		return availabilityLabel;
	}

	public void setAvailabilityLabel(AndroidElement availabilityLabel) {
		this.availabilityLabel = availabilityLabel;
	}

	public AndroidElement getQuantitySelect() {
		return quantitySelect;
	}

	public void setQuantitySelect(AndroidElement quantitySelect) {
		this.quantitySelect = quantitySelect;
	}

	public AndroidElement getAddToCardButton() {
		return addToCardButton;
	}

	public void setAddToCardButton(AndroidElement addToCardButton) {
		this.addToCardButton = addToCardButton;
	}
    
    

    
}
