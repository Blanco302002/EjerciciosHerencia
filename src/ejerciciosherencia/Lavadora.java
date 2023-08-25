package ejerciciosherencia;
public class Lavadora extends Electrodomestico {
    public int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public Lavadora(float precio, String color, char consumoEnergetico, float peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.peso > 30) {
            this.setPrecio(this.getPrecio() + 500);
        }
    }

    
}
