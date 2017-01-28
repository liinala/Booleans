package Main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Liina on 24/01/2017.
 */
public class RaskePommitamine {
    public static void main(String[] args) {

        System.out.println("Alusta Pommitamist");
        System.out.println("Autor Liina");
        System.out.println("Aasta 2017 ");

        int[][] laud = new int[9][9];

        //0 - meri
        //1 - laev
        //2 - pihta saanud laev

        int count1 = 0;//kuna 2 tsüklit peab 2 korda defineerima ka.
        int count2 = 0;
        while (count1 < 9) {
            count2 = 0; //count2 tuleb nullida, sest muidu kui järgmine kord alustab on count2 ikka 9
            while (count2 < 9) {
                laud[count1][count2] = (int) (Math.random() * 1.5); //1.3 näitab, et pooltel kordadel 0-d
                // ja pooltel kordadel 1-d. Mida 2-st väiksem nr seda vähem 1-sid
                //3//saan ühe individuaalse punkti laual kätte
                count2++;//nr tõuseb ühe võrra kui tsüklis on ära käidud
            }
            count1++;
        }


        int count3 = 0;
        while (count3 < 9) {

            System.out.println(Arrays.toString(laud[count3]));//et prindiks rida rea haaval, mitte tervet lauda korraga.
            count3++;
        }

        Scanner sc = new Scanner(System.in);//muutuja tüüp on scanner, sest teen uues scanneri.
        // Suunab andmed mis tulevad System.in-st otse scanner objekti.
        while (true) {
            System.out.println("Kuhu tahad pommitada? Formaat x-y");
            String input = sc.nextLine(); //eraldab kaks numbrit üksteisest
            String[] xy = input.split("-");
            int x = Integer.parseInt(xy[0])-1;//nullid saavad üheks. 8-->9 ehk Kasutaja saab 1-st alustada
            int y = Integer.parseInt(xy[1])-1;

            int tabamus = laud[y][x];

            if (tabamus == 1) {
                laud[y][x] = 2;
                System.out.println("Pihtas!");
            } else if (tabamus == 0) {//ehk meri
                System.out.println("Mööda");
            } else if (tabamus == 2) {
                System.out.println("Siia sa juba lasid");
            } else {
                System.out.println("ERROR: kuidas sa üldse siia sai?");
                break;
            }



        }
        System.out.println("Mäng on läbi");

        //System.out.println(tabamus);


        //System.out.println(x);
        //System.out.println(y);

        //laua generereerimiseks loon 2 tsüklit, mis on üksteise sees

        //int [] a = {4, 65, 2, 1}; maatriks

        //int[][] b= {{1, 2, 4}, {1, 3, 5}, {7, 2, 3}}; massiiv - võib panna üksteise alla
    }
}






