package mano.Uzduotis_6;

import java.util.Scanner;

public class uzduotis6 {

    public uzduotis6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 zodzius:");
        String[] mas = new String[5];
        for (int i=0; i<5; i++){
            mas[i]=sc.nextLine();
        }

        System.out.println("Ivesti zodziai:");
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

