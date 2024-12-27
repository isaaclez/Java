
/* Escriba una aplicacion que solicite al usuario cuantos numeros desea
introducir. A continuacion, introducir por teclaro esa cantidad de numeros enteros,
y por ultimo, mostrar en el orden inverso al introducido.
 */

import java.util.Scanner;

public class rellenaArreglo {
    public static void main (String[] args){

        /* Primero leeremos la cantidad de numeros a introducir. Con esta informacion
        crearemos una tabla de la longitud adecuada para albergar todos los datos que se
        introduciran por el teclado. Por ultimo, recorreremos la tabla, pero comenzando
        en el ultimo elemento y finalizando en el primero, con lo que conseguiremos
        mostrarlos en el orden inverso */

        Scanner sc = new Scanner(System.in);

        int cuantosNumeros;
        do {
            System.out.println("Cuantos nunmeros desea introducir?: ");
            cuantosNumeros = sc.nextInt();
        }while (cuantosNumeros < 2);

        int[] t = new int[cuantosNumeros]; // Tabla con la longitud adecuada

        for (int i = 0; i < t.length; i++) {
            System.out.println("Introduzca un numero: ");
            t[i] = sc.nextInt();
        }
        System.out.println("Los numeros en orden invertido son: ");
        for (int i = t.length - 1; i >= 0; i++){ // Recorremos en orden inverso
            System.out.println(t[i]);
        }
    }   // En este caos no podemos utilizar Array.toString() para mostrar la tabla

}
