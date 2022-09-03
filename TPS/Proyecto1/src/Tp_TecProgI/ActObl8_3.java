package Tp_TecProgI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActObl8_3 {
    public static void main(String[] args)throws IOException {

     /*Actividad de Proceso 8:
        Seleccione y realice dos actividades como mínimo
        3. Escriba un programa Java que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente para pasar de grados centígrados a fahrenheit es: F = 32 + ( 9 * C / 5). */
        float centigrados, fahrenheit;
        String entrada;

        BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
        //punto 1
        System.out.print("Ingrese un valor en grados centigrados para ser pasado a grados fahrenheit: ");

        entrada=bufer.readLine();
        centigrados= Float.parseFloat(entrada);
        fahrenheit= 32+(9*centigrados/5);
        
        System.out.println("Los "+ centigrados+" °C a fahrenheit es: " + fahrenheit+"°F");
    }

}
