package mano.Uzduotis_2;

import java.util.Scanner;

public class uzduotis2 {

    public uzduotis2() {

        Scanner sc = new Scanner(System.in);
        String zodis;
        do {
            System.out.println("Iveskite zodi");
            zodis = sc.nextLine();
            System.out.println("Ivestas zodis: " + zodis);
        } while (zodis != "Pabaiga");

        }
    }