package com.example.java;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        int Result = 0; // Final Answer

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();         //time is t normal hours per week
        int d = sc.nextInt();        //d dollar for each hour of normal work
        int D = sc.nextInt();        //more than t hours, receives D Dollars
        int T = sc.nextInt();        //T is total of hours Alice worked

        if (t < T) {

            Result += (T - t) * D; // Extra hours that Alice worked than her normal hours (paid extra)
            Result += t * d; // The normal hours that Alice worked (paid normal)

        } else Result = T * d; //If Alice hasn't worked extra hours (paid normal)

        System.out.println(Result); //Prints out the final answer

    }
}
