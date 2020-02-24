/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testVehiculo;

import partesV.Chasis;
import partesV.Motor;
import partesV.llanta;
import vehiculo.Vehiculo;

/**
 *
 * @author parra
 */
public class TestVehiculo {
    public static void main (String []args){
        Vehiculo Vec1=new Vehiculo();
        Vec1.setMarca("Ford");
        Vec1.setModelo("Mustang 1969");
        Vec1.setColor("rojo");
        Vec1.setCilindros(new Motor(4, "5000m³", 3000));
        Vec1.setRodada(new llanta(205, "Goodyear", 16));
        Vec1.setTipo(new Chasis("chasis con carroceria separada", "dos volumenes", "descapotable"));
        //Vec1.encender();
        System.out.println(Vec1.getMarca()+", "+Vec1.getModelo()+", "+Vec1.getColor());
        System.out.println(Vec1.getCilindros().getNcilindros()+" "+Vec1.getCilindros().getHP()+" "+Vec1.getCilindros().getTamaño());
        System.out.println(Vec1.getRodada().getAnchoDeLLanta()+" "+Vec1.getRodada().getFabricante()+" "+Vec1.getRodada().getDiametroDeRin());
        System.out.println(Vec1.getTipo().getTipo()+", "+Vec1.getTipo().getVolumen()+", "+Vec1.getTipo().getEstetica());
        //Vec1.apagar();
        Vec1.getRodada().setFabricante("Michelin");
        System.out.println(Vec1.getRodada().getFabricante());
        
        
    }
}
