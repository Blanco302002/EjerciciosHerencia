package ejerciciosherencia;
public abstract class Personaje {
    public Position ubicacion;
    public String nick;
    public int vidas = 3;
    public int energia = 100;
    public char orientacion = 'N';

    public Position getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }
    
    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }
    
    public void Disparar() {
        if (this.energia >= 10) {
            this.setEnergia(this.getEnergia() - 10); // cheto
        } else {
            System.out.println("No queda mas energia para disparar.");
        }
    }
    
    public void Girar() {
        switch (this.orientacion) {
            case 'N':
                this.setOrientacion('E');
                break;
            case 'E':
                this.setOrientacion('S');
                break;
            case 'S':
                this.setOrientacion('O');
                break;
            case 'O':
                this.setOrientacion('N');
                break;
        }
    }
    
    public void Avanzar(Position posicion) {
        int posX = this.ubicacion.getX();
        int posY = this.ubicacion.getY();
        
        switch (this.orientacion) {
            case 'N':
                this.ubicacion.setY(posY + 1);
                break;
            case 'S':
                this.ubicacion.setY(posY + 1);
                break;
            case 'O':
                this.ubicacion.setX(posX - 1);
                break;
            case 'E':
                this.ubicacion.setX(posX + 1);
                break;
        }
    }    
}
