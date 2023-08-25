package ejerciciosherencia.extras;

public class BarcoMotor extends Barco {
    public int CVmotor;
    public int nroCamarotes;
    
    public BarcoMotor (int matricula, int escalora, String anioFab, int CVmotor) {
        super(matricula, escalora, anioFab);
        this.CVmotor = CVmotor;
    }

    public int getCVmotor() {
        return CVmotor;
    }

    public void setCVmotor(int CVmotor) {
        this.CVmotor = CVmotor;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }
    
    
}
