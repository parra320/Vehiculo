/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partesV;

/**
 *
 * @author parra
 */
public class Chasis {
    private String tipo;
    private String volumen;
    private String estetica;

    public Chasis() {
    }

    public Chasis(String tipo, String volumen, String estetica) {
        this.tipo = tipo;
        this.volumen = volumen;
        this.estetica = estetica;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getEstetica() {
        return estetica;
    }

    public void setEstetica(String estetica) {
        this.estetica = estetica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
