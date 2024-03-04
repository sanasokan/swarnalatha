package org.example;
import org.junit.Test;
import org.testng.IResultMap;

import java.time.Year;

import static org.junit.Assert.assertEquals;

public class DateOfBirthTest {
    @Test
    public void TestGetAgePositive() {
        DateOfBirth yearCalculator = new  DateOfBirth();
        int result = yearCalculator.getValidAge("30");
        assertEquals(30,result);
    }

    @Test
    public void TestGetAgeNegative() {
        DateOfBirth YearCalculator = new  DateOfBirth();
        int result = YearCalculator.getValidAge("-9");
        assertEquals(-99, result);
    }
    @Test
    public void TestGetAgeStringInput(){
        DateOfBirth yearCalculator = new  DateOfBirth();
        int result= (yearCalculator.getValidAge("abc"));
        assertEquals(-99,result);
    }
    @Test
    public void TestGreetingsWithPositiveAge() {
        DateOfBirth yearCalculator = new  DateOfBirth();
        String name = "Swarna";
        String age = "31";
        String expectedGreeting = "Hi Swarna! You were born in: 1992";
        assertEquals(expectedGreeting, yearCalculator.Greeting(name, age));
    }
    @Test
    public void TestGreetingsNegativeAge() {
        DateOfBirth yearCalculator = new DateOfBirth();
        String name = "Swarna";
        String age = "-99";
        String expectedGreeting = "Try again";
        assertEquals(expectedGreeting, yearCalculator.Greeting(name, age));
    }

    @Test
    public void TestgetBirthYear() {
        DateOfBirth yearCalculator = new  DateOfBirth();
        int expectedBirthYear = Year.now().getValue() - 23;
        int actualBirthYear = yearCalculator.getBirthYear(23);
        assertEquals(2000, actualBirthYear);
    }
}