package mano.Uzduotis_14;

import java.util.Scanner;

public class uzduotis14 {

    public static int n;

    public uzduotis14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite masyvo dydi: ");
        n = sc.nextInt();
        int[] mas = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Iveskite skaiciu: ");
            mas[i]=sc.nextInt();
        }
        Apsukti(mas);
    }

    void Apsukti(int[] mas){
        int[] mas2 = new int[n];
        for (int i=0; i<n; i++){
            mas2[i]=mas[(n-1)-i];
        }
        System.out.println("Apsukti skaiciai: ");
        for (int i=0; i<n; i++){
            System.out.print(mas2[i]+" ");
        }
        System.out.println(" ");
    }
}
