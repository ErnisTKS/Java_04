package com.company;

import mano.Uzduotis_1.uzduotis1;
import mano.Uzduotis_2.uzduotis2;
import mano.Uzduotis_3.uzduotis3;
import mano.Uzduotis_4.uzduotis4;
import mano.Uzduotis_5.uzduotis5;
import mano.Uzduotis_6.uzduotis6;
import mano.Uzduotis_7.uzduotis7;
import mano.Uzduotis_8.uzduotis8;
import mano.Uzduotis_9.uzduotis9;
import mano.Uzduotis_10.uzduotis10;
import mano.Uzduotis_11.uzduotis11;
import mano.Uzduotis_12.uzduotis12;
import mano.Uzduotis_13.uzduotis13;
import mano.Uzduotis_14.uzduotis14;
import mano.Uzduotis_15.uzduotis15;
import mano.Uzduotis_16.uzduotis16;
import mano.Uzduotis_17.uzduotis17;
import mano.Uzduotis_30.uzduotis30;
import mano.Uzduotis_31.uzduotis31;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static final int ACTION_1 = 1;
    public static final int ACTION_2 = 2;
    public static final int ACTION_3 = 3;
    public static final int ACTION_4 = 4;
    public static final int ACTION_5 = 5;
    public static final int ACTION_6 = 6;
    public static final int ACTION_7 = 7;
    public static final int ACTION_8 = 8;
    public static final int ACTION_9 = 9;
    public static final int ACTION_10 = 10;
    public static final int ACTION_11 = 11;
    public static final int ACTION_12 = 12;
    public static final int ACTION_13 = 13;
    public static final int ACTION_14 = 14;
    public static final int ACTION_15 = 15;
    public static final int ACTION_16 = 16;
    public static final int ACTION_17 = 17;
    public static final int ACTION_30 = 30;
    public static final int ACTION_31 = 31;
    public static final int ACTION_END = 0;


    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.vykdytiProgramaBeGalo();
    }


    public void Pasirinkimai() {
        System.out.println("================================================");
        System.out.println("Iveskite uzduoties numeri: ");
        System.out.println(ACTION_1 + " – Ar skaicius lyginis ar nelyginis ");
        System.out.println(ACTION_2 + " – Vesti zodi, iki kol bus ivesta Pabaiga ");
        System.out.println(ACTION_3 + " – Vesti skaicius ir juos sumuot ");
        System.out.println(ACTION_4 + " – Ivesti tik skaiciu ");
        System.out.println(ACTION_5 + " – 5 skaiciu masyvas ");
        System.out.println(ACTION_6 + " – 5 zodziu masyvas ");
        System.out.println(ACTION_7 + " – Skaiciai didesni uz 100 ");
        System.out.println(ACTION_8 + " – Skaiciai didesni uz 100, metoduose ");
        System.out.println(ACTION_9 + " – Supaprastinta skaiciuokle ");
        System.out.println(ACTION_10 + " – Is eiles einanciu skaiciu suma ");
        System.out.println(ACTION_11 + " – Is eiles einanciu skaiciu suma arba sandauga ");
        System.out.println(ACTION_12 + " – Isrinkti didziausia masyve esanti skaiciu ");
        System.out.println(ACTION_13 + " – Isrinkti maziausia masyve esanti skaiciu ");
        System.out.println(ACTION_14 + " – Apsukti ivesta masyva ");
        System.out.println(ACTION_15 + " – Is zodzio isskirti \"a\" raides ");
        System.out.println(ACTION_16 + " – Is zodzio isskirti \"ab\" radziu kombinacijas ");
        System.out.println(ACTION_17 + " – Tikrinti ar zodis yra polindromas");
        System.out.println(ACTION_30 + " – Masyvo rikiavimas didejimo tvarka");
        System.out.println(ACTION_31 + " – Masyvo rikiavimas mazejimo tvarka");
        System.out.println("Jei norite nutraukti programa, spauskite: " + ACTION_END);
        System.out.println("================================================");
    }

    public void vykdytiProgramaBeGalo() {
        boolean kartoti = true;
        Scanner sc = new Scanner(System.in);
        while (kartoti == true) {
            Pasirinkimai();
            int veiksmas = sc.nextInt();
            switch (veiksmas) {
                case ACTION_END:
                    kartoti = false;
                    break;
                case ACTION_1:
                    new uzduotis1();
                    break;
                case ACTION_2:
                    new uzduotis2();
                    break;
                case ACTION_3:
                    new uzduotis3();
                    break;
                case ACTION_4:
                    new uzduotis4();
                    break;
                case ACTION_5:
                    new uzduotis5();
                    break;
                case ACTION_6:
                    new uzduotis6();
                    break;
                case ACTION_7:
                    new uzduotis7();
                    break;
                case ACTION_8:
                    new uzduotis8();
                    break;
                case ACTION_9:
                    new uzduotis9();
                    break;
                case ACTION_10:
                    new uzduotis10();
                    break;
                case ACTION_11:
                    new uzduotis11();
                    break;
                case ACTION_12:
                    new uzduotis12();
                    break;
                case ACTION_13:
                    new uzduotis13();
                    break;
                case ACTION_14:
                    new uzduotis14();
                    break;
                case ACTION_15:
                    new uzduotis15();
                    break;
                case ACTION_16:
                    new uzduotis16();
                    break;
                case ACTION_17:
                    new uzduotis17();
                    break;
                case ACTION_30:
                    new uzduotis30();
                    break;
                case ACTION_31:
                    new uzduotis31();
                    break;
            }
        }
    }
}