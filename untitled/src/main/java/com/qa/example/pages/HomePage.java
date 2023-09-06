package com.qa.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {

    Page page;

    private final Locator linkToSimpleFormDemo = page.getByText("Simple Form Demo");
    private final Locator linkToCheckBoxDemo = page.getByText("Checkbox Demo");

    public HomePage(Page page){
        this.page = page;
    }

    public void followLinkToSimpleFormDemoPage(){
        linkToSimpleFormDemo.click();
    }

    public void followLinkToCheckboxDemo(){
        linkToCheckBoxDemo.click();
    }


}
