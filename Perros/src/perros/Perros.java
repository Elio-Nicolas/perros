
package perros;

import java.util.Scanner;

public class Perros {

    
    public static void main(String[] args) {
      
        
        Scanner sc= new Scanner(System.in);
        TablaDispersa tabla= new TablaDispersa();
        //tabla.TablaDispersaEnlazada();
        int op;
       
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
                    
            }
    }while(op!=0);
    
}
}
