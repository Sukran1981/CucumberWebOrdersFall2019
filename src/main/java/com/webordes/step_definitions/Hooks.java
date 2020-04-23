package com.webordes.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {



    @Before
    public void setup(Scenario scenario){
        System.out.println("Starting test automation");
        System.out.println("Browser type :: "+ ConfigurationReader.getProperty("browser"));
        //System.out.println("Browser type :: "+ ConfigurationReader.getProperty("browser"));

        System.out.println("Test scenario ::" +scenario.getName());
        Driver.getDriver().manage().window().maximize();
    }


    @After
    public void tearDown(){

        if(scenario.isFailed()){

            TakesScreenshot takesScreenshot=(TakesScreenshot) Driver.getDriver();

        }
    }
}
