
        
package casarural;


import java.util.Scanner;


public class CasaRural {
    
    static final int TAMTABLA = 7;    // tamaño con numero primo
    
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);
        casa_r arr [] =  new casa_r [TAMTABLA];
        String clave;
        String poblacion;
        String direccion;
        int numHabitacion;
        double precio;
        int op;
        long clv;
        int disp;
        
        
          for(int i=0; i<TAMTABLA ; i++){   // Inicializa la tabla 
                
                 casa_r casa= new casa_r(); // crea un objeto con constructor sin parametros
                 arr[i]= casa;              // arreglo de tipo casa con valores por defecto
                  
                }
           
        do{
            
            System.out.println("       MENU        ");
            System.out.println("  0- Salir         ");
            System.out.println("  1- Agregar casa  ");
            System.out.println("  2- Eliminar casa ");
            System.out.println("  3- Buscar casa   ");
            op=sc.nextInt();
           // sc.nextInt();
            
          
           
            switch(op){
                
                case 1:
                    
                    System.out.println(" ingrese clave");
                    clave= sc.next();
                    System.out.println(" ingrese numero de habitacion");
                    numHabitacion= sc.nextInt();
                    System.out.println(" ingrese poblacion");
                    poblacion= sc.next();
                    System.out.println(" ingrese direccion");
                    direccion= sc.next();
                    System.out.println(" ingrese precio");
                    precio= sc.nextDouble();
                    
                    clv= TransformaClave.TransformaClave(clave);
                    disp=dispersion.dispersion(clv);
                    
                    //constructor
                    casa_r casa= new casa_r(clave,direccion,poblacion,numHabitacion,precio);
                    
                    for(int i=0;i<TAMTABLA;i++){
                        
                        if( i == disp){
                            
                          arr[i]= casa;
                          
                        }
                    }
                    //muestra el elemento creado
                    System.out.println("clave de dispercion:  "+disp);
                    System.out.println("codigo: "+arr[disp].getCodigo());
                    System.out.println("direccion: "+arr[disp].getDireccion());
                    System.out.println("poblacion: "+arr[disp].getPoblacion());
                    System.out.println("Numero de habitacion: "+arr[disp].getNumhabitacion());
                    System.out.println("precio: "+arr[disp].getPrecio());
                    
                break;
                
                case 2:
                    
                    
                    
                    System.out.println(" casas y claves existentes");
                    System.out.println("__________________________");
                    
                    for(int i=0; i<TAMTABLA; i++){
                        
                        System.out.println(" ________________________________________");
                        System.out.println(" casa : " +arr[i].getDireccion());
                        System.out.println(" Clave de dispercion: "+arr[i].getCodigo());
                        System.out.println(" ________________________________________");
                    }
                    
                    System.out.println(" Ingrese clave que desea eliminar");
                    disp=sc.nextInt();
                    
                    for( int i=0;i<TAMTABLA;i++ ){
                        
                      if( i== disp){
                    
                      arr[disp].setCodigo(null);
                      arr[disp].setDireccion(null);
                      arr[disp].setNumhabitacion(0);
                      arr[disp].setPoblacion(null);
                      arr[disp].setPrecio(0.0);
                      
                      }
                    
                    }
                break;
                
                case 3:
                    
                     for(int i=0; i<TAMTABLA; i++){
                        
                       System.out.println(" ___________________________");
                       System.out.println(" Codigo: "+arr[i].getCodigo());
                       System.out.println(" Clave de dispercion: "+i    );
                       System.out.println(" ___________________________");
                    }
                     
                     System.out.println(" ingrese clave a buscar");
                     disp=sc.nextInt();
                     
                     for( int i=0;i<TAMTABLA;i++){
                         
                         if( i == disp){
                          
                          System.out.println("___________________________________________________");
                          System.out.println("clave de dispercion: "+disp);
                          System.out.println("codigo: "+arr[disp].getCodigo());
                          System.out.println("direccion: "+arr[disp].getDireccion());
                          System.out.println("poblacion: "+arr[disp].getPoblacion());
                          System.out.println("Numero de habitacion: "+arr[disp].getNumhabitacion());
                          System.out.println("precio: "+arr[disp].getPrecio()); 
                          System.out.println("____________________________________________________");
                          
                         }
                     }
            }
        }while( op != 0);
        
    }
    
}
