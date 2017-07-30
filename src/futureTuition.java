import java.util.Scanner;

public class futureTuition {
    public static void main(String[] args) {
        /* Suppose that the tuition for a university is 10,000 this year and tuition increases 7% every year.
        In how many years will the tuition be doubled? Write a program that will calculate when tuition has doubled.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter current tuition amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter interest rate : ");
        double rate = input.nextDouble();
        double futureTuition;
        int year = 0;

        do {
            year++;
            futureTuition = amount * Math.pow(1 + rate, year);

        } while (futureTuition < amount * 2);
        System.out.println("Tuition of " + amount + " will double to " + futureTuition + " in " + year + " years.");


    }


}

