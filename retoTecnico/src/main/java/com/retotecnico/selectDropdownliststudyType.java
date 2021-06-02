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
public class selectDropdownliststudyType {
    
    By selectDropdown_liststudyType = By.name("studyType");
    By selectDropdown_studyCountry = By.name("studyCountry");
    
    
    public selectDropdownliststudyType(WebDriver  driver){
        
    }
    
    public String selectDropdownliststudyType(){
        Select selectList =new Select(findEle
    }
}
