package com.krysov.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import static com.krysov.tests.TestData.*;

public class RegistrationWithFaker extends com.krysov.tests.TestBase {
    @Test
    void successfulRegistrationTest() {



        registrationPage.openPage()
                .setFirstName(name)
                .setLastName(lastName)
                .setEmail(Email)
                .setGender(gender)
                .setPhone(Mobile)
                .setBirthDate(dayBirth, monthBirth, yearBirth)
                .setSubjects(Subjects)
                .setHobbies(Hobbies)
                .setPicture(Picture)
                .setAddress(CurrentAddress)
                .setState(State)
                .setCity(City)
                .submit()
                .verifyResultsModalAppears()
                .verifyResult("Student Name", name + " " + lastName)
                .verifyResult("Student Email", Email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", Mobile)
                .verifyResult("Date of Birth", dayBirth+" "+ monthBirth+","+yearBirth)
                .verifyResult("State and City", State+ " "+City)
                .verifyResult("Subjects", Subjects);

    }
}
