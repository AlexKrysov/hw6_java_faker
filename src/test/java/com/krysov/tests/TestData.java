package com.krysov.tests;

import com.github.javafaker.Faker;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestData {
    public static Faker faker = new Faker();
    public static String name = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String email = faker.internet().emailAddress();
    public static String currentAddress = faker.address().fullAddress();
    public static String mobile = faker.phoneNumber().subscriberNumber(10);
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
    public static String[] date = dateFormat.format(faker.date().birthday()).split(" ");
    public static String dayBirth = date[0];
    public static String monthBirth = date[1];
    public static String yearBirth = date[2];
    public static
    String
            gender = "Other",
            subjects = "biology",
            hobbies = "Sports",
            picture = "img/1.png",
            state = "NCR",
            city = "Delhi";
}
