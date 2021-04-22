
package casarural;


public class casa_r {
   
    private String codigo;
    private String poblacion;
    private String direccion;
    private int numhabitacion;
    private Double precio;
    
    casa_r(){    //constructor para inicializar tabla
        
        this.codigo=null;
        this.direccion=null;
        this.poblacion=null;
        this.numhabitacion=0;
        this.precio=0.0;
    }
    
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
    

