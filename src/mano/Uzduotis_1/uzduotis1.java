package mano.Uzduotis_1;

import java.util.Scanner;

public class uzduotis1 {

    public uzduotis1() {

        System.out.println("Iveskite sveika skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Ivestas skaicius: " + a);
        if (a % 2 == 0) {
            System.out.println("Skaicius yra lyginis");
        } else {
            System.out.println("Skaicius yra nelyginis");
        }
    }
}