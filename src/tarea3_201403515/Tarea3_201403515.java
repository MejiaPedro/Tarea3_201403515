package tarea3_201403515;

import java.util.Scanner;

/**
 *
 * @author ptmej
 */
public class Tarea3_201403515 {

    public static String[] arreglo = new String[5];
    //  public static int[] arreglo = new String[6];

    public static void main(String[] args) {
        //Tarea3_201403515 t3 = new Tarea3_201403515();
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcion;
        opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("1.Usuarios");
        System.out.println("2.Contador de Digitos Repetidos");
        System.out.println("3.Tres Numero de Mayor a Menor");
        System.out.println("4.Calcular Promedio");
        System.out.println("5.Salir");
        System.out.println("----------------------------------");

        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                ingresarUsuario();
                break;
            case 2:
                contadordigitos();
                break;
            case 3:
                tresnumeros();
                break;
            case 4:
                promedio();
                break;

            case 5:
                System.exit(0);
                break;
            default:
                menuPrincipal();
        }
    }

    public static void ingresarUsuario() {
        int opcion;
        opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("1.Ingresar Usuarios");
        System.out.println("2.Mostrar Usuarios Ascendentes");
        System.out.println("3.Mostrar Usuarios Descendentes");
        System.out.println("4.Menu Principal");
        System.out.println("----------------------------------");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                Scanner lector = new Scanner(System.in);
                //arreglo = new String[5];

                String usuarios;

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Ingrese los Usuarios:");
                    usuarios = lector.nextLine();
                    arreglo[i] = usuarios;
                    if (i != 0) {
                        for (int z = 0; z < i; z++) {
                            if (arreglo[i].equals(arreglo[z])) {
                                System.out.println("\nusuario repetido: " + arreglo[z]);
                                System.out.println("Ingrese otro usuario Distinto:");
                                usuarios = lector.nextLine();
                                arreglo[i] = usuarios;

                            }
                        }
                    }

                }

                ingresarUsuario();

                break;

            case 2:
                if (arreglo[1] == "") {
                    System.out.println("sin datos ingrese un nombre");
                } else {
                    //arreglo[i] = usuarios;

                    for (int i = 4; i >= 0; i--) {
                        System.out.println("los usuarios son:" + arreglo[i]);

                    }
                }

                ingresarUsuario();

                break;

            case 3:
                if (arreglo[1] == "") {
                    System.out.println("sin datos ingrese un nombre");
                } else {

                    //arreglo[i] = usuarios;
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.println("los usuarios son:" + arreglo[i]);

                    }

                }

                ingresarUsuario();
                break;

            case 4:
                menuPrincipal();
                break;
            default:
                ingresarUsuario();
        }
    }

    public static void contadordigitos() {
        int opcion;
        // int numero = 0;
        opcion = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("----------CONTADOR DE DIGITOS REPETIDOS------------------------");
        System.out.println("1.Ingresar Numero");
        System.out.println("2.Ingresar Numero a Buscar");
        //  System.out.println("3.Mostrar Numero de Digitos");
        System.out.println("4.Menu Principal");
        System.out.println("----------CONTADOR DE DIGITOS REPETIDOS------------------------");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:

                Scanner digito = new Scanner(System.in);
                System.out.println("1.Ingrese un Numero");
                int cifraingresada = digito.nextInt();

                String num = Integer.toString(cifraingresada);
                System.out.println("El numero: " + cifraingresada + " posee " + num.length() + " digitos");

                contadordigitos();

                break;

            case 4:
                menuPrincipal();
                break;

            default:
                contadordigitos();

        }

    }

    public static void tresnumeros() {
        int opcion;
        opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("1.Ingresar Numeros");
        System.out.println("2.Mostrar ordenados");
        System.out.println("4.Menu Principal");
        System.out.println("----------------------------------");
        opcion = entrada.nextInt();
        switch (opcion) {

            case 1:
                Scanner numeros = new Scanner(System.in);

                int tresnumeros[] = new int[3];

                System.out.println("Ingrese el primer numero:");

                tresnumeros[0] = numeros.nextInt();
                System.out.println("Ingrese el segundo numero:");
                tresnumeros[1] = numeros.nextInt();

                System.out.println("Ingrese el tercer numero:");
                tresnumeros[2] = numeros.nextInt();

                System.out.println("********LOS NUMEROS ORDENADOS SON:*********");

                System.out.println("Ingrese el tercer numero:" + tresnumeros[0]);
                System.out.println("Ingrese el tercer numero:" + tresnumeros[1]);
                System.out.println("Ingrese el tercer numero:" + tresnumeros[2]);

                System.out.println("********LOS NUMEROS ORDENADOS SON:*********");

                tresnumeros();

                break;
            case 2:
                tresnumeros();
                break;

            case 4:
                menuPrincipal();
                break;

            default:
                tresnumeros();

        }
    }

    public static void promedio() {
        int opcion;
        opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("1.Ingrese su Id");

        System.out.println("3.Menu Principal");
        System.out.println("----------------------------------");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                Scanner leer = new Scanner(System.in);

                int notas[] = new int[6];
                int suma = 0;
                float promedio;

                //  System.out.println("Ingrese su ID:");
                //notas[0] = leer.nextInt();
                System.out.println("---------------NOTAS DE CURSOS----------------:");

                System.out.println("Ingrese su nota 1:");

                notas[0] = leer.nextInt();
                System.out.println("Ingrese su nota 2:");
                notas[1] = leer.nextInt();

                System.out.println("Ingrese su nota 3:");
                notas[2] = leer.nextInt();

                System.out.println("Ingrese su nota 4:");
                notas[3] = leer.nextInt();

                for (int i = 0; i < notas.length; i++) {

                    suma += notas[i];
                }

                promedio = (suma / notas.length);
                System.out.println("El promedio de las notas ingresadas son:" + promedio + notas.length);

                if (promedio >= 70) {
                    System.out.println("felicidades ud es un buen estudiante");
                } else {
                    System.out.println("Ingrese de nuevo sus datos");
                }
                promedio();
                break;

            case 3:
                menuPrincipal();
                break;

            default:
                promedio();

        }
    }

}
