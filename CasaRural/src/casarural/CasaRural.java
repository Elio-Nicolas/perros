
        
package casarural;


import java.util.Scanner;


public class CasaRural {
    
    static final int TAMTABLA = 101;
    
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
        
        do{
            
            System.out.println("       MENU        ");
            System.out.println("  0- Salir         ");
            System.out.println("  1- Agregar casa  ");
            System.out.println("  2- Eliminar casa ");
            System.out.println("  3- Buscar casa   ");
            op=sc.nextInt();
           // sc.nextInt();
            
            for(int i=0; i<=TAMTABLA ; i++){
                
                  arr[i].setCodigo(null);
                  arr[i].setDireccion(null);
                  arr[i].setNumhabitacion(0);
                  arr[i].setPoblacion(null);
                  arr[i].setPrecio(0.0);
                  
                }
           
           
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
                    
                    casa_r casa= new casa_r(clave,direccion,poblacion,numHabitacion,precio);
                    arr[disp]= casa;
                    System.out.println("clave de dispercion:  "+disp);
                    System.out.println("codigo: "+arr[disp].getCodigo());
                    System.out.println("direccion: "+arr[disp].getDireccion());
                    System.out.println("poblacion: "+arr[disp].getPoblacion());
                    System.out.println("Numero de habitacion: "+arr[disp].getNumhabitacion());
                    System.out.println("precio: "+arr[disp].getPrecio());
                    
                break;
                
                case 2:
                    
                    System.out.println(" Ingrese clave que desea eliminar");
                    
                    for(int i=0; i<=TAMTABLA; i++){
                        
                        System.out.println(" casa : "+arr[i].getDireccion());
                        System.out.println(" Clave: "+arr[i].getCodigo());
                    }
                    
                    disp=sc.nextInt();
                    
                    arr[disp].setCodigo(null);
                    arr[disp].setDireccion(null);
                    arr[disp].setNumhabitacion(0);
                    arr[disp].setPoblacion(null);
                    arr[disp].setPrecio(0.0);
                    
                break;
                
                case 3:
                    
                     for(int i=0; i<=TAMTABLA; i++){
                        
                        System.out.println(" casa : "+arr[i].getDireccion());
                        System.out.println(" Clave: "+arr[i].getCodigo());
                        System.out.println(" Habitacion: "+arr[i].getNumhabitacion());
                        System.out.println(" Poblacio: "+arr[i].getPoblacion());
                        System.out.println(" Precio: "+arr[i].getPrecio());
                    }
                    
            }
        }while( op != 0);
        
    }
    
}
