package mano.Uzduotis_10;

import java.util.Scanner;

public class uzduotis10 {

    public uzduotis10() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        boolean kartoti = true;
        int n;
        while (kartoti == true) {
            System.out.println("Iveskite koki norite skaiciu: ");
            n = sc.nextInt();
            if (n >= 1) {
                int[] mas = new int[n];
                for (int i = 1; i <= n; i++) {
                    suma = suma + i;
                }
                kartoti = false;
            } else {
                System.out.println("Iveskite skaiciu daugaiu nei 1: ");
            }
        }

        System.out.println("Suma: " + suma);

    }
}
