package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean continuar;
        do{
            try{
                continuar=false;
                System.out.println("Ingrese un valor entero: ");
                num = sc.nextInt();
                int cuadrado= num*num;
                System.out.println("El resultado de "+num+" es: "+cuadrado);
            } catch(InputMismatchException ex){
                System.out.println("Debe ingresar obligatoriamente un numero entero.");
                sc.next();
                continuar=true;
            }
        } while (continuar);

    }
}