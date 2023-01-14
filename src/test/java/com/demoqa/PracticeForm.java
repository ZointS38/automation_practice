package com.demoqa;


import com.codeborne.selenide.Configuration;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "720x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void practiceFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Artem");

        $("#lastName").setValue("Artemov");

        $("#userEmail").setValue("artem@rtem.com");

        $(byId("gender-radio-1")).doubleClick();

        $("#userNumber").setValue("0123456789");

        $("#dateOfBirthInput").click();
        $(by("class","react-datepicker__month-select")).click();
        $(by("value","8")).click();
        $(by("class","react-datepicker__year-select")).click();
        $(by("value","1999")).click();
        $(by("class","react-datepicker__day react-datepicker__day--014")).click();

        $("#subjectsInput").setValue("M");
        $(byId("react-select-2-option-0")).click();

        $("#subjectsInput").setValue("P");
        $(byId("react-select-2-option-0")).click();

        $(by("for","hobbies-checkbox-1")).click();
        $(by("for","hobbies-checkbox-2")).click();
        $(by("for","hobbies-checkbox-3")).click();

//        $("#uploadPicture").click();


        $("#currentAddress").setValue("Pushkina street, Kolotushkina 1");


        $(by("class"," css-tlfecz-indicatorContainer")).click();
        $("#react-select-3-option-3").click();
        $("#city").click();
        $("#react-select-4-option-1").click();

        $("#submit").click();
    }
}


