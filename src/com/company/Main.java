package com.company;

public class Main {

    public static void main(String[] args) {
        int num_1 = 4;
        int num_2 = 3;
        int num_3 = 5;
        int num_4 = 1;
        int num_5 = 4;

        if (num_1 == num_2 && num_1 == num_3 && num_1 == num_4 && num_1 == num_5)
        {
            System.out.println("Numbers are the same: " + num_1 + "," + num_2 + ","+ num_3 + ","+ num_4 + ","+ num_5 +"!");
        }

        else {
            if (num_1 <= num_2 && num_1 <= num_3 && num_1 <= num_4 && num_1 <= num_5) {
                System.out.println("Min first number: " + num_1);
            }
            if (num_2 <= num_1 && num_2 <= num_3 && num_2 <= num_4 && num_2 <= num_5) {
                System.out.println("Min second number: " + num_2);
            }
            if (num_3 <= num_1 && num_3 <= num_2 && num_3 <= num_4 && num_3 <= num_5) {
                System.out.println("Min third number: " + num_3);
            }
            if (num_4 <= num_1 && num_4 <= num_2 && num_4 <= num_3 && num_4 <= num_5) {
                System.out.println("Min fourth number: " + num_4);
            }
            if (num_5 <= num_1 && num_5 <= num_2 && num_5 <= num_3 && num_5 <= num_4) {
                System.out.println("Min fifth number: " + num_5);
            }
             /*---------------------------------------------------------------------*/
            if (num_1 >= num_2 && num_1 >= num_3 && num_1 >= num_4 && num_1 >= num_5) {
                System.out.println("Max first number: " + num_1);
            }
            if (num_2 >= num_1 && num_2 >= num_3 && num_2 >= num_4 && num_2 >= num_5) {
                System.out.println("Max second number: " + num_2);
            }
            if (num_3 >= num_1 && num_3 >= num_2 && num_3 >= num_4 && num_3 >= num_5) {
                System.out.println("Max third number: " + num_3);
            }
            if (num_4 >= num_1 && num_4 >= num_2 && num_4 >= num_3 && num_4 >= num_5) {
                System.out.println("Max fourth number: " + num_4);
            }
            if (num_5 >= num_1 && num_5 >= num_2 && num_5 >= num_3 && num_5 >= num_4) {
                System.out.println("Max fifth number: " + num_5);
            }
        }
    }
}
