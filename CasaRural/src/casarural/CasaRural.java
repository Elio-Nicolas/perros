
        
package casarural;


import java.util.Scanner;


public class CasaRural {
    
    
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);
        casa_r arr [] =  new casa_r [ 3 ];
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
            }
        }while( op != 0);
        
    }
    
}
