package mano.Uzduotis_9;

import java.util.Scanner;

public class uzduotis9 {
    public static final int ACTION_SUM = 1;
    public static final int ACTION_SUBTRACT = 2;
    public static final int ACTION_DAUG = 3;
    public static final int ACTION_END = 5;


    public uzduotis9() {
        int a;
        int b;
        int kart;
        int veiksmas;
        boolean kartoti=true;
        Scanner sc = new Scanner(System.in);
        while (kartoti==true){
            System.out.println("Iveskite 2 skaicius: ");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Iveskite veiksmo skaiciu");
            System.out.println("1 – suma");
            System.out.println("2 – skirtumas");
            System.out.println("3 – sandauga");
            veiksmas = sc.nextInt();
            switch (veiksmas)
            {
                case ACTION_SUM:
                    System.out.println("Suma: " + (a+b));
                    break;
                case ACTION_SUBTRACT:
                    System.out.println("Skirtumas: " + (a-b));
                    break;
                case ACTION_DAUG:
                    System.out.println("Sandauga: " + (a*b));
                    break;
            }
            System.out.print("Jei nori kartoti, iveskite skaiciu 5, jei ne, iveskite betkoki mygtuka: ");
            kart = sc.nextInt();
            if(kart==ACTION_END){
                kartoti=true;
            } else {kartoti=false;}
        }
    }
}
