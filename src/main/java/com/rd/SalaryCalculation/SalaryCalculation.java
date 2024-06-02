package com.rd.SalaryCalculation;

public class SalaryCalculation {

    String personnel;
   public int workedDay;
    public double dailysalary;
    public double monthlySalary;
    public double totalSalary;
    public int extraPremium;




    public void SalaryCalculation(double workedDay){

         monthlySalary = dailysalary * workedDay;
        totalSalary = (workedDay > 25) ? (monthlySalary + (workedDay - 25) * extraPremium)  :
                monthlySalary;

     }

}
