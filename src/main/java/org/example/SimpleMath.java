package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  *  Copyright 2021 Vincent Verapen
 */
public class SimpleMath
{
    public static void main( String[] args )
    {
        Scanner firstNum = new Scanner(System.in);
        Scanner secondNum = new Scanner(System.in);
        System.out.println( "What is the First number? " );
        String firstNumber = firstNum.next();
        System.out.println("What is the second number? ");
        String secondNumber = secondNum.next();
        Convert num = new Convert();
        double num1 = num.convertNum(firstNumber);
        double num2 = num.convertNum(secondNumber);
        PrintFunctions print = new PrintFunctions();
        print.printFunction(num1, num2);
    }
}
