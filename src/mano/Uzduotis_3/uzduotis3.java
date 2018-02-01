package mano.Uzduotis_3;

import java.util.Scanner;

public class uzduotis3 {

    public uzduotis3() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int suma = 0;
        do {
            System.out.println("Iveskite skaiciu: ");
            a = sc.nextInt();
            suma = suma + a;
        } while (a != 0);

        System.out.println("Suma: " + suma);
    }
}
