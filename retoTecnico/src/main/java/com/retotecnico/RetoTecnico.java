/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retotecnico;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author jassu
 */
public class RetoTecnico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
        System.out.println(System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            driver.manage().window().maximize();
            driver.get("https://www.choucairtesting.com/");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a")).click();
            Thread.sleep(1000);
            jse.executeScript("window.scrollTo(0,300)");
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[3]/div/div/div[2]/div/div/div/div/div/a/span/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-11876\"]/div/div[2]/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/div/a/span/span")).click();
            Thread.sleep(1000);
            jse.executeScript("window.scrollTo(0,1600)");
            driver.findElement(By.xpath("//*[@id=\"candidate_first_name\"]")).sendKeys("Jeisson David");
            driver.findElement(By.xpath("//*[@id=\"candidate_last_name\"]")).sendKeys("Calderon Sua");
            driver.findElement(By.xpath("//*[@id=\"candidate_email\"]")).sendKeys("Prueba3@pruebas.co");
            driver.findElement(By.xpath("//*[@id=\"candidate_phone\"]")).sendKeys("3112869345");
            driver.findElement(By.xpath("//*[@id=\"candidate_accept_terms\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"new_candidate\"]/span[6]/button")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"wrapperRegister\"]/div[1]/div/div[3]/div/label[1]")).click();
            jse.executeScript("window.scrollTo(0,200)");
            driver.findElement(By.xpath("//*[@id=\"wrapperRegister\"]/div[1]/div/div[4]/button")).click();
            Thread.sleep(500);
//            driver.findElement(By.xpath("//*[@id=\"emailId\"]")).clear();
//            driver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("Prueba1@pruebas.co");
            driver.findElement(By.xpath("//*[@id=\"emailConfirmationId\"]")).sendKeys("Prueba3@pruebas.co");
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"formBasicCheckbox\"]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"d-correo\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"nameInputCopy\"]")).sendKeys("Jeisson David");
            driver.findElement(By.xpath("//*[@id=\"lastNameInputCopy\"]")).sendKeys("Calderon Sua");
            driver.findElement(By.xpath("//*[@id=\"d-nombre\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"cityName\"]")).sendKeys("Bogota");
            driver.findElement(By.xpath("//*[@id=\"17050\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"birthdayInputCopy\"]")).sendKeys("10051991");
            driver.findElement(By.xpath("//*[@id=\"d-nacimiento\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"form-gender\"]/div[2]/div[1]/label")).click();
            driver.findElement(By.xpath("//*[@id=\"form-gender\"]/div[4]/div[1]/label")).click();
            driver.findElement(By.xpath("//*[@id=\"d-genero\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"form-category\"]/div/div[21]/label")).click();
            jse.executeScript("window.scrollTo(0,600)");
            driver.findElement(By.xpath("//*[@id=\"d-categorias\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"form-horaryDispo\"]/div/div[1]/label")).click();
            driver.findElement(By.xpath("//*[@id=\"d-disponibilidad\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"salaryInputCopy\"]")).sendKeys("1000000");
            driver.findElement(By.xpath("//*[@id=\"d-salario\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"cityName\"]")).sendKeys("bogota");
            driver.findElement(By.xpath("//*[@id=\"17050\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"d-ubicacion\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"wrapperRegister\"]/div[3]/div/div/div/div[2]/span[1]/div/label")).click();
            driver.findElement(By.xpath("//*[@id=\"validationCustom01\"]")).sendKeys("UNIMINUTO");
            driver.findElement(By.xpath("//*[@id=\"validationCustom02\"]")).sendKeys("Estudiante");
            driver.findElement(By.xpath("//*[@id=\"formGridCity\"]")).click();
            
            
        } catch (Exception e) {

        } finally {
            driver.close();
        }
    }
    
}
