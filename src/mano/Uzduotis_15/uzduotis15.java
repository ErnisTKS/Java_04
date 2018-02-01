package mano.Uzduotis_15;

import java.util.Scanner;

public class uzduotis15 {

    public uzduotis15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String zodis = sc.nextLine();
        try {
            Float.parseFloat(zodis);
            System.out.println(0);
        } catch (NumberFormatException yraZodis) {
            System.out.println("\"a\" raidziu yra: " + Raides(zodis));
        }
    }

    int Raides(String zodis) {

        int aRaides = 0;
        for (int i = 0; i < zodis.length(); i++) {
            if (zodis.charAt(i)=='a') {
                aRaides++;
            }
        }
        return aRaides;
    }

}
