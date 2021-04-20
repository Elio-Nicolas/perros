
        
package casarural;


import java.util.Scanner;


public class CasaRural {
    
    
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);
        casa_r arr [] =  new casa_r [ 5 ];
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
            sc.nextInt();
            
            switch(op){
                
                case 1:
                    
                    System.out.println(" ingrese clave");
                    clave= sc.nextLine();
                    System.out.println(" ingrese numero de habitacion");
                    numHabitacion= sc.nextInt();
                    System.out.println(" ingrese poblacion");
                    poblacion= sc.nextLine();
                    System.out.println(" ingrese direccion");
                    direccion= sc.nextLine();
                    System.out.println(" ingrese precio");
                    precio= sc.nextDouble();
                    
                    clv= TransformaClave.TransformaClave(clave);
                    disp=dispersion.dispersion(clv);
                    
                    casa_r casa= new casa_r(clave,direccion,poblacion,numHabitacion,precio);
                    arr[disp]= casa;
                    
                break;
                
                case 2:
                    
                    System.out.println(" Ingrese clave que desea eliminar");
                    
                    for(int i=0; i<=arr.length; i++){
                        
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
                    
                     for(int i=0; i<=arr.length; i++){
                        
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
