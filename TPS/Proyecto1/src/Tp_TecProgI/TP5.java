package Tp_TecProgI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Escribir un programa que permita ingresar Mi nombre, apellido y DNI.
public class TP5 {
    public static void main(String[] args) throws IOException {

        BufferedReader en= new BufferedReader(new InputStreamReader(System.in));
        String cd;
        String nombre;
        String apellido;
        int dni;

        System.out.print("Ingrese su nombre ");
        nombre=en.readLine();

        System.out.print("Ingrese su Apellido ");
        apellido=en.readLine();
        
        System.out.print("Ingrese su DNI ");
        cd=en.readLine();
        
        dni= Integer.parseInt(cd);

        imprime( nombre, apellido,dni);
       // System.out.println("Mi DNI es: " + dni);
       imprime( "nombre", "apellido",157845);
    }

    public static void imprime(String n, String a, int d ) {
        System.out.println("\nMi nombre es: " + n + "\nMi apellido es: " + a+ "\nmi dni es : " + d);
              
    }
    
}
