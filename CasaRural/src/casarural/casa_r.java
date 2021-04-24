
package casarural;

import java.util.Scanner;


public class casa_r {
   
    private String codigo;
    private String poblacion;
    private String direccion;
    private int numhabitacion;
    private Double precio;
    boolean estado;
    
     public  casa_r () {
         
        estado = true ;
       // asigna();
        
    }
    
      public  void  asigna () {
              
        Scanner sc= new Scanner(System.in);
        System.out.println ( " INGRESE EL CODIGO (5 CARACTERES) " );
        codigo = sc.next();
         System.out.println ( " INGRESE LA POBLACION " );
         poblacion = sc.next();
        System.out.println ( " INGRESE LA DIRECCION " );
         direccion = sc.next();
        System.out.println ( " INGRESE NUMERO / S DE HABITACION " );
         numhabitacion =sc.nextInt ();
         System.out.println ( " INGRESE EL PRECIO POR DIA DE LA ESTADIA " );
         precio = sc.nextDouble ();
         
         
    }
      
       public  void  muestra () {
           
           
          System.out.println ( " CASA RURAL: " +codigo);
          System.out.println ( " NUMERO / S DE HABITACION: " + numhabitacion);
          System.out.println ( " POBLACION DE LA CASA: " + poblacion);
          System.out.println ( " DIRECCION DE LA CASA: " + direccion);
          System.out.println ( " PRECIO POR DIA: " + precio);
        
           
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumhabitacion() {
        return numhabitacion;
    }

    public void setNumhabitacion(int numhabitacion) {
        this.numhabitacion = numhabitacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
    }
    

