package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int geussNumber = (int)(1+Math.random()*10);

        Scanner scan = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Välj en nummer mellan 1-10: ");
            inputNumber = scan.nextInt();

            if (inputNumber < geussNumber){
                System.out.println("Ditt nummer är för högt, försök igen");
            }
            else if(inputNumber > geussNumber){
                System.out.println("Ditt nummer är för lågt, försök igen");
            }
        }while (inputNumber != geussNumber);
        System.out.println(geussNumber + " är rätt gissat. Du har vunnit");
    }
}
