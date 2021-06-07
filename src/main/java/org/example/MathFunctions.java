package org.example;
import java.lang.Math;
public class MathFunctions {
    double n;
    public void add(double number1, double number2){
        double n = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + n);
    }
    public void subtract(double number1, double number2){
        double n = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + n);
    }
    public void multiply(double number1, double number2)
    {
        double n = number1 * number2;
        System.out.println(number1 + " x " + number2 + " =" + n);
    }
    public void divide(double number1, double number2){
        double n = number1 / number2;
        double roundN = Math.round(n*100)/100;
        System.out.println(number1 + " / " + number2 + " = " + roundN);
    }
}
