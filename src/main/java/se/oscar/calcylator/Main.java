package se.oscar.calcylator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Välkommen till kalkylatorn");
        System.out.println("**************************");

        boolean run = true;
        while (run) {
            System.out.print("Första tal: ");
            int temp1 = scan.nextInt();
            System.out.print("Andra tal: ");
            int temp2 = scan.nextInt();

            System.out.println("Vilken operator vill du använda?");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");
            switch (scan.nextInt()) {
                case 1:
                    System.out.println(calc.calculatorAdd(temp1, temp2));
                    break;
                case 2:
                    System.out.println(calc.calculatorSubtract(temp1, temp2));
                    break;
                case 3:
                    System.out.println(calc.calculatorMultiply(temp1, temp2));
                    break;
                case 4:
                    System.out.println(calc.calculatorDivide(temp1, temp2));
                    break;
                case 5:
                    System.out.println("Tack för användningen!");
                    run = false;
                default:
                    break;
            }
        }
    }
}
