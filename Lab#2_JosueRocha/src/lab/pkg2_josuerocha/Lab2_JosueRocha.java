 
package lab.pkg2_josuerocha;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Lab2_JosueRocha {
    
    static Scanner leer=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op='0';
        ArrayList Detectives=new ArrayList();
        ArrayList Casos=new ArrayList();
        
        while(op!=5){
            System.out.println("****BIENVENIDO AGENTE****");
            System.out.println();
            System.out.println("QUE DESEA HACER?");
            System.out.println();
            System.out.println("1-AGREGAR");
            System.out.println("2-ELIMINAR");
            System.out.println("3-MODIFICAR");
            System.out.println("4-LISTAR");
            System.out.println("5-SALIR");
            op=leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("Que desea agregar?");
                    System.out.println();
                    System.out.println("1-Agregar detective");
                    System.out.println("2-Registrar Caso");
                    int agregar=leer.nextInt();
                    if(agregar==1){
                        System.out.println("Ingrese el nombre del Detective");
                        String nombre=leer.next();
                        System.out.println("Ingrese la edad de el detective");
                        int edad=leer.nextInt();
                        System.out.println("Ingrese la nacionalidad del detective");
                        String nacionalidad=leer.next();
                        System.out.println("Ingrese los años de experiencia laboral del detective");
                        int laborales=leer.nextInt();
                        System.out.println("Ingrese el Nivel del detective [1-10]");
                        int nivel=leer.nextInt();
                        if(nivel>10 || nivel<1){
                            System.out.println("Ingrese una opcion valida [1-10]");
                            nivel=leer.nextInt();
                        }
                        Detectives.add(new Detectives(nombre,edad,nacionalidad,laborales,nivel));
                    }
                    else
                        if(agregar==2){
                            
                            String tipo="";
                            String tipo2="";
                            System.out.println("Ingrese el lugar donde se cometio el crimen");
                            String lugar=leer.next();
                            System.out.println("Ingrese la descripcion del crimen");
                            String descripcion=leer.next();
                            System.out.println("Ingrese el tipo de crimen cometido (1-Homicidio)(2-Secuestro)(3-Robo)");
                            int crimen=leer.nextInt();
                            if(crimen==1){
                                tipo="Homicidio";
                            }
                            else
                                if(crimen==2){
                                    tipo="Secuestro";
                                }
                            else
                                if(crimen==3){
                                    tipo="Secuestro";
                                }
                                else{
                                    System.out.println("Ingrese una opcion valida(1-Homicidio)(2-Secuestro)(3-Robo)");
                                    crimen=leer.nextInt();
                                }
                            System.out.println(Detectives);
                            System.out.println("Ingrese el nombre del detective a cargo");
                            String detective=leer.next();
                            System.out.println("Ingrese el estado del caso (1-En proceso)(2-Resuelto)");
                            int estado=leer.nextInt();
                            if(estado==1){
                                tipo2="En proceso";
                            }
                            else
                                if(estado==2){
                                    tipo2="Resuelto";
                                }
                                else{
                                    System.out.println("Ingrese una opcion valida(1-En proceso)(2-Resuelto)");
                                    tipo2=leer.next();
                                }
                            Casos.add(new Casos(lugar,tipo,descripcion,detective,tipo2));
                        } 
                        else{
                            System.out.println("Ingrese una opcion valida (1-Agregar detective)(2-Registrar caso)");
                            agregar=leer.nextInt();
                        }
                break;
                case 2:
                        System.out.println(Detectives);
                        System.out.println();
                        System.out.println("Posicion del Detective a eliminar");
                        System.out.println("Nota: Recuerde que las posiciones empiezan desde 0 de derecha a izquierda");
                        int p=leer.nextInt();
                                if (p>=0 && p<Detectives.size()) {
                                    Detectives.remove(p);
                                    System.out.println("Detective eliminado de la lista exitosamente");          
                                }else{
                                     System.out.println("Posicion fuera de rango"); 
                                 }
                break;
                case 3:
                    System.out.println("Que desea Modificar?");
                    System.out.println();
                    System.out.println("1-Modificar un detective");
                    System.out.println("2-Modificar un Caso");
                    int modificar=leer.nextInt();
                    if(modificar==1){
                        System.out.println("Ingrese la posicion del detective que desea modificar");
            }
                    
                    
            }
            
        }
        
        
        
    }
    
}
