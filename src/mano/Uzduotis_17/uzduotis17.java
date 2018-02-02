package mano.Uzduotis_17;

import java.util.Scanner;

public class uzduotis17 {

    public uzduotis17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String zodis = sc.nextLine();
        char[] raides = zodis.toCharArray();
        if (arPol(raides) == true) {
            System.out.println("Sis zodis yra polindromas");
        } else System.out.println("Sis zodis nera polindromas");
    }

    public static boolean arPol(char[] zodis) {
        boolean palindromas = false;
        if (zodis.length % 2 == 0) {
            for (int i = 0; i < zodis.length / 2 - 1; i++) {
                if (zodis[i] != zodis[zodis.length - i - 1]) {
                    return false;
                } else {
                    palindromas = true;
                }
            }
        } else {
            for (int i = 0; i < (zodis.length - 1) / 2 - 1; i++) {
                if (zodis[i] != zodis[zodis.length - i - 1]) {
                    return false;
                } else {
                    palindromas = true;
                }
            }
        }
        return palindromas;
    }
}
