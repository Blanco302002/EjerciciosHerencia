package ejerciciosherencia;
public class Circulo implements calculosFormas {
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double Area() {
        double area = this.radio * this.radio * PI;
        return area;
    }

    @Override
    public double Perimetro() {
        double perimetro = this.radio * 2 * PI;
        return perimetro;
    }
    
}
