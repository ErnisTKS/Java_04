package mano.Uzduotis_30;

import java.util.Scanner;

public class uzduotis30 {

    public uzduotis30() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite masyvo dydi: ");
        int a = sc.nextInt();
        int[] mas = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Iveskite " + (i+1) + " vietoje esanti skaiciu: ");
            mas[i] = sc.nextInt();
        }
        Rikiavimas(mas);
    }

    void Rikiavimas(int[] mas) {
        int keitimas;

        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    keitimas = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = keitimas;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas[i]);
        }
        System.out.println();
    }
}