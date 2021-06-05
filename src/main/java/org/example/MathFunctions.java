package org.example;

public class MathFunctions {
    int n;
    public void add(int number1, int number2){
        int n = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + n);
    }
    public void subtract(int number1, int number2){
        int n = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + n);
    }
    public void multiply(int number1, int number2)
    {
        int n = number1 * number2;
        System.out.println(number1 + " x " + number2 + " =" + n);
    }
    public void divide(int number1, int number2){
        int n = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + n);
    }
}
