package ru.DeliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {


    @Test
    public void firstTest() {

        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));

        driver.quit();

    }


        @Test
        public void firstTest2() {
            driver.get("https://www.delivery-club.ru/");

            String title = driver.getTitle();
            Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        }
}
