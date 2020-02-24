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
public class llanta {
    private int AnchoDeLLanta;
    private String fabricante;
    private int DiametroDeRin;

    public llanta() {
    }

    public llanta(int AnchoDeLLanta, String fabricante, int DiametroDeRin) {
        this.AnchoDeLLanta = AnchoDeLLanta;
        this.fabricante = fabricante;
        this.DiametroDeRin = DiametroDeRin;
    }

    public int getAnchoDeLLanta() {
        return AnchoDeLLanta;
    }

    public void setAnchoDeLLanta(int AnchoDeLLanta) {
        this.AnchoDeLLanta = AnchoDeLLanta;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getDiametroDeRin() {
        return DiametroDeRin;
    }

    public void setDiametroDeRin(int DiametroDeRin) {
        this.DiametroDeRin = DiametroDeRin;
    }
    
}
