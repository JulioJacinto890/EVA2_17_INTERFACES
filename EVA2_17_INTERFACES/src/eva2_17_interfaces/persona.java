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
public class persona implements MostrarDatos{
 
  private String nombre;   
 private int edad;   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
     public persona(){
     
    }   
   
    
  @Override  
    
  public void imprimirDatos(){
      System.out.println("Nombre: " +nombre); 
      System.out.println("Edad: " +edad);
  }  
    
    
    
 
  
  
  
  
    
}