package mano.Uzduotis_13;

import java.util.Scanner;

public class uzduotis13 {

    public static int n;

    public uzduotis13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite masyvo dydi: ");
        n = sc.nextInt();
        int[] mas = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Iveskite skaiciu: ");
            mas[i]=sc.nextInt();
        }
        System.out.println("Maziausias masyve skaicius yra: " + MaziausiasSkaicius(mas));
    }

    int MaziausiasSkaicius(int[] mas){
        int maz=mas[0];
        for (int i=0; i<n; i++){
            if (maz>mas[i]){
                maz=mas[i];
            }
        }
        return maz;
    }
}
