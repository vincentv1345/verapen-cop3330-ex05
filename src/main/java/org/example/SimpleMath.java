package org.example;
import java.util.Scanner;
/**
 * Simple Math function that calculates
 * the multiple, addition, division,
 * and subtraction of two numbers
 *
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
        int num1 = num.convertNum(firstNumber);
        int num2 = num.convertNum(secondNumber);
        PrintFunctions print = new PrintFunctions();
        print.printFunction(num1, num2);
    }
}
