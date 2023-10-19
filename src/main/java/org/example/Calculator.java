// package org.example;

import java.util.*;

public class Calculator 
{

    public static double Add(double n1, double n2)
    {
        double res = n1 + n2;
        return res;
    }

    public static double Multiply(double n1, double n2)
    {
        double res = n1*n2;
        return res;
    }

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------- Welcome to Calculator Program - SPE ---------");
        System.out.println("");
        System.out.println("-------- Please Enter the Operation Code: ------------");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Exit");

        System.out.println("");

        int op = sc.nextInt();

        if(op == 1)
        {
            System.out.print("Please Enter 2 numbers to be added: ");

            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            double result = Add(num1, num2);

            System.out.println("The Final Result is : " + result);
        }
        else if(op == 2)
        {
            System.out.print("Please Enter 2 numbers to be Multiplied: ");

            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            double result = Multiply(num1, num2);

            System.out.println("The Final Result is : " + result);
        }
        else
        {
            System.out.println("Thanks for Using Calculator Program - BYE");
        }

        sc.close();

    }
}
