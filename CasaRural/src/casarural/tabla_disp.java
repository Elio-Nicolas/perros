
 
package casarural;


public class tabla_disp {
  
   

     static final double R = 0.618034 ; // constante para la dispersion 
     static  final  int  TAMTABLA  = 101 ;
    
     private int numElementos  ; // núm de elementos que hayan la tabla, incluyendo las bajas, se almacena en la variable
     private double factorCarga ; // cuando se alcance el 0.5 se pueda generar un aviso
     private casa_r  [] tabla;
    
    // inicializacion: constructor de la tabla
     public void tablaDispersa  () {
         
        tabla =  new  casa_r [ TAMTABLA ];
        int i;
        
        for (i = 0 ; i < TAMTABLA ; i ++ ) {
            
            tabla [i] = null ;
            numElementos = 0 ;
            factorCarga = 0.0 ;
        }
    }
    // posicion de un elemento, explor cuadratica
    public  int  direccion ( String clave  ) {
        
        int i=0;
        int p;
        long d;
        
        d = transformarClav (clave);
        
        // aplica aritmética modular para obtener dirección base
        p = ( int ) (d % TAMTABLA );
        
        // exploración cuadrática hasta encontrar una posición vacía (null)
        while (tabla [p] != null  && tabla[p].getCodigo().equals(clave)) { // El método equals (), se utiliza para comparar dos objetos
        
            i ++ ;
            p = p + i * i;
            p = p % TAMTABLA ;
            
        }
        
        System.out.println(" "+p);
        return p;
    }
    
    
    
     long  transformarClav ( String  clave ) {
         
        long d=0; 
         
        for (int j = 0 ; j < Math.min(clave.length (), 5 ); j ++ ) {
            
            d= d*27 + ( int ) clave.charAt (j);
        }
        if (d < 0 ) d = - d;            
        
        return d;
        
     }   
    
      public  void insertar (casa_r r ) {
        
        int pos;
        // primero se busca la posición que debe ocupar, el método direccion () devuelve la posición buscada
        pos=direccion(r.getCodigo ());
        tabla [pos] = r;
        numElementos ++ ;
        factorCarga = ( double ) numElementos / TAMTABLA ;
        
        if ( factorCarga >0.5 ) {
            
            System.out.println ( " EL FACTOR DE CARGA HA SUPERADO EL 50% " );
            
        }
    }
      
    
     public casa_r buscar (String clave) {
 
        casa_r casa ;
        long d = transformarClav (clave);
        int pos=( int ) (d % TAMTABLA );
       
        casa = tabla [pos];
        
        if ( casa != null){
            
         if ( !casa.estado) {
            
            casa = null;
            
          }
        
        }
        return casa;
        
        }
        
     
    public  void  eliminar (String clave) {  // eliminar
     
    long d = transformarClav (clave);
    int pos=( int ) (d % TAMTABLA );
    
    if (tabla [pos]!=null )
        
    tabla [pos] . estado =  false ;
    
    }
    
}
    
    

