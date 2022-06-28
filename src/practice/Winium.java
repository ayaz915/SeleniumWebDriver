package practice;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.winium.DesktopOptions;

import org.openqa.selenium.winium.WiniumDriver;

public class Winium {

public static void main(String[] args) throws MalformedURLException, InterruptedException {

DesktopOptions option = new DesktopOptions();

option.setApplicationPath("path");

//WiniumDriver driver = new WiniumDriver(new URL(, option“http://localhost:9999”), option);
//
//Thread.sleep(5000);
//
//driver.findElement(By.name("name")).click();
//
//driver.findElement(By.name(“Plus”)).click();
//
//driver.findElement(By.name(“Two”)).click();
//
//driver.findElement(By.name(“Equals”)).click();
//
//String output = diver.findElement(By.id(“CalculatorResults”)).getAttribute(“Name”);
//
//System.out.println(“Result after addition is: “+output);

//driver.quit();

}}