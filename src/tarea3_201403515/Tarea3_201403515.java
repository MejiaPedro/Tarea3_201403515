package tarea3_201403515;

import java.util.Scanner;

/**
 *
 * @author ptmej
 */
public class Tarea3_201403515 {

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
                switch (opcion) {
                   case 2:
                        System.out.println("1.Ingresar Usuarioswewqewqeqwq");
                       break;
                    case 5:
                        System.exit(0);
                       break;
                    default:
                        ingresarUsuario();
                }
                break;
            case 2:
                System.out.println("1sdsaasa.");
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
                System.out.println("Ingrese los usuarios");
            break;
            
            case 4:
                menuPrincipal();
                break;
            default:
                ingresarUsuario();
        }
    }
    
    
    
    public static void contadordigitos(){
        int opcion;
        opcion = 0;
        Scanner entrada = new Scanner(System.in);
         System.out.println("----------------------------------");
        System.out.println("1.Ingresar Numero");
        System.out.println("2.Ingresar Numero a Buscar");
        System.out.println("3.Mostrar Numero de Digitos");
        System.out.println("4.Menu Principal");
         System.out.println("----------------------------------");
        opcion = entrada.nextInt();
          switch (opcion) {
         case 1:         
          switch (opcion) {
                case 2:
                        System.out.println("1.Ingrese un Numero");
                       break;
                   
                    default:
                        contadordigitos();
                }
            break;
            
            case 4:
                menuPrincipal();
                break;
            
            default:
                contadordigitos();
        
    }

}
}
