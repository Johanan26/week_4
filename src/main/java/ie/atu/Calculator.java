package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    add();

    }
    public static void add() {
        System.out.println("Please Enter Your First Number:");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please Your Second Number:");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total " + total);
    }
}
