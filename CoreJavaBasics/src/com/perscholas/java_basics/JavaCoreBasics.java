package com.perscholas.java_basics;
import java.text.DecimalFormat;

public class JavaCoreBasics {
    public static void main(String[] args) {

        //Adding two integers and printing there sum
        int num1 = 5;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println("Integer addition: " + sum);

        //Adding two decimals and printing there decimals
        double decNum1 = 6.39;
        double decNum2 = 8.37;
        double decSum = decNum1 + decNum2;
        System.out.println("Decimal addition: "+ decSum);

        //Adding one integer and one decimal number and printing there sum
        int x1 = 3;
        double y1 = 4.68;
        double z1 = x1 + y1;
        System.out.println("Integer addition: " + z1);

        //Regular integer division
        int smallNum = 50;
        int bigNum = 100;
        int division = bigNum / smallNum;
        System.out.println("Integer Division: " + division);

        //The necessary changes to calculate the division with the larger number being a decimal number
        double decBigNum = 100.4248;
        double decDivision1 = smallNum / decBigNum;
        System.out.println("Decimal Division one: " + decDivision1);

        double decSmallNum = 34.857623;
        double decLargeNum = 74.467349;
        double decDivision2 = decLargeNum / decSmallNum;
        System.out.println("Decimal Division two: " + decDivision2);

        //Casting will cause the number to lose all its decimal values
        decDivision2 = (int)decDivision2;
        System.out.println(decDivision2);

        int x = 5;
        int y = 6;
        int q = y/x;
        System.out.println("Integer division: " + q);

        //Casting y into a double
        double qDec = (double)y/x;
        System.out.println("Casting example: " + qDec);

        // Declare final integer constant
        final int NUMBER = 43;
        System.out.println("Random Constant calculation: " + (NUMBER + num1)/division);

        //Cafe order simulation
        double coffeePrice = 5.99;
        double cappuccino = 8.99;
        double espressoPrice = 10.99;

        double subTotal = 3*coffeePrice + 4*cappuccino + 2*espressoPrice;
        final double SALES_TAX = 1.0775;
        double totalSale = (subTotal*SALES_TAX);
        DecimalFormat fmt = new DecimalFormat("#.##");
        System.out.println("Total cost of you drinks " + fmt.format(totalSale));
    }
}
