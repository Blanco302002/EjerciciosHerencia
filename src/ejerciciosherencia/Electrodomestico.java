package ejerciciosherencia;
public class Electrodomestico {
    protected float precio;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Electrodomestico() {
        precio = 0;
        color = "";
        consumoEnergetico = 'F';
        peso = 0;
    }
    
    public Electrodomestico(float precio, String color, char consumoEnergetico, float peso) {
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        this.precio = precio;
        precioFinal();
    }
    
    
    private void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = 'F';
        }
    }
    private void comprobarColor(String color){
        color = color.toLowerCase();
        if (color.equals("gris") || color.equals("negro") || color.equals("blanco") || color.equals("rojo") || color.equals("azul")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }
    public void precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                this.precio = precio + 1000;
                break;
            case 'B':
                this.precio = precio + 800;
                break;
            case 'C':
                this.precio = precio + 600;
                break;
            case 'D':
                this.precio = precio + 500;
                break;
            case 'E':
                this.precio = precio + 300;
                break;
            case 'F':
                this.precio = precio + 100;
                break; 
        }
        if (peso >= 1 && peso <= 19) {
            this.precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            this.precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
    }
    
}
