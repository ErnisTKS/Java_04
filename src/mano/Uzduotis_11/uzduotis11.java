package mano.Uzduotis_11;

import java.util.Scanner;

public class uzduotis11 {

    public static final int VEIKSMAS_SUMA = 1;
    public static final int VEIKSMAS_SANDAUGA = 2;

    public uzduotis11() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int sandauga = 1;
        boolean kartoti = true;
        int n;

        while (kartoti == true) {
            System.out.println("Iveskite koki norite skaiciu: ");
            n = sc.nextInt();
            if (n >= 1) {
                System.out.println("Pasirinkite veiksma: ");
                System.out.println("1 - suma: ");
                System.out.println("2 - sandauga: ");
                int veiksmas = sc.nextInt();
                switch (veiksmas) {
                    case VEIKSMAS_SUMA:
                        for (int i = 1; i <= n; i++) {
                            suma = suma + i;
                        }
                        System.out.println("Suma: " + suma);
                        break;

                    case VEIKSMAS_SANDAUGA:
                        for (int i = 1; i <= n; i++) {
                            sandauga =  sandauga * i;
                        }
                        System.out.println("Sandauga: " + sandauga);
                        break;
                }
                kartoti = false;
            } else {
                System.out.println("Iveskite skaiciu daugaiu nei 1: ");
            }
        }
    }

}