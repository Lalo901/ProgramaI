package Tp_TecProgI;
import java.io.*;


public class Letras {
    public static void main(String[] args)throws IOException {
        
        char primero, ultimo;
        System.out.println("Introduzca su primera y ultima inicial: ");
        System.out.flush();
        primero=(char) System.in.read();
        ultimo=(char) System.in.read();
        System.out.println("Hola, "+primero+""+ultimo+".!\n ");

    }
    
}
