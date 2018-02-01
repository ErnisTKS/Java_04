package mano.Uzduotis_4;

import java.util.Scanner;

public class uzduotis4 {

    public uzduotis4() {
        Scanner sc = new Scanner(System.in);
        int a=1;
        int suma = 0;
        while (a != 0){
            System.out.println("Iveskite skaiciu: ");
            try {
                a = sc.nextInt();
                suma += a;
            } catch (Exception klaida) {
                System.out.println("Iveskite SKAICIU: ");
                sc.next();
            }

        }
        System.out.println("Suma: " + suma);
    }
}
