

package casarural;

public class dispersion {
    
  static final int M = 5;
 static final double R = 0.618034;
 
    static int dispersion(long clv){
        
  double t;
  int v;
  
  t = R * clv - Math.floor(R * clv); // parte decimal
  v = (int) (M * t);
  
  return v;
  }
}
