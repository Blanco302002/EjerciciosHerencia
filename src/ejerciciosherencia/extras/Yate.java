/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia.extras;

public class Yate extends Barco {
    public int CVmotor;
    public int nroCamarotes;
    public Yate(int matricula, int escalora, String anioFab, int nroCamarotes,int CVmotor) {
        super(matricula, escalora, anioFab);
        this.nroCamarotes = nroCamarotes;
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
