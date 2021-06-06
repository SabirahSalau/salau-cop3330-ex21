/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;

import java.util.Scanner;

public class Problem21
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String month = null;


        System.out.println("Please enter the number of the month:");
        int number = input.nextInt();

        while(number < 1 || number >12)
        {
            System.out.println("Please pick a number between 1 and 12:");
            number = input.nextInt();
        }

        switch (number)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;

            case 12:
                month = "December";
                break;
        }

        System.out.println("The name of the month is " + month);

    }
}
