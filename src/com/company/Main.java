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
                System.out.println("Min number: " + num_1);
            }
            else if (num_2 <= num_1 && num_2 <= num_3 && num_2 <= num_4 && num_2 <= num_5) {
                System.out.println("Min number: " + num_2);
            }
            else if (num_3 <= num_1 && num_3 <= num_2 && num_3 <= num_4 && num_3 <= num_5) {
                System.out.println("Min number: " + num_3);
            }
            else if (num_4 <= num_1 && num_4 <= num_2 && num_4 <= num_3 && num_4 <= num_5) {
                System.out.println("Min number: " + num_4);
            }
            else if (num_5 <= num_1 && num_5 <= num_2 && num_5 <= num_3 && num_5 <= num_4) {
                System.out.println("Min number: " + num_5);
            }
             /*---------------------------------------------------------------------*/
            if (num_1 >= num_2 && num_1 >= num_3 && num_1 >= num_4 && num_1 >= num_5) {
                System.out.println("Max number: " + num_1);
            }
            else if (num_2 >= num_1 && num_2 >= num_3 && num_2 >= num_4 && num_2 >= num_5) {
                System.out.println("Max number: " + num_2);
            }
            else if (num_3 >= num_1 && num_3 >= num_2 && num_3 >= num_4 && num_3 >= num_5) {
                System.out.println("Max number: " + num_3);
            }
            else if (num_4 >= num_1 && num_4 >= num_2 && num_4 >= num_3 && num_4 >= num_5) {
                System.out.println("Max number: " + num_4);
            }
            else if (num_5 >= num_1 && num_5 >= num_2 && num_5 >= num_3 && num_5 >= num_4) {
                System.out.println("Max number: " + num_5);
            }
        }
    }
}
