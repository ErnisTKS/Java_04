package mano.Uzduotis_5;

import java.util.Scanner;

public class uzduotis5 {

    public uzduotis5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius:");
        int[] mas = new int[5];
        int suma=0;
        for (int i=0; i<5; i++){
            mas[i]=sc.nextInt();
            suma+=mas[i];
        }

        System.out.println("Suma:" + suma);
        System.out.println("Ivesti skaiciai:");
        for (int i=0; i<5; i++){
            if (i==4)
            {
                System.out.println(mas[i]+".");
            }else{
                System.out.print(mas[i]+", ");
            }
        }
    }
}

