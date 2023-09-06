package com.qa.example.tests;

import com.qa.example.pages.BaseTest;
import com.qa.example.pages.HomePage;
import com.qa.example.pages.SimpleFormDemoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFormDemoTests extends BaseTest {
    SimpleFormDemoPage simpleFormDemoPage;
    HomePage homePage;

    @Test
    public void SimpleFormDemo_enterInput_shouldDisplayInput(){
        // Given
        String testMessage = "Hej";

        // When
        homePage.followLinkToSimpleFormDemoPage();
        simpleFormDemoPage.typeMessageIntoInputField(testMessage);
        simpleFormDemoPage.clickGetCheckedValueButton();
        String result = simpleFormDemoPage.getDisplayMessage();


        // Then
        Assert.assertEquals(result, testMessage);
    }
}
