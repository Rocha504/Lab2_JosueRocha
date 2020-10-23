 
package lab.pkg2_josuerocha;

/**
 *
 * @author josue
 */
public class Detectives {
    
    private String nombre;
    private int edad;
    private String nacionalidad;
    private int laborales;
    private int nivel;
    
    public Detectives(){};
    public Detectives(String nombre,int edad, String nacionalidad,int laborales,int nivel){
        this.nombre=nombre;
        this.edad=edad;
        this.nacionalidad=nacionalidad;
        this.laborales=laborales;
        this.nivel=nivel;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }
    public String getNacionailidad(){
        return nacionalidad;
    }
    public void setLaborales(int laborales){
        this.laborales=laborales;
    }
    public int getLaborales(){
        return laborales;
    }
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
    public int getNivel(){
        return nivel;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\n|Edad: "+edad+"\n|Nacionalidad: "+nacionalidad+"\n|Experiencia laboral: "+laborales+" años\n|Nivel: "+nivel; 
    }
    
}
