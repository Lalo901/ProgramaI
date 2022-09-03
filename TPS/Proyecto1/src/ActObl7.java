import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Actividad 7:

Seleccione y realice dos actividades como mínimo

   1. Escriba un programa en java que permita leer dos números enteros por teclado y los muestre por pantalla.
   2. Desarrolle un programa en Java que permita ingresar desde el teclado las iniciales correspondientes a un nombre y un apellido.
   3. Escribe un programa en java lea un nombre por teclado y muestre por pantalla: “Buenos dias nombre_introducido”
 */
public class ActObl7 {
    public static void main(String[] args) throws IOException{
        int num1, num2;
        String entrada, nombre;


        BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
        //punto 1
        System.out.println("Ingrese dos numeros enteros a ser mostrado por pantalla. ");

        System.out.print("Ingrese el primer numero entero: ");
        entrada=bufer.readLine();
        num1= Integer.parseInt(entrada);

        System.out.print("Ingrese el segundo numero entero: ");
        entrada=bufer.readLine();
        num2= Integer.parseInt(entrada);

        System.out.println("Los numeros ingresados son: "+ num1+" y "+num2+"\n");

        //punto3

        System.out.print("Ingrese sus nombres: ");
        nombre=bufer.readLine();

        System.out.println("Buenos dias " + nombre);
        
    }
    
}
