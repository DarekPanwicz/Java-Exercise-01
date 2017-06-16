package se.webbfox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
//        najmniejszą z nich.



        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int i=0; i<3; i++) {




            System.out.println("Wpisz liczbe ");
            Scanner scr = new Scanner(System.in);

            int liczba = scr.nextInt();

            if (liczba > max) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
        }



            System.out.println("Najwieksza to: "+max);
            System.out.println("Najmniejsza to:"+min);



        }










    }

