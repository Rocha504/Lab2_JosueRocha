 
package lab.pkg2_josuerocha;

/**
 *
 * @author josue
 */
public class Casos {
    
    private String lugar;
    private String tipo;
    private String descripcion;
    private String detective;
    private String estado;
    
    public Casos(){}
    public Casos(String lugar,String tipo,String descripcion,String detective,String estado){
        this.lugar=lugar;
        this.tipo=tipo;
        this.descripcion=descripcion;
        this.detective=detective;
        this.estado=estado;
    }
    
    public void setLugar(String lugar){
        this.lugar=lugar;
    }
    public String getLugar(){
        return lugar;
    }
    public void setTipo(String tipo){
           this.tipo=tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDescripcion(String descripcion){
         this.descripcion=descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDetective(String detective){
          this.detective=detective;
    }
    public String getDetective(){
        return detective;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public String getEstado(){
        return estado;
    }
    
}
