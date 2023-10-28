// package org.example;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator 
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double Add(double n1, double n2)
    {
        logger.info("Starting Add Operation");
        double res = n1 + n2;
        logger.info("Ending Add Operation");
        return res;
    }

    public static double Multiply(double n1, double n2)
    {
        logger.info("Starting Multiply Operation");
        double res = n1*n2;
        logger.info("Ending Multiply Operation");
        return res;
    }

    public static int Factorial(int n1)
    {
        logger.info("Starting Factorial Operation");
        if(n1 < 0)
        {
            logger.warn("Invalid Input");
            return -1;
        }

        int res=1;

        for(int i=1;i<=n1;i++)
            res*=i;
        
        logger.info("Ending Factorial Operation");
        return res;
    }

    public static double Square_Root(double n1)
    {
        logger.info("Starting SquareRoot Operation");
        if(n1 < 0)
        {
            logger.warn("Invalid Input");
            return -1;
        }

        double res = Math.sqrt(n1);
        logger.info("Ending SquareRoot Operation");
        return res;
    }

    
    public static void main(String[] args) 
    {   
        logger.info("Start of Execution");

        Scanner sc = new Scanner(System.in);

        System.out.println("-------- Welcome to Calculator Program - SPE ---------");
        System.out.println("");
        System.out.println("-------- Please Enter the Operation Code: ------------");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Factorial");
        System.out.println("4. Square_Root");
        System.out.println("5. Exit");

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
        else if(op == 3)
        {
            System.out.print("Please Enter integer whose factorial you want to calculate: ");

            int num1 = sc.nextInt();

            int result = Factorial(num1);

            if(result == -1)
                System.out.println("Please Enter valid non-negative Integer Input");
            else
                System.out.println("The Final Result is : " + result);
        }
        else if(op == 4)
        {
            System.out.print("Please Enter number whose Sqrt you want to calculate: ");

            double num1 = sc.nextDouble();

            double result = Square_Root(num1);

            if(result == -1)
                System.out.println("Please Enter valid Input >= 0");
            else
                System.out.println("The Final Result is : " + result);
        }
        else
        {
            System.out.println("Thanks for Using Calculator Program - BYE");
        }

        logger.info("Exiting Calculator Program");

        sc.close();

    }
}
