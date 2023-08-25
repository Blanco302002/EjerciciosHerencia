package ejerciciosherencia;
public class Rectangulo implements calculosFormas {
    public double base;
    public double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override 
    public double Area() {
        double area = this.base * this.altura; 
        return area;
    }
    @Override 
    public double Perimetro() {
        double perimetro = (this.altura + this.base) * 2;
        return perimetro;
    }
}
