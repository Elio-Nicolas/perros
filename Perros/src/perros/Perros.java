
package perros;

import java.util.Scanner;

public class Perros {

    
    public static void main(String[] args) {
      
        
        Scanner sc= new Scanner(System.in);
        TablaDispersa tabla= new TablaDispersa();
        tabla.TablaDispersaEnlazada();
        int op;
        int cod;
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
                    
                    System.out.print(" Ingrese codigo de perro que desea eliminar");
                    cod=sc.nextInt();
                    tabla.eliminar(cod);
                    
                break;
                
                case 3:
                    
                    System.out.print(" Ingrese codigo de perro que desea buscar");
                    cod=sc.nextInt();
                    per=tabla.buscar(cod);
                    per.muestra(per);
                    
            }
    }while(op!=0);
    
}
}
