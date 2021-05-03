
package perros;

import java.util.Scanner;

public class perro {
  
    private String raza;
    private long socio;
    private int edad;
    private double peso;
    private String color;
    Scanner sc= new Scanner(System.in);
    
    public void asigna(){
        
        System.out.print("Ingrese raza del can: ");
        raza=sc.next();
        System.out.print("Ingrese Nº de socio: ");
        socio=sc.nextLong();
        System.out.print("Ingrese edad: ");
        edad=sc.nextInt();
        System.out.print("Ingrese peso: ");
        peso=sc.nextDouble();
        System.out.print("Ingrese color: ");
        color=sc.next();
        
    }
    
    public void muestra (perro e){
        
        System.out.println(" Raza: "+raza);
        System.out.println("Codigo: "+socio);
        System.out.println("Edad: "+edad);
        System.out.println("Peso: "+peso);
        System.out.println("Color: "+color);
        
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public long getSocio() {
        return socio;
    }

    public void setSocio(long socio) {
        this.socio = socio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
   
    
}
