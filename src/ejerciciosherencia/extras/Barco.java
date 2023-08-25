package ejerciciosherencia.extras;

public class Barco {
    protected int matricula;
    protected int eslora;
    protected String anioFab;

    public Barco(int matricula, int escalora, String anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int escalora) {
        this.eslora = escalora;
    }

    public String getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(String anioFab) {
        this.anioFab = anioFab;
    }
}
