package com.rd.SalaryCalculation;

import java.util.Scanner;

public class SalaryCalculationTest {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SalaryCalculation SalaryCalculation = new SalaryCalculation();


        SalaryCalculation.personnel = "Sena Efe";
        SalaryCalculation.extraPremium = 1000;
        SalaryCalculation.dailysalary = 525.60;


        System.out.println("Let's calculate the monthly salary of the employee named "  +
                SalaryCalculation.personnel + " for the number of days she worked in this month.");

        System.out.println("---------------");
        System.out.println("Enter the number of days worked: ");
        int workedDay  = scanner.nextInt();
        SalaryCalculation.SalaryCalculation(workedDay);
        System.out.println("The number of days worked is "+ workedDay);
        System.out.println("---------------");
        System.out.println(" The total monthly salary of the employee named "+ SalaryCalculation.personnel  +" is "+ SalaryCalculation.totalSalary + "€");
    }
}
