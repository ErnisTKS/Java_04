package mano.Uzduotis_12;

import java.util.Scanner;

public class uzduotis12 {

    public static int n;

    public uzduotis12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite masyvo dydi: ");
        n = sc.nextInt();
        int[] mas = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Iveskite skaiciu: ");
            mas[i]=sc.nextInt();
        }
        System.out.println("Didziausias masyve skaicius yra: " + DidziausiasSkaicius(mas));
    }

    int DidziausiasSkaicius(int[] mas){
        int did=mas[0];
        for (int i=0; i<n; i++){
            if (did<mas[i]){
                did=mas[i];
            }
        }
        return did;
    }
}
