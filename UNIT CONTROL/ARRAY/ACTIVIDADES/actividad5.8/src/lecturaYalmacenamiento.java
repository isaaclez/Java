
/*
leer y almacenar n numeros enteros en una tabla, a partir de la que se construyen
otras dos tablas con los elementos con valores pares e impares de la primera,
respectivamente. Las tablas pares e impares.
 */


import java.util.Arrays;
import java.util.Scanner;

public class lecturaYalmacenamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* como las tablas con los numeros pares e impares tienen que estar ordenadas,
        lo que haremos sera ordenar los datos de entrada. Que recorremos y, segun
        sea par o impar, se insertara en la tabla correspondiente.
         */

        int[] datos; //tabla para los datos iniciales////
        // creamos las tablas par e impar, inicialmete de longitud 0 //
        int[] par = new int[0];
        int[] impar = new int [0];

        System.out.print("Escribe n: ");
        int n =  sc.nextInt(); // n es el numero de datos a leer //
        datos = new int [n]; // crearemos la tabla de longitud n //

        // leemos del taclado los primeros valores de la tabla //
        for (int i = 0; i <= datos.length; i++) {
            System.out.println("Introduzca un numero: ");
            datos[i] = sc.nextInt();
        }
        // recorremos los datos para calificarlos //
        for (int numero : datos){
            /* al entrar a la tabla con todos los datos ordenados, los elementos
            se insertaran siempre al final de la tabla par o impar */
            if(numero % 2 == 0){ // si el numero es par //
                par = Arrays.copyOf(par, par.length +1); // incremento la longitud de par //
                par [par.length -1] = numero;
            }else {
                impar = Arrays.copyOf(impar, impar.length + 1); // igual con la tabla impar //
                impar [impar.length - 1] = numero;
            }
        }
        System.out.println("Pares: " + Arrays.toString(par));
        System.out.println("Impares: " + Arrays.toString(impar));
    }
}
