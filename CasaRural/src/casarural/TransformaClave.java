
package casarural;


public class TransformaClave {


  static long TransformaClave(String clave){
    
    long clv=0;
    
   for (int j = 0; j < Math.min(clave.length(),10); j++){
       
   
        clv= clv* 27 + (int)clave.charAt(j);
   }

    if (clv < 0) clv = -clv;
    
    return clv;
       
  }
}
