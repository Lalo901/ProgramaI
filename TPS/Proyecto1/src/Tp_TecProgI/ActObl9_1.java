package Tp_TecProgI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ActObl9_1 {
    public static void main(String[] args) throws IOException {
        /*Actividad de Proceso 9:
        1. Escriba un programa Java que lea por teclado el valor del radio de una circunferencia, calcule y muestra por pantalla la longitud y el área de la circunferencia.
         Longitud de la circunferencia = 2*PI*Radio,
         Área de la circunferencia = PI*Radio^2.
         Utilice dos métodos distintos para los cálculos
         */

        float radio;
        String entrada;

        BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
        //punto 1
        System.out.print("Ingrese el valor del radio de la circunferencia: ");

        entrada=bufer.readLine();
        radio= Float.parseFloat(entrada);

        longuitudCircunferencia(radio);
        areaCircunferencia(radio);
   
    }

    public static void longuitudCircunferencia (float r){
        double longcirc;
        
        longcirc= 2*Math.PI*r;
        System.out.println("La longuitud de la circunsferencia es: "+ longcirc);

    }

    public static void areaCircunferencia (float r){
        
        double area= Math.PI*r*r;
        System.out.println("El area de la circunsferencia es: "+ area);

    }


    
}
