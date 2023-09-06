package com.qa.example.factory;
import com.microsoft.playwright.*;

public class PlaywrightFactory {


    Playwright playwright;
    protected Page page;
    Browser browser;
    BrowserContext browserContext;

    public Page getPage(){

        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate("https://www.lambdatest.com/selenium-playground/");

        return page;
    }

}