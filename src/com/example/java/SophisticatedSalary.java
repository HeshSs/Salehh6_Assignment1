package com.example.java;

import java.util.Scanner;

public class SophisticatedSalary {

    public static void main(String[] args) {

        int result = 0; // Final Answer
        int t = 0;        // time is t normal hours per week
        int d = 0;        // d dollar for each hour of normal work
        int D = 0;        // more than t hours, receives D Dollars
        int T = 0;        // T is total of hours Alice worked

        Scanner sc = new Scanner(System.in); //Scanner Object

        int n = 0; //number of inputs

        do {

            String a = sc.next();
            if (a.charAt(0) == 't') { //if the variable's name is t
                t = Integer.parseInt(a.substring(2)); //, set t as the inputted integer (after the "=" sign)

            } else if (a.charAt(0) == 'd') { //if the variable's name is d
                d = Integer.parseInt(a.substring(2)); //, set d as the inputted integer (after the "=" sign)

            } else if (a.charAt(0) == 'D') { //if the variable's name is D
                D = Integer.parseInt(a.substring(2)); //, set D as the inputted integer (after the "=" sign)

            } else if (a.charAt(0) == 'T') { //if the variable's name is T
                T = Integer.parseInt(a.substring(2)); //, set T as the inputted integer (after the "=" sign)
            }
            n++;

        } while (n < 4); //asks for 4 inputs

        if (t < T) {

            result += (T - t) * D; // Extra hours that Alice worked than her normal hours (paid extra)
            result += t * d; // The normal hours that Alice worked (paid normal)

        } else result = T * d; // If Alice hasn't worked extra hours (paid normal)

        StringBuilder sb = new StringBuilder(); // Creates a StringBuilder Object
        sb.append(result);
        sb.append(" Dollars"); // Creates the final Answer that is going to be wrapped by "*" signs

        for (int i = 0; i < sb.length(); i++) {
            System.out.print("*"); // Prints a line of '*' signs BEFORE the answer
        }

        System.out.println(); // Enters the next line
        System.out.println(sb); // Prints the ANSWER to the screen

        for (int i = 0; i < sb.length(); i++) {
            System.out.print("*"); // Prints a line of '*' signs AFTER the answer
        }
    }

}
