
package ejerciciosherencia;

import java.util.Scanner;

public class Animal {
    protected String nombre;
    protected String alimentacion;
    protected int anios;
    protected String raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Animal(String nombre, String alimentacion, int anios, String raza) {
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.anios = anios;
        this.raza = raza;
    }
    
    protected void alimentarse() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la clase de alimento que come el animal...");
        String comida = leer.nextLine();
        System.out.println("El animal come >> " + comida);
    }
}
