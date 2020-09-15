package main;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        //Instancia de la clase Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la edad de la persona: ");
        byte edad = teclado.nextByte();

        if(edad >= 18){ //Si se cumple la condición
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }

    }
}