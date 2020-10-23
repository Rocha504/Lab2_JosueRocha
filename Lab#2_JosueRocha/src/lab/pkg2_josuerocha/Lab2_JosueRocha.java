package lab.pkg2_josuerocha;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Lab2_JosueRocha {

    static Casos m = new Casos();
    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int op = '0';
        ArrayList Detectives = new ArrayList();
        ArrayList Casos = new ArrayList();

        while (op != 5) {
            System.out.println("****BIENVENIDO AGENTE****");
            System.out.println();
            System.out.println("QUE DESEA HACER?");
            System.out.println();
            System.out.println("1-AGREGAR");
            System.out.println("2-ELIMINAR");
            System.out.println("3-MODIFICAR");
            System.out.println("4-LISTAR");
            System.out.println("5-SALIR");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Que desea agregar?");
                    System.out.println();
                    System.out.println("1-Agregar detective");
                    System.out.println("2-Registrar Caso");
                    int agregar = leer.nextInt();
                    if (agregar == 1) {
                        System.out.println("Ingrese el nombre del Detective");
                        String nombre = leer.next();
                        System.out.println("Ingrese la edad de el detective");
                        int edad = leer.nextInt();
                        System.out.println("Ingrese la nacionalidad del detective");
                        String nacionalidad = leer.next();
                        System.out.println("Ingrese los años de experiencia laboral del detective");
                        int laborales = leer.nextInt();
                        System.out.println("Ingrese el Nivel del detective [1-10]");
                        int nivel = leer.nextInt();
                        if (nivel > 10 || nivel < 1) {
                            System.out.println("Ingrese una opcion valida [1-10]");
                            nivel = leer.nextInt();
                        }
                        Detectives.add(new Detectives(nombre, edad, nacionalidad, laborales, nivel));
                    } else if (agregar == 2) {

                        String tipo = "";
                        String tipo2 = "";
                        System.out.println("Ingrese el lugar donde se cometio el crimen");
                        String lugar = leer.next();
                        System.out.println("Ingrese la descripcion del crimen");
                        String descripcion = leer.next();
                        System.out.println("Ingrese el tipo de crimen cometido (1-Homicidio)(2-Secuestro)(3-Robo)");
                        int crimen = leer.nextInt();
                        if (crimen == 1) {
                            tipo = "Homicidio";
                        } else if (crimen == 2) {
                            tipo = "Secuestro";
                        } else if (crimen == 3) {
                            tipo = "Secuestro";
                        } else {
                            System.out.println("Ingrese una opcion valida(1-Homicidio)(2-Secuestro)(3-Robo)");
                            crimen = leer.nextInt();
                        }
                        imprimir(Detectives);
                        System.out.println("Ingrese el nombre del detective a cargo");
                        String detective = leer.next();
                        System.out.println("Ingrese el estado del caso (1-En proceso)(2-Resuelto)");
                        int estado = leer.nextInt();
                        if (estado == 1) {
                            tipo2 = "En proceso";
                        } else if (estado == 2) {
                            tipo2 = "Resuelto";
                        } else {
                            System.out.println("Ingrese una opcion valida(1-En proceso)(2-Resuelto)");
                            tipo2 = leer.next();
                        }
                        Casos.add(new Casos(lugar, tipo, descripcion, detective, tipo2));
                    } else {
                        System.out.println("Ingrese una opcion valida (1-Agregar detective)(2-Registrar caso)");
                        agregar = leer.nextInt();
                    }
                    break;
                case 2:
                    imprimir(Detectives);
                    System.out.println();
                    System.out.println("Posicion del Detective a eliminar");
                    System.out.println("Nota: Recuerde que las posiciones empiezan desde 0 de derecha a izquierda");
                    int p = leer.nextInt();
                    if (p >= 0 && p < Detectives.size()) {
                        Detectives.remove(p);
                        System.out.println("Detective eliminado de la lista exitosamente");
                    } else {
                        System.out.println("Posicion fuera de rango");
                    }
                    break;
                case 3:
                    System.out.println("Que desea Modificar?");
                    System.out.println();
                    System.out.println("1-Modificar un detective");
                    System.out.println("2-Modificar un Caso");
                    int modificar = leer.nextInt();
                    if (modificar == 1) {
                        imprimir(Detectives);
                        System.out.println();
                        System.out.println("Ingrese la posicion del detective que desea modificar");
                        System.out.println("Nota: Recuerde que las posiciones empiezan desde 0 de derecha a izquierda");
                        p = leer.nextInt();
                        if (p >= 0 && p < Detectives.size()) {
                            System.out.println("Que desea modificar de este detective?");
                            System.out.println("1-Nombre");
                            System.out.println("2-Edad");
                            System.out.println("3-Nacionalidad");
                            System.out.println("4-Años laborales");
                            System.out.println("5-Nivel");
                            int modificacion = leer.nextInt();
                            switch (modificacion) {
                                case 1:
                                    System.out.println("Ingrese el nuevo nombre");
                                    String nuevo = leer.next();
                                    ((Detectives) Detectives.get(p)).setNombre(nuevo);
                                    break;
                                case 2:
                                    System.out.println("Ingrese la edad nueva");
                                    int nueva = leer.nextInt();
                                    ((Detectives) Detectives.get(p)).setEdad(nueva);
                                    break;
                                case 3:
                                    System.out.println("Ingrese la nacionalidad nueva");
                                    String nuevan = leer.next();
                                    ((Detectives) Detectives.get(p)).setNacionalidad(nuevan);
                                    break;
                                case 4:
                                    System.out.println("Ingrese los años laborales");
                                    int laburo = leer.nextInt();
                                    ((Detectives) Detectives.get(p)).setLaborales(laburo);
                                    break;
                                case 5:
                                    System.out.println("Ingrese el nuevo nivel");
                                    int niveln = leer.nextInt();
                                    ((Detectives) Detectives.get(p)).setNivel(niveln);
                                    break;
                                default:
                                    System.out.println("Ingrese uan opcion valida");
                                    modificacion = leer.nextInt();
                            }
                        }
                    } else if (modificar == 2) {
                        imprimir(Casos);
                        System.out.println();
                        System.out.println("Ingrese la posicion del caso que desea modificar");
                        System.out.println("Nota: Recuerde que las posiciones empiezan desde 0 de derecha a izquierda");
                        p = leer.nextInt();
                        if (p >= 0 && p < Detectives.size()) {
                            System.out.println("Que desea modificar de este caso?");
                            System.out.println("1-Lugar");
                            System.out.println("2-Tipo");
                            System.out.println("3-Descripicon");
                            System.out.println("4-Detective");
                            System.out.println("5-Estado");
                            int modificacion = leer.nextInt();
                            switch (modificacion) {
                                case 1:
                                    System.out.println("Ingrese el lugar nuevo");
                                    String lugarn = leer.next();
                                    ((Casos) Casos.get(p)).setLugar(lugarn);
                                    break;
                                case 2:
                                    String tipon = "";
                                    System.out.println("Ingrese el tipo de crimen nuevo (1-Homicidio)(2-Secuestro)(3-Robo)");
                                    int crimenn = leer.nextInt();
                                    if (crimenn == 1) {
                                        tipon = "Homicidio";
                                    } else if (crimenn == 2) {
                                        tipon = "Secuestro";
                                    } else if (crimenn == 3) {
                                        tipon = "Secuestro";
                                    } else {
                                        System.out.println("Ingrese una opcion valida(1-Homicidio)(2-Secuestro)(3-Robo)");
                                        crimenn = leer.nextInt();
                                    }
                                    ((Casos) Casos.get(p)).setTipo(tipon);
                                    break;
                                case 3:
                                    System.out.println("Ingrese la descripcion nueva");
                                    String descripcionn = leer.next();
                                    ((Casos) Casos.get(p)).setDescripcion(descripcionn);
                                    break;
                                case 4:
                                    System.out.println(Detectives);
                                    System.out.println();
                                    System.out.println("Ingrese el nombre del detective a cargo del caso");
                                    String cargon = leer.next();
                                    ((Casos) Casos.get(p)).setDetective(cargon);
                                    break;
                                case 5:
                                    String tipo3 = "";
                                    System.out.println("Ingrese el nuevo estado del caso");
                                    int estadon = leer.nextInt();
                                    if (estadon == 1) {
                                        tipo3 = "En proceso";
                                    } else if (estadon == 2) {
                                        tipo3 = "Resuelto";
                                    } else {
                                        System.out.println("Ingrese una opcion valida(1-En proceso)(2-Resuelto)");
                                        tipo3 = leer.next();
                                    }
                                    ((Casos) Casos.get(p)).setEstado(tipo3);
                                    break;
                                default:
                                    System.out.println("Ingrese una opcion valida");
                                    modificacion = leer.nextInt();
                            }
                        }
                    } else {
                        System.out.println("Ingrese una opcion valida(1-Detectives)(2-Casos)");
                        modificar = leer.nextInt();
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la lista que desea ver");
                    System.out.println("1-Detectives");
                    System.out.println("2-Casos");
                    int lista = leer.nextInt();
                    if (lista == 1) {
                        imprimir(Detectives);
                    } else if (lista == 2) {
                        System.out.println("Ingrese el tipo de casos que desea ver");
                        System.out.println("1-Todos");
                        System.out.println("2-Resueltos");
                        System.out.println("3-Pendientes");
                        int casos = leer.nextInt();
                        if (casos == 1) {
                            imprimir(Casos);
                        } else if (casos == 2) {
                            for (int i = 0; i < Casos.size(); i++) {
                                Casos aux = (Casos) Casos.get(i);
                                String estado = m.getEstado(aux);
                                if (estado.equalsIgnoreCase("Resuelto")) {
                                    System.out.println(aux);
                                }
                            }
                        } else if (casos == 3) {
                            for (int i = 0; i < Casos.size(); i++) {
                                Casos aux = (Casos) Casos.get(i);
                                String estado = m.getEstado(aux);
                                if (estado.equalsIgnoreCase("En proceso")) {
                                    System.out.println(aux);
                                }
                            }
                        }
                        else{
                           System.out.println("Ingrese uan opcion valida(1-Todos)(2-Resueltos)(3-Pendientes)");
                        }

                    }
                break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    op=leer.nextInt();
            }

        }

    }

    public static void imprimir(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("***************");
            System.out.println(i + "-" + lista.get(i));
        }
    }
}
