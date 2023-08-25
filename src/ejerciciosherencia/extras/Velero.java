
package ejerciciosherencia.extras;

public class Velero extends Barco {
    public int nroMastiles;
    public Velero(int matricula, int escalora, String anioFab, int nroMastiles) {
        super(matricula, escalora, anioFab);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }
    

}
