
/*
Escribe la funcion int[] rellenarPares(int longitud, int fin), que crea y devuelve
una tabla orenada de longitud especificada, que se encuentra rellena con nunmeros pares aleatorios
comprendidos en el rango desd e2 hasta fin (inclusive)
 */

import java.util.Arrays;
import java.util.Scanner;

public class rellenaTabla {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

    }
    static int [] rellenaPares(int longitud, int fin){
        //creamos la tabla con la longitud adecuada
        int pares [] = new int[longitud];

        int i = 0; // indica con que elemento de la tabla estamos trabajando

        while (i < pares.length) { /* terminaremos de rellenar la tabla cuando el numero de pares sea igual que la longitud de la tabla */
            int num = (int) (Math.random() * fin + 1);
            if (num % 2 == 0) { // si es par
                pares[i] = num; // lo guardaremos en el elemento i
                i++; // incrementamos el indicador
            }
        }
        // ahora nos falta ordenar la tabla
        Arrays.sort(pares);
        return (pares);
    }
}
