package com.krysov.tests;

import org.junit.jupiter.api.Test;
import static com.krysov.tests.TestData.*;

public class RegistrationWithFaker extends com.krysov.tests.TestBase {
    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .setFirstName(name)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhone(mobile)
                .setBirthDate(dayBirth, monthBirth, yearBirth)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setPicture(picture)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submit()
                .verifyResultsModalAppears()
                .verifyResult("Student Name", name + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", mobile)
                .verifyResult("Date of Birth", dayBirth+" "+ monthBirth+","+yearBirth)
                .verifyResult("State and City", state+ " "+city)
                .verifyResult("Subjects", subjects)
                .verifyResult("Picture", picture.substring(4,9))
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Address", currentAddress);
    }
}
