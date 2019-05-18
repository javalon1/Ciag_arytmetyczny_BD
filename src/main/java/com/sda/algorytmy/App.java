package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner t = new Scanner(System.in);
        System.out.println("Podaj wyraz poczatkowy ciagu arytmetycznego");
        int a = t.nextInt();
        System.out.println("Podaj przyrost arytmetyczny");
        int r = t.nextInt();
        System.out.println("Podaj, ktory wyraz ciagu chcesz obliczyc");
        int n = t.nextInt();


        int suma =0;
        for(int i = 0; i<=n; i++)
        {
            suma = a+(i-1)*r;
        }
        System.out.println("Wyraz "+n+" ciagu arytmetycznego wynosi: "+suma);
    }
}
