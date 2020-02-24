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
public class Motor {
    private int Ncilindros;
    private String tamaño;
    private int HP;

    public Motor() {
    }

    public Motor(int Ncilindros, String tamaño, int HP) {
        this.Ncilindros = Ncilindros;
        this.tamaño = tamaño;
        this.HP = HP;
    }

    public int getNcilindros() {
        return Ncilindros;
    }

    public void setNcilindros(int Ncilindros) {
        this.Ncilindros = Ncilindros;
    }
    
     public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public void encender(){
        System.out.println("encender motor");
    }
    
    public void apagar(){
        System.out.println("apagar motor");
    }

   
}
