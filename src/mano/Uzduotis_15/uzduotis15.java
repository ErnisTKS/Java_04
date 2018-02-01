package mano.Uzduotis_15;

import java.util.Scanner;
import java.util.Arrays;

public class uzduotis15 {

    public uzduotis15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String zodis = sc.nextLine();
        System.out.println("\"a\" raidziu yra: " + Raides(zodis));
    }

    int Raides(String zodis) {
        char[] raides = zodis.toCharArray();
        int aRaides = 0;
        for (int i = 0; i < zodis.length(); i++) {
            if (raides[i] == 'a') {
                aRaides++;
            }
        }
        return aRaides;
    }

}
