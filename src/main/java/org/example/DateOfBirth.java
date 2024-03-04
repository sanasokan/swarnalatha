package org.example;
import java.time.Year;
import java.util.Scanner;

public class DateOfBirth {
    public static void main(String[] args){
        String name, greetings;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        DateOfBirth myDob = new DateOfBirth();
        do {
            System.out.println("Enter your age:");
            String ageinstring = scanner.nextLine();
            greetings = myDob.Greeting(name, ageinstring);
            System.out.println(greetings);
        } while (greetings.equals("Try again"));
    }
    public int getBirthYear(int age) {
        int currentYear = Year.now().getValue();
        return currentYear - age;
    }
    public String Greeting(String name, String age) {
        int validAge = getValidAge(age);
        if (validAge != -99) {
            return "Hi " + name + "! You were born in: " + getBirthYear(validAge);
        } else {
            return "Try again";
        }
    }
    public int getValidAge(String age) {
        int InvalidAge = -99;
        try {
            int validAge = Integer.parseInt(age);
            if (validAge <= 0) {
                System.out.println("Please provide positive number");
                return InvalidAge;
            } else {
                return validAge;
            }
        } catch (NumberFormatException e) {
            {
                System.out.println("Please provide numerical input");
                return InvalidAge;
            }
        }
    }

}