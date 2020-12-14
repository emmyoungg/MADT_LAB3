package com.example.madt_lab4;

public class Calculator {
    public static double add(double n1, double n2)
    {
        return n1 + n2;
    }
    public static double sub(double n1, double n2)
    {
        return n1 - n2;
    }
    public static double mult(double n1, double n2)
    {
        return n1 * n2;
    }
    public static Number div(double n1, double n2)
    {
        if(n2 == 0) {
            return null;
        }
        return n1 / n2;
    }
    public static double rem(double n1, double n2)
    {
        return n1 % n2;
    }
}
