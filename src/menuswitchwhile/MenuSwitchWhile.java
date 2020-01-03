/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuswitchwhile;
import java.util.Scanner;
//Importamos Scanner para leer entradas de dato
/**
 *
 * @author Walter Galdamez
 */
public class MenuSwitchWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion;
        
        //Inicio While
        //Mostrara un menu de opciones en pantalla
        //procede a leer la entrada del teclado y lo asigna a la variable opcion
        //Evaluara y ejecutara los casos del ciclo switch
        //Todo dentro de un ciclo while que mostrara el menu mientras la variable opcion sea distinta de 3
        
        do{
        System.out.println("================");
        System.out.println("======MENU======");
        System.out.println("================");
        System.out.println("1. Opcion Uno");
        System.out.println("2. Opcion Dos");
        System.out.println("3. Salir");
        System.out.println("Ingrese el numero de su seleccion: ");
        System.out.println("");
        System.out.println("===============");
        
        //Asigna el valor leido a la variable opcion
        opcion=leer.nextInt();
        
        // Inicio switch 
        switch(opcion){
            case 1:
            System.out.println("Seleccionaste la opcion 1");
            //Aqui se puede colocar un bloque de codigo a ejecutar
            break;
            case 2:
            System.out.println("Seleccionaste la opcion 2");
            //Aqui se puede colocar otro bloque de codigo a ejecutar
            break;
            case 3:
            System.out.println("Saliste del menu");
            //Muestra el mensaje de salida y el ciclo while usa la opcion para detener el ciclo
            break;
            default:
            System.out.println("Opcion invalida intente de nuevo");
            //Se ejecuta si el caso ingresado no existe en el switch
            break;
        }//Fin switch
    
        }while(opcion !=3);
        //Fin While
        
        }//Fin main    
}
