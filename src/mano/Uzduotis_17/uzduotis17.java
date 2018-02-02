package mano.Uzduotis_17;

import java.util.Scanner;

public class uzduotis17 {

    public uzduotis17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi: ");
        String a = sc.nextLine();
        String zodis = a.replaceAll("\\s", "");
        int ats = arPol(zodis);
        if (ats == 1) {
            System.out.println("zodis yra polindromas");
        } else {
            System.out.println("zodis nera polindromas");
        }
    }

    int arPol(String zodis) {
        String zodisAtbulai = new StringBuffer(zodis).reverse().toString();
        System.out.println("====================" + zodis);
        System.out.println("++++++++++++++++++++" + zodisAtbulai);
   /*     if (zodis == zodisAtbulai) {
            return 1;
        } else if (zodis != zodisAtbulai) {
            return 0;
        }
*/
        char[] raides = zodis.toCharArray();
        char[] raides2 = zodisAtbulai.toCharArray();
        int sutampa = 0;
        for (int i = 0; i < zodis.length()-1; i++) {
            if (raides[i] == raides2[i]) {
                sutampa++;
            }
        }
        if (sutampa==zodis.length()){
            return 1;
        } else return 0;
    }
}
