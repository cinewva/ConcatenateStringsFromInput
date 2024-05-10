package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //mno problema 2
        //Initializez obiectul prin care am capabilitatea sa citesc de la tastatura
        Scanner scanner = new Scanner(System.in);

        //Afisesz un mesaj pentru cererea textului de la tastatura
        //Se va introduce textul cerut dupa care se apasa tasta Enter
        //Linia de cod care va citi propriuzis textul de la tastatura
        //Definesc variable de tip String(sir de caractere) unde se va afisa textul introdus
        System.out.print("Introduceti numele dumneavoastra: ");
        String numelePersoanei = scanner.nextLine();

        //preluam prenumele aici si afisez mesajul ca sa stiu ce sa scriu
        System.out.print("Introduceti prenumele dumneavoastra: ");
        String prenumelePersoanei = scanner.nextLine();




        //Afisez numele si prenumele persoanei introdus de la tastatura
        System.out.println("Numele introdus este: " + numelePersoanei + " " + prenumelePersoanei);


    }
}
