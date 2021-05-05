
package perros;

import java.util.Scanner;
import java.lang.NullPointerException;

public class Perros {

    
    public static void main(String[] args) {
      
        
        Scanner sc= new Scanner(System.in);
        TablaDispersa tabla= new TablaDispersa();
        tabla.TablaDispersaEnlazada();             //Inicializa tabla con elementos en Null.
        int op;
        perro per=new perro();
        
        do{
            
            System.out.println("       MENU        ");
            System.out.println("  0- Salir         ");
            System.out.println("  1- Agregar perro  ");
            System.out.println("  2- Eliminar perro ");
            System.out.println("  3- Buscar perro   ");
            op=sc.nextInt();
           
            switch(op){
                
                case 1:
                    
                    perro p= new perro();
                    p.asigna();
                    tabla.insertar(p);
                 
                break;
                
                case 2:
                   
                    tabla.eliminar();
                  
                break;
                
                case 3:
                    
                try{    
                    per=tabla.buscar();
                    per.muestra(per);
                }   
                catch( NullPointerException e){
                      
                 System.out.println(" Perro no encontrado ");
                }
            }
    }while(op!=0);
    
}
}
