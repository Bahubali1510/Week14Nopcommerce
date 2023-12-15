package com.nopcommerce.pages;


import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By computerMenu = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul[1]/li[1]/a");
    By computerTab = By.xpath("//html[@lang='en']/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a");


    public void computerClick() {
        clickOnElement(computerMenu);
    }

    public void computer() {
        clickOnElement(computerTab);
    }

}