
 
package casarural;

public class dir {
    
    static final int TAMTABLA = 7;
    
   static int direccion (String clave , casa_r [] arr){
        
     int i=0, dir;
     long clv;
     
     clv=TransformaClave.TransformaClave(clave);
     dir= (int)(clv % TAMTABLA);
     
     while(arr[dir]!=null && !arr[dir].getCodigo().equals(clave)){
         
         i++;
         dir= dir + i*i;
         dir = dir % TAMTABLA;
     }
     
     return dir;
     
    }
   
}
