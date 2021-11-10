package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scannerName = new Scanner(System.in);
        System.out.println("Ввиде ваше имя");

        String mynameTair = scannerName.nextLine();
        System.out.println("Привет " + mynameTair);

        System.out.println("До свидания " + mynameTair);
    }

}
