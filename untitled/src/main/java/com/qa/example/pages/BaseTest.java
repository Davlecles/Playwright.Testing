package com.qa.example.pages;

import com.microsoft.playwright.Page;
import com.qa.example.factory.PlaywrightFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends PlaywrightFactory{

    protected Page page;
    protected HomePage homePage;
    protected SimpleFormDemoPage simpleFormDemoPage;
    protected PlaywrightFactory playwrightFactory;

    @BeforeTest
    public void setup(){
        playwrightFactory = new PlaywrightFactory();
        page = playwrightFactory.getPage();
        homePage = new HomePage(page);
    }

    @AfterTest
    public void tearDown(){
        page.context().browser().close();
    }
}
