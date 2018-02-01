package mano.Uzduotis_16;

import java.util.Scanner;

public class uzduotis16 {

    public uzduotis16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String zodis = sc.nextLine();
        try {
            Float.parseFloat(zodis);
            System.out.println(0);
        } catch (NumberFormatException yraZodis) {
            System.out.println("\"ab\" raidziu yra: " + Raides(zodis));
        }
    }

    int Raides(String zodis) {
        char[] raides = zodis.toCharArray();
        int abRaides = 0;
        for (int i = 0; i < zodis.length(); i++) {
            if (raides[i] == 'a') {
                try {
                    if (raides[i + 1] == 'b') {
                        abRaides++;
                    }
                }catch (Exception klaida){
                    return abRaides;
                }
            }
        }
        return abRaides;
    }

}
