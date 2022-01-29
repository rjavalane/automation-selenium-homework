package homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AppTest {
    WebDriver driver; // this is interface

    @BeforeMethod
    public void beforeMethod() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\19176\\IdeaProjects\\automationTesting\\src\\driver\\chromedriver.exe");
        driver = new ChromeDriver();// this is a class
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// to make selenuim to wait for 10 second in order to give selenium time to look for needed elements.
        driver.get("https://www.walgreens.com/");
        //driver.findElement(By.cssSelector("#widgets-view-email-modal-mount > div > div > div:nth-child(1) > div > div > div > div > button")).click();
        // String expectedTitle= "Best Buy | Official Online Store | Shop Now & Save";
        // String actualTitle= driver.getTitle();
        //Assert.assertEquals(actualTitle,expectedTitle, "title validation success");
    }

    @Test
    public void test0() throws InterruptedException { //testing the search bar and submit button
        driver.findElement(By.cssSelector("#ntt-placeholder")).sendKeys("water");
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.search-contain.testing.dropdown.input__search.expanded > form > button.icon.icon__search")).click();

    }

    @Test
    public void test1() throws InterruptedException { //testing the signin with wrong credentials
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.right-links > div > a > span.icon.icon__arrow-down > svg")).click();
        driver.findElement(By.xpath("//*[@id=\"pf-dropdown-signin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("bernard.legrand@bmail.dz");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("Bletiming$$123");
        driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();

    }

    @Test
    public void test2() throws InterruptedException { //testing the creation of an account
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.right-links > div > a > span.icon.icon__arrow-down > svg")).click();
        driver.findElement(By.xpath("//*[@id=\"pf-dropdown-signin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"create_btn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"wag-RXUser-firstname\"]")).sendKeys("Maurice");
        driver.findElement(By.xpath("//*[@id=\"wag-RXUser-lastname\"]")).sendKeys("TESTER");
        driver.findElement(By.xpath("//*[@id=\"wag-email\"]")).sendKeys("maurice.tester18@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"wag-password\"]")).sendKeys("Emailfortesting18@testing");
        driver.findElement(By.xpath("//*[@id=\"wag-reg-points&terms-InnerHTML\"]/section[2]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"wag-rxuser-continue-btm\"]")).click();
    }

    @Test
    public void test3() throws InterruptedException { //testing the signin with correct credentials
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.right-links > div > a > span.icon.icon__arrow-down > svg")).click();
        driver.findElement(By.xpath("//*[@id=\"pf-dropdown-signin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("maurice.tester18@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("Emailfortesting18@testing");
        driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();

    }

    @Test
    public void test4() throws InterruptedException { //testing the signout
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.right-links > div > a > span.icon.icon__arrow-down > svg")).click();
        driver.findElement(By.xpath("//*[@id=\"pf-dropdown-signin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("maurice.tester18@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("Emailfortesting18@testing");
        driver.findElement(By.xpath("//*[@id=\"submit_btn\"]")).click();
        driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/div/div[4]/div/a/span[2]")).click();
        driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/div/div[4]/div/ul/li[10]")).click();
    }

    @Test
    public void test5() throws InterruptedException { //testing the home button
        driver.findElement(By.cssSelector("#ntt-placeholder")).sendKeys("water");
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.search-contain.testing.dropdown.input__search.expanded > form > button.icon.icon__search")).click();
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.left-nav > a > span")).click();

        }

    @Test
    public void test6() throws InterruptedException { //Scheduling a vaccine
        driver.findElement(By.cssSelector("#holiday_hp_gift_1 > a")).click();
        driver.findElement(By.cssSelector("#covid-btn")).click();
        driver.findElement(By.cssSelector("#inputLocations")).sendKeys("");
        driver.findElement(By.cssSelector("#userDob")).sendKeys("01/01/2000");
        driver.findElement(By.cssSelector("#dose1")).click();
        driver.findElement(By.cssSelector("#nextbtnLanding")).click();
        driver.findElement(By.cssSelector("#wag-store-info-1 > div > div > div.main-content.inner.active > section > section > ul > li:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector("#wag-store-info-1 > div > div > div.main-content.inner.active > section > section > button")).click();
        driver.findElement(By.cssSelector("#wag-store-info-0 > div > div > div.main-content.inner.active > section > section > ul > li:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector("#wag-store-info-0 > div > div > div.main-content.inner.active > section > section > button")).click();
        driver.findElement(By.cssSelector("#wag-body-main-container > section > section > section > section.btn__pair.interested-vaccines-btn.mt30.mb40 > a.nothanks-btn.secondary")).click();
        driver.findElement(By.cssSelector("#wag-body-main-container > section > section > section > section:nth-child(2) > section > span > a")).click();
    }
    @Test
    public void test7() throws InterruptedException { //testing the accessibility of the sub menu "shop products dropdown"
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.dropdown.dropdown__menu > a > span > span")).click();
        driver.findElement(By.cssSelector("#menu-Coupons > a > span:nth-child(2)")).click();
    }

    @Test
    public void test8() throws InterruptedException { //testing the add to cart functionality
        driver.findElement(By.cssSelector("#ntt-placeholder")).sendKeys("energy drinks");
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.search-contain.testing.dropdown.input__search.expanded > form > button.icon.icon__search")).click();
        driver.findElement(By.cssSelector("#pickup-ship-btncompare_sku6081441")).click();
        driver.findElement(By.cssSelector("#addtocartdialog > div.modal__content-contain.modal__white.upsell_atc > button")).click();
        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.right-links > a > span.icon.icon__cart-full")).click();


    }

    @Test
    public void test9() throws InterruptedException { //testing the pharmacy chat functionality
        driver.findElement(By.cssSelector("#Homepage_Rx_CT_CEP > div.content__wrap > div > div > div > div > div.ribbon__icons > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#ChatButton")).click();

    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
