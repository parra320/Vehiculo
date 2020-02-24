/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import partesV.Chasis;
import partesV.Motor;
import partesV.llanta;

/**
 *
 * @author parra
 */
public class Vehiculo {
    
    private String modelo;
    private String marca;
    private String color;
    private llanta rodada;
    private Motor cilindros;
    private Chasis tipo;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String marca, String color, llanta rodada, Motor cilindros, Chasis tamaño) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.rodada = rodada;
        this.cilindros = cilindros;
        this.tipo = tamaño;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public llanta getRodada() {
        return rodada;
    }

    public void setRodada(llanta rodada) {
        this.rodada = rodada;
    }

    public Motor getCilindros() {
        return cilindros;
    }

    public void setCilindros(Motor cilindros) {
        this.cilindros = cilindros;
    }

   public void encender(){
       System.out.println("encender vehiculo");
   }
   public void apagar(){
       System.out.println("apagar vehiculo");
   }

    public Chasis getTipo() {
        return tipo;
    }

    public void setTipo(Chasis tipo) {
        this.tipo = tipo;
    }
}
