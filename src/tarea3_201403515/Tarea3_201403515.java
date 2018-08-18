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
                String []arreglo = new String[5];
                        
                String usuarios;
                
                for (int i=0;i<arreglo.length;i++){
                    
                     System.out.println("Ingrese los Usuarios:");
                     usuarios = lector.nextLine();
                     
                      for(int i= 0;i<arreglo.length;i++){
                          
                      }
                     
                       if (usuarios == arreglo[i]){
                           System.out.println("el usuarios ya se ingreso:");
                      
                }
                arreglo[i]=usuarios;
                }
                       for(int i=0;i<arreglo.length;i++){
                        System.out.println("los usuarios son:"+arreglo[i]);
               }
                
               
                break;
            case 3:
           
                  
                break;
            default:
                ingresarUsuario();
        }
    }

    public static void contadordigitos() {
        int opcion;
        int numero =0;
        opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------CONTADOR DE DIGITOS REPETIDOS------------------------");
        System.out.println("1.Ingresar Numero");
        System.out.println("2.Ingresar Numero a Buscar");
        System.out.println("3.Mostrar Numero de Digitos");
        System.out.println("4.Menu Principal");
        System.out.println("----------CONTADOR DE DIGITOS REPETIDOS------------------------");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                 System.out.println("1.Ingrese un Numero");
                 int cifraingresada = entrada.nextInt();
       
       String num = Integer.toString(cifraingresada);
       System.out.println("El numero: "+cifraingresada+ " posee "+ num.length()+" digitos");
                 
                 
                 
                 
                 break;
                                   
            case 4:
                menuPrincipal();
            break;

            default:
                contadordigitos();

        }

    }

    public static void tresnumeros(){
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
                 System.out.println("1.Ingrese un Numeros");
            break;
                                   
            case 4:
                menuPrincipal();
            break;

            default:
                tresnumeros();
        
         }
    }
    
    public static void promedio(){
          int opcion;
        opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("1.Ingrese su Id");
        System.out.println("2.Ingresar notas");
        System.out.println("3.Menu Principal");
        System.out.println("----------------------------------");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                 System.out.println("1.Igrese sus notas:");
                    
            break;
                                   
            case 3:
                menuPrincipal();
            break;

            default:
                promedio();
        
         }
    }
    
    
    
    
    
    
    
    

}
