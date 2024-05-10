package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Problem 2
        // Initialize the Scanner object to read from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Display a message prompting for text input
        // The user will enter the requested text and press Enter
        // The code line that will actually read the text from the keyboard
        // Define a String variable to store the entered text
        System.out.print("Enter your name: ");
        String personName = scanner.nextLine();

        // Get the last name here and display a message to know what to write
        System.out.print("Enter your last name: ");
        String personLastName = scanner.nextLine();

        // Display the person's name and last name entered from the keyboard
        System.out.println("The entered name is: " + personName + " " + personLastName);
    }
}
