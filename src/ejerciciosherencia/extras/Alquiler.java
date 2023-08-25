package ejerciciosherencia.extras;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    public String nombreCliente;
    public int docCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    public int posicionBarco;
    public Barco barco;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(int docCliente) {
        this.docCliente = docCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate setFechaAlquiler(LocalDate fechaAlquiler) {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public LocalDate setFechaDevolucion(LocalDate fechaDevolucion) {
        return fechaDevolucion;
    }

    public int getPosicionBarco() {
        return posicionBarco;
    }

    public void setPosicionBarco(int posicionBarco) {
        this.posicionBarco = posicionBarco;
    }

    public Alquiler(String nombreCliente, int docCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionBarco, String barco) {
        this.nombreCliente = nombreCliente;
        this.docCliente = docCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionBarco = posicionBarco;
    }
    
    public void calcularAlquier(LocalDate fechaAlquiler, LocalDate fechaDevolucion, Barco barco) {
        long diferenciaDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        long valorModulo = 10 * barco.getEslora();
        
        if (barco instanceof Velero) {
            Velero miVelero = (Velero) barco; // creo una instancia de mi barco
            valorModulo = valorModulo + miVelero.getNroMastiles();
        } else if (barco instanceof BarcoMotor) {
            BarcoMotor miBarcoaMotor = (BarcoMotor) barco;
            valorModulo = valorModulo + miBarcoaMotor.getCVmotor();
        } else {
            Yate miYate = (Yate) barco;
            valorModulo = valorModulo + miYate.getCVmotor() + miYate.getNroCamarotes();
        }
        long total = valorModulo * diferenciaDias;
        System.out.println("total a pagar >> $" + total);
    }
    
}
