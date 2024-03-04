**Project:**  **Year Of Birth Calculator**

**Submitted By:** Swarnalatha Asokan

**Professor:** Jakob Forsbacka

**Course:** Programming For Testers

**Belongs To:** Technical Tester: (TTK23G)

**School:** Jensen YH



**getBirthYear Method:**

"int currentYear = Year.now().getValue()"
It takes year from the inbuilt library.

Year.now() gives you the current year, and .getValue() extracts the actual year value as an integer.
It captures the current year and stores it in the variable currentYear.

return "currentYear - age";
It calculates the birth year by subtracting age from the current year.

**greeting Method:**

I have given two parameters as string name and age. I have used if else condition to check the validation of age,  
and it returns **"Hi [Name]! You were born in: [Year]".**
If the input is Invalid age (not a number, negative, or zero) then it returns **"Try again"**.

**getValidAge Method:**

I declared the "int InvalidAge = -99". This value is used for error indication. 

I have used try and catch (NumberFormatException e) This structure is used to 
 process the age validation.

This line defines, "int validAge = Integer.parseInt(age)" It tries to convert string value as a integer. 

If validAge is Positive
If the number is greater than zero, it means the age is a valid positive number.
In this case, it returns the valid age.If validAge is Not Positive
It prints a message saying "Please provide a positive number."
and it returns InvalidAge (-99) saying that there's an issue.

I have used catch "NumberFormatException e" if the age is not a number,it catches that error
and prints a message saying "Please provide numerical input."

**main Method:**

In this method, String name, greetings are the variables which are used to store the user's name and the greeting message.
Scanner object named scanner to read input from the user. 

"name = scanner.nextLine()"
It reads the user's input (their name) and stores it in the variable name. 
I have used "myDob" as an object for the class "DateOfBirth". 
This allows you to use the methods defined in the DateOfBirth class.

In "do-while loop" it keeps running until the user gives valid input, happening at least once,
and it continues as long as the user is told to "Try again."

"String ageinstring" = scanner.nextLine()
It reads the user's input (their age) and stores it in the variable ageinstring.

"greetings = myDob.Greeting(name, ageinstring)"
This Calls the Greeting method of the DateOfBirth class, passing in the user's name and age as parameters.
The result (greeting message or "Try again") is stored in the variable greetings.

**Test case for the source code as follows in Unit testing:**

**getAge method test case:**

TestGetAgePositive: 
In this case it calls the getValidAge method of yearCalculator with the input "30".
Uses the assertEquals method to verify that the result returned by getValidAge is equal to the expected value,
which is 30. 

TestGetAgeNegative:  
With the input "-9". It Uses the assertEquals method to verify that the result returned
by getValidAge is equal to the expected value, which is -99 in this case.

TestGetAgeStringInput:  
DateOfBirth class is provided with a non-numeric string input as 
string "abc". it responds by returning the predefined value -99. 

**Greeting method:**

TestGreetingsNegativeAge:
Validate the Greeting method's response when provided with a negative age.
and also it returns greeting says "Try again."

TestGreetingsWithPositiveAge:
This test verifies that the Greeting method when given the name "Swarna" and the age "31",
with the expected greeting message: "Hi Swarna! You were born in: 1992".

**getBirthYear method:**

TestgetBirthYear: The expected birth year is calculated by subtracting 23 from the current year. 
This method calls with the age parameter 23, and the result is compared to the expected birth year.

**Overall:**

The program is a user-friendly calculator that not only determines your birth year but also provides friendly greetings. 
It's built to handle different situations robustly, ensuring it won't crash with unexpected inputs.



