
package perros;


public class TablaDispersa {
    
 static final double R = 0.618034;   
 static final int M = 101;
 private Elemento [] tabla;
  int numElementos;

public class Elemento{
    
   perro can;
   Elemento sgte;
   
   public Elemento(perro pe){
       
   can = pe;
   sgte = null;
   
   }
   
public perro getcan(){
    
  return can;
  
}

}



 public int dispersion(long x){
       
   double t;
   int v;
   t = R * x - Math.floor(R * x); // parte decimal
   v = (int) (M * t); 
   
   return v;
}
    
    
public void TablaDispersaEnlazada() {
        
    tabla = new Elemento[M];
     
     for (int k = 0; k < M; k++)
         
       tabla[k] = null;
       numElementos = 0;
     
}
    
    public void insertar(perro pe){
        
     int posicion;
     
     Elemento nuevo;
     posicion = dispersion(pe.getSocio());
     nuevo = new Elemento(pe);
     nuevo.sgte = tabla[posicion];
     tabla[posicion] = nuevo;
     numElementos++;
     
    }
    
    public void eliminar(int codigo){
        
      int posicion;
      posicion = dispersion(codigo);
      Elemento actual;
      Elemento anterior=null;
       
      if (tabla[posicion] != null) // no está vacía{
          
       anterior = null;
       actual = tabla[posicion];
       
        while ((actual.sgte != null) &&
                             actual.getcan().getSocio() != codigo){
            
           anterior = actual;
           actual = actual.sgte;
           
        }
        
         if (actual.getcan().getSocio() != codigo)
             
             System.out.println("No se encuentra en la tabla el socio "+ codigo);
         
         else //if (conforme (actual.getSocio())) //se retira el nodo{
             
         if (anterior == null) // primer nodo
             
           tabla[posicion] = actual.sgte;

//Tablas de dispersión, funciones hash 363

         else
         anterior.sgte = actual.sgte;
         actual = null;
         numElementos--;
         
}
    
    public perro buscar(int codigo){
        
      Elemento p = null;
      int posicion;
      posicion = dispersion(codigo);
      
      if (tabla[posicion] != null){
          
        p = tabla[posicion];
        
        while ((p.sgte != null) && p.getcan().getSocio() != codigo){
            
           p = p.sgte;
           
           if (p.getcan().getSocio() != codigo){
               
           p = null;
             
           }
        }
      }
      
       return p.can;
 }
    
}

    

