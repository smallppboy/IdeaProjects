package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2; // 1 + 2 = 3
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);

        result = result - 1 ;   // 3 - 1 = 2
        System.out.println("Previous result = " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;   // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;   // remainder 4 % 3  = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result++;   // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        //result = result - 1
        result--;   // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result - 1
        result+=2;   // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result*=10;   // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result / 3
        result -= 2;
        System.out.println("30 - 2 = " + result);


    }
}
