package mano.Uzduotis_17;

import java.util.Scanner;

public class uzduotis17 {

    public uzduotis17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String a = sc.nextLine();
        String zodis = a.replaceAll("\\s","");
        int ats = arPol(zodis);
        if (ats == 1) {
            System.out.println("zodis yra polindromas");
        } else {
            System.out.println("zodis nera polindromas");
        }
    }

    int arPol(String zodis) {
        String zodisAtbulai = new StringBuffer(zodis).reverse().toString();

        if (zodis == zodisAtbulai) {
            return 1;
        } else return 0;
    }
}
