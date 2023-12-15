package com.nopcommerce.Desktop;

import com.nopcommerce.pages.Desktop;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DesktopTest extends TestBase {

    HomePage homepage = new HomePage();
    Desktop DK = new Desktop();

    @Test
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        homepage.computerClick();
        homepage.computer();
        DK.selectFromAtoZ();
        Thread.sleep(2000);
        DK.addToCart();
        DK.ownComputer();
        DK.intelPlatinumSelect();
        DK.eightGBSelect();
        DK.fourHundredGBSelect();
        DK.vistaPremiumSelect();
        DK.microsoftOfficeSelect();
        DK.addToCartClick();
        DK.closeBarTab();
        DK.mouseHoverOnCross();
        DK.shoppingCartMsg();
        DK.changeQuantity();
        driver.findElement(By.xpath("//form[@id='shopping-cart-form']/div[1]/table/tbody/tr/td[5]")).clear();
        DK.changeQuantity();
        DK.agreeClickCheckBox();
        DK.checkoutBtn();
        DK.checkoutButtonGuest();
        DK.personalDetails();
        DK.continueButton2();
        DK.nextAirBtn();
        DK.continueButton3();
        DK.mastercardBtn();
        DK.personalCardDetails();
        DK.continueButton5();
        DK.confirmButton6();
        DK.thankYouText();
        DK.successProcessText();
        DK.welcomeStoreText();
    }
}
