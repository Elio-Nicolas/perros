
package casarural;


public class casa_r {
   
    private String codigo=null;
    private String poblacion=null;
    private String direccion=null;
    private int numhabitacion=0;
    private Double precio=0.0;
    
    casa_r(String codigo,String direccion,String poblacion,int numhabitacion,Double precio){
        
        this.codigo=codigo;
        this.direccion=direccion;
        this.poblacion=poblacion;
        this.numhabitacion=numhabitacion;
        this.precio=precio;
        
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
    

