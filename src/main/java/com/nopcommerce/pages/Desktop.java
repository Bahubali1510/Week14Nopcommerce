package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class Desktop extends Utility {
    By sortPositionZtoA = By.xpath("//div[@class='master-column-wrapper']/div[3]/div/div[2]/div[1]/div[2]/select[1]");

    public void selectFromZtoA() {
        selectByIndexFromDropDown(sortPositionZtoA, 2);

    }

    By sortPositionAtoZ = By.xpath("//div[@class='master-column-wrapper']/div[3]/div/div[2]/div[1]/div[2]/select[1]");

    public void selectFromAtoZ() {
        selectByIndexFromDropDown(sortPositionAtoZ, 1);

    }

    By cartAdd = By.xpath("//div[@class='master-column-wrapper']/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]");

    public void addToCart() {
        clickOnElement(cartAdd);
    }

    By ownComputerText = By.xpath("//div[@class='master-wrapper-content']/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]/h1");

    public void ownComputer() {
        getTextFromElement(ownComputerText);
    }

    By intelPlatinum = By.xpath("//div[@class='master-wrapper-content']/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[6]/dl/dd[1]");

    public void intelPlatinumSelect() {
        clickOnElement(intelPlatinum);
    }

    By eightGB = By.xpath("//select[@id='product_attribute_2']/option[4]");

    public void eightGBSelect() {
        clickOnElement(eightGB);
    }

    By fourhundredGB = By.xpath("//dd[@id='product_attribute_input_3']/ul/li[2]/label");

    public void fourHundredGBSelect() {
        clickOnElement(fourhundredGB);
    }

    By vistaPremium = By.xpath("//dd[@id='product_attribute_input_4']/ul/li[1]/label");

    public void vistaPremiumSelect() {
        clickOnElement(vistaPremium);
    }

    By microsoftOffice = By.xpath("//dd[@id='product_attribute_input_5']/ul/li[1]/label");

    public void microsoftOfficeSelect() {
        clickOnElement(microsoftOffice);
    }

    By addCart1 = By.xpath("//button[@id='add-to-cart-button-1']");

    public void addToCartClick() {
        clickOnElement(addCart1);
    }

    By closeBar = By.xpath("//div[@id='bar-notification']/div/span");

    public void closeBarTab() {
        clickOnElement(closeBar);
    }

    By mouseHover = By.xpath("li[@id='topcartlink']/a/span[1]");

    public void mouseHoverOnCross() {
        clickOnElement(mouseHover);
    }

    By shoppingMsg = By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[1]/h1");

    public void shoppingCartMsg() {
        getTextFromElement(shoppingMsg);
    }

    By changeQTY = By.xpath("//form[@id='shopping-cart-form']/div[1]/table/tbody/tr/td[5]");

    public void changeQuantity() {
        sendTextToElement(changeQTY, "2");
    }

    By agreeCheckBox = By.xpath("//form[@id='shopping-cart-form']//div[3]/div[2]/div[3]/label");

    public void agreeClickCheckBox() {
        clickOnElement(agreeCheckBox);
    }

    By checkout = By.xpath("//button[@id='checkout']");

    public void checkoutBtn() {
        clickOnElement(checkout);
    }

    By checkoutGuest = By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]");

    public void checkoutButtonGuest() {
        clickOnElement(checkoutGuest);
    }

    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By emailAdd = By.id("BillingNewAddress_Email");
    By countryId = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By address2 = By.id("BillingNewAddress_Address2");
    By zipcode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void personalDetails() {
        sendTextToElement(firstName, "Alka");
        sendTextToElement(lastName, "Jadeja");
        sendTextToElement(emailAdd, "abc@gmail.com");
        sendTextToElement(countryId, "India");
        sendTextToElement(city, "vadodara");
        sendTextToElement(address1, "xyz");
        sendTextToElement(address2, "london");
        sendTextToElement(zipcode, "123456");
        sendTextToElement(phoneNumber, "1234567890");
    }

    By continue2 = By.xpath("//div[@id='billing-buttons-container']/button[4]");

    public void continueButton2() {
        clickOnElement(continue2);
    }

    By nextDayAir = By.xpath("//div[@id='shipping-methods-form']/ul/li[2]/div[1]");

    public void nextAirBtn() {
        clickOnElement(nextDayAir);
    }

    By continue3 = By.xpath("//div[@id='shipping-method-buttons-container']/button");

    public void continueButton3() {
        clickOnElement(continue3);
    }

    By creditcard1 = By.id("paymentmethod_1");

    public void creditcardButton1() {
        clickOnElement(creditcard1);
    }

    By creditcard2 = By.xpath("//div[@id='payment-method-buttons-container']/button");

    public void creditcardButton2() {
        clickOnElement(creditcard2);
    }

    By mastercard = By.xpath("//select[@id='CreditCardType']/option[2]");

    public void mastercardBtn() {
        clickOnElement(mastercard);

    }

    By cardName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By month = By.xpath("//select[@id='ExpireMonth']/option[3]");
    By year = By.id("//select[@id='ExpireYear']/option[2]");
    By code = By.id("CardCode");

    public void personalCardDetails() {
        sendTextToElement(cardName, "Alka");
        sendTextToElement(cardNumber, "5555 1234 1234");
        clickOnElement(month);
        clickOnElement(year);
        sendTextToElement(code, "123");

    }

    By continueBtn5 = By.xpath("//div[@id='payment-info-buttons-container']/button");

    public void continueButton5() {
        clickOnElement(continueBtn5);
    }

    By confirmBtn = By.xpath("//div[@id='confirm-order-buttons-container']/button");

    public void confirmButton6() {
        clickOnElement(confirmBtn);
    }

    By thankYou = By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[1]/h1");

    public void thankYouText() {
        getTextFromElement(thankYou);
    }

    By successProcess = By.xpath("//div[@class='master-wrapper-content']/div/div/div/div[2]/div/div[1]/strong");

    public void successProcessText() {
        getTextFromElement(successProcess);
    }


    By confirmBtn7 = By.xpath(" //div[@class='master-wrapper-content']/div/div/div/div[2]/div/div[3]/button");

    public void confirmButton7() {
        clickOnElement(confirmBtn7);
    }

    By welcomeStore = By.xpath("//div[@class='master-wrapper-content']/div/div/div/div/div[2]/div[1]/h2");

    public void welcomeStoreText() {
        getTextFromElement(welcomeStore);
    }
}