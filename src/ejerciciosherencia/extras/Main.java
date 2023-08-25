
package ejerciciosherencia.extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese que clase de barco le gustarìa; velero, Amotor, yate");
        String tipoBarco = leer.nextLine();
        if (tipoBarco.equals("velero")) {
            Velero miVelero = new Velero(123321, 30, "21/04/1998", 4);
            
            Alquiler miAlquiler = new Alquiler("Facundo", 44221607, sdf.parse("12-01-2022"), sdf.parse("20-01-2022"));
        }
    }
}
