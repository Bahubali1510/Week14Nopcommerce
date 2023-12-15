package com.nopcommerce.homepage;

import com.nopcommerce.pages.Desktop;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenu extends TestBase {
    HomePage homepage = new HomePage();
    Desktop DK = new Desktop();

    @Test
public void  TestName(){

        homepage.computerClick();
        homepage.computer();
        DK.selectFromZtoA();
    }
}
