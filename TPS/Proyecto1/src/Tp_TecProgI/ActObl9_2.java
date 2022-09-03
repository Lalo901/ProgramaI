package Tp_TecProgI;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ActObl9_2 {

    public static void main(String[] args) throws IOException{
        /* Actividad de Proceso 9:
          2. Escriba un programa Java que permita leer la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.*/
        
        Double a, b, hipotenusa;
        String entrada;
        

        BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
        //punto 1
        System.out.println("Ingrese los datos de los catetos, del triangulo rectangulo.");
        
        System.out.print("Ingrese valor del primer cateto: ");
        entrada=bufer.readLine();
        a= Double.parseDouble(entrada);

        System.out.print("Ingrese valor del segundo cateto: ");
        entrada=bufer.readLine();
        b= Double.parseDouble(entrada);

        hipotenusa=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("El valor de la hipotenusa es: "+hipotenusa);



    }

        
    
}
