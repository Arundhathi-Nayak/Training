package com.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.flipkart.com/");
        webDriver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("Phone");
        webDriver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).submit();
//        System.out.println(webDriver.findElements(By.className("_75nlfW")).size());

       List<WebElement> webElementList= webDriver.findElements(By.className("_75nlfW"));
       for(WebElement webElement:webElementList){
           if(webElement.findElement(By.className("KzDlHZ")).getText().equals("Apple iPhone 15 (Blue, 128 GB)")){
               webElement.findElement(By.className("KzDlHZ")).click();
               System.out.println("Success");
               return;
           }
       }
        System.out.println("Failed");
        webDriver.quit();

    }
}
