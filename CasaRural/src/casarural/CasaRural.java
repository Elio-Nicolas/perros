
        
package casarural;


import java.util.Scanner;


public class CasaRural {
    
  //  static final int TAMTABLA = 7;    // tamaño con numero primo
    
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);
        tabla_disp tabla =  new tabla_disp ();
        tabla.tablaDispersa();
        
        
           
       int op=0;
       
        do{
            
            System.out.println("       MENU        ");
            System.out.println("  0- Salir         ");
            System.out.println("  1- Agregar casa  ");
            System.out.println("  2- Eliminar casa ");
            System.out.println("  3- Buscar casa   ");
            op=sc.nextInt();
           
            switch(op){
                
                case 1:
                    
                    casa_r casa = new casa_r();
                    casa.asigna();
                    tabla.insertar(casa);
                      
                break;
                
                case 2:
                    
                   System.out.println(" Ingrese codigo de la casa a eliminar");
                   String codigo= sc.next();
                   
                   try{
                       
                       tabla.eliminar(codigo);
                       System.out.println(" Casa eliminada");
                    }
                   catch (Exception e){
                       
                       System.out.println(" Casa no se encontro");
                       
                   }
         
                break;
                
                case 3:
                    
                    System.out.println(" Ingrese codigo de casa a buscar");
                    codigo=sc.next();
                    
                    casa= tabla.buscar(codigo);
                    
                   try{
                        
                        casa.muestra();
                        System.out.println(" "+casa.getCodigo());
                    }
                   catch( Exception e){
                        
                        System.out.println(" Casa no encontrada");
                        
                    }
                 break;  
            }
        }while( op != 0);
        
    }
} 

