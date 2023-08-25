package ejerciciosherencia;
public class Televisor extends Electrodomestico {
    public float resolucion;
    public boolean sintonizador;

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    
    public Televisor(float precio, String color, char consumoEnergetico, float peso, float resolucion, boolean sintonizador) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.sintonizador) {
            this.setPrecio(this.getPrecio() + 500);
        }
        if (this.resolucion >= 40) {
            this.setPrecio(this.getPrecio() * 1.3f);
        }
    }
    
}
