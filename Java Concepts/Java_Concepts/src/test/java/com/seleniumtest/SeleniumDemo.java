package com.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.get("https://www.amazon.in/");
        //  webDriver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]/div[2]/div[1]/div")).click();
        //  webDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Shoes");
        // webDriver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

        Actions action = new Actions(webDriver);
        action.moveToElement(webDriver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]/div[2]/div[1]/div"))).click().build().perform();
        action.moveToElement(webDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).sendKeys("Shoes").build().perform();
        action.sendKeys(Keys.ENTER).build().perform();

        webDriver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[4]/div/div/form/span")).click();
        webDriver.findElement(By.xpath("//*[@id=\"s-result-sort-select_5\"]")).click();

        action.scrollToElement(webDriver.findElement(By.xpath("//span[text()='Mens Dazzler Sneaker']"))).build().perform();
        action.click(webDriver.findElement(By.xpath("//span[text()='Mens Dazzler Sneaker']"))).build().perform();
        Object[] handles = webDriver.getWindowHandles().toArray();
        webDriver.switchTo().window((String) handles[1]);
        action.moveToElement(webDriver.findElement(By.xpath("//input[@id='add-to-cart-button']"))).click().build().perform();
        action.moveToElement(webDriver.findElement(By.xpath("//span[@id='sw-gtc']"))).click().build().perform();
        webDriver.navigate().back();
        webDriver.navigate().back();
        webDriver.navigate().refresh();
        webDriver.switchTo().window((String) handles[0]);


    }
}
