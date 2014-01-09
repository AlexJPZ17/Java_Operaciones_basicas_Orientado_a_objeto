/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones.basicas.p.o.o;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class OperacionesBasicasPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos las variables
        double numero1, numero2;
        int operacion,repetir = 0;
        //Método Scanner 
        Scanner entrada = new Scanner(System.in);
        //Instrucción  do while
        do{
           //Mensajes con las siguientes opciones
           System.out.println("Que tipo de operación desea realizar");
           System.out.println("1 - Suma");
           System.out.println("2 - Resta");
           System.out.println("3 - Multiplicación");
           System.out.println("4 - División");
           //capturamos el valor de la opción
           operacion = entrada.nextInt();
           //Mostramos los menajes y capturamos los números
           System.out.println("Ingrese el primer número");
           numero1 = entrada.nextDouble();
           System.out.println("Ingrese el segundo número");
           numero2 = entrada.nextDouble();
           //instanciamos la clase Operaciones
           Operaciones op = new Operaciones();
           //switch que evalúa la variable operación
           switch(operacion){
               case 1:
                  //Mostramos el mensaje con la operación seleccionada
                   System.out.println("La suma de los números es: " + op.Suma(numero1, numero2));
                   break;
               case 2:
                  //Mostramos el mensaje con la operación seleccionada
                   System.out.println("La resta de los números es: " + op.Resta(numero1, numero2));
                   break;
               case 3:
                  //Mostramos el mensaje con la operación seleccionada
                   System.out.println("La multiplicacion de los números es: " + op.Multiplicacion(numero1, numero2));
                   break;
               case 4:
                  //Mostramos el mensaje con la operación seleccionada
                   System.out.println("La division de los números es: " + op.Division(numero1, numero2));
                   break;
               default:
                   System.out.println("La operación no existe");
                   break;
           }
           //Mensaje que pregunta si desea repetir 
           System.out.println("Desea repetir la operación coloque el valor de 1");
           repetir = entrada.nextInt();
        }while(repetir == 1);
    }
    
}
