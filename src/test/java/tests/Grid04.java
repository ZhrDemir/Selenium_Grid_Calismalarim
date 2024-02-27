package tests;

import manage.DriverManage;
import org.testng.annotations.Test;

public class Grid04 {
    DriverManage driverManage= new DriverManage();

    @Test
    void test01(){

        driverManage.remoteChromeSetUp().get("https://www.wisequarter.com");

    } @Test
    void test02(){

       driverManage.remoteFirefoxSetUp().get("https://www.wisequarter.com");

    } @Test
    void test03(){

        driverManage.remoteChromeSetUp().get("https://www.youtube.com");


    } @Test
    void test04(){
        driverManage.remoteFirefoxSetUp().get("https://www.youtube.com");



    } @Test
    void test05(){

        driverManage.remoteChromeSetUp().get("https://www.testotomasyonu.com");


    } @Test
    void test06(){
        driverManage.remoteFirefoxSetUp().get("https://www.testotomasyonu.com");




    } @Test
    void test07(){

        driverManage.remoteChromeSetUp().get("https://www.google.com");



    } @Test
    void test08(){

        driverManage.remoteFirefoxSetUp().get("https://www.google.com");


    }
}
