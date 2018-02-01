package mano.Uzduotis_7;

import java.util.Scanner;

public class uzduotis7 {

    public uzduotis7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite kiek norite irasyti skaiciu: ");
        int Skaiciai = sc.nextInt();
        int[] mas = new int[Skaiciai];
        for (int i=0; i<mas.length; i++){
            System.out.println("Iveskite " + (i+1) + "-aji skaiciu: ");
            mas[i]=sc.nextInt();
        }
        System.out.println("Didesni nei 100 skaiciai yra: ");
        for (int i=0; i<mas.length; i++){
            if (mas[i]>100){
                System.out.println((i+1) + "-asis skaicius: "+mas[i]);
            }
        }
    }
}
