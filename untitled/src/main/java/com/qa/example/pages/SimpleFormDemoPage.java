package com.qa.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class SimpleFormDemoPage {

    Page page;

    private final Locator messageField = page.getByPlaceholder("Please enter your Message");
    private final Locator getCheckedValueButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Get Checked Value"));
    private final Locator displayMessageResult = page.locator("//*[@id='message']");

    public SimpleFormDemoPage(Page page){
        this.page = page;
    }

    public void typeMessageIntoInputField(String input){
        messageField.click();
        messageField.fill(input);
    }

    public void clickGetCheckedValueButton(){
        getCheckedValueButton.click();
    }

    public String getDisplayMessage(){
        return displayMessageResult.toString();
    }

}
