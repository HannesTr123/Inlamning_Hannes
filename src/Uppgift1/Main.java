package Uppgift1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv och prata med dig själv! När du är klar skriv då `Stop´");


        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("stop")){
                break;
            }

            counter.Lines(input);
        }

        counter.summary();
    }
}