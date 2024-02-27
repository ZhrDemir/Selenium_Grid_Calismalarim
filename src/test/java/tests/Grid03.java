package tests;

import manage.DriverManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import static manage.DriverManage.*;

import static manage.DriverManage.closeDriver;
import static manage.DriverManage.setDriver;

public class Grid03 {


    @BeforeTest
    @Parameters("browser")
    public void beforeTest(@Optional("browser") String browser){

        setDriver("chrome");


    }

    @Test
    void test01(){
        DriverManage.driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    void test02(){
        driver.get("https://www.ebay.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    void test03(){
        driver.get("https://www.n11.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

    @AfterTest
    void afterTest(){
        closeDriver();
    }

}
