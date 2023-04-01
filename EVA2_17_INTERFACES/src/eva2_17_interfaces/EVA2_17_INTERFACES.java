/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_interfaces;

/**
 *
 * @author hp
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //MostrarDatos data = new MostrarDatos();  
    //No se puede crear objetos   
    //        MostrarDatos datos=new MostrarDatos();
        
        persona perso = new persona ("julio",18);   
    perso.imprimirDatos();
    
    Computadora compu = new Computadora("intel i5",12,25000,"Computadora");
    compu.imprimirDatos();
        
    }
    
}
