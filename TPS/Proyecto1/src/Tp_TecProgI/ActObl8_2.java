package Tp_TecProgI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActObl8_2 {
    
    public static void main(String[] args) throws IOException{
        /*Actividad de Proceso 8:
        Seleccione y realice dos actividades como mínimo
       
        2. Escriba un programa Java que lea un número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.
        */
        //punto 2
        int x;
        String entrada;

        BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
        //punto 1
        System.out.print("Ingrese un numero entero para calcular su doble y su triple: ");
        entrada=bufer.readLine();
        x= Integer.parseInt(entrada);

        System.out.println("El numero ingresado es: " + x);
        System.out.println("El doble de "+ x +" es: "+ (x*2));
        System.out.println("El triple de "+ x +" es: "+ (x*3));


    }
    
}
