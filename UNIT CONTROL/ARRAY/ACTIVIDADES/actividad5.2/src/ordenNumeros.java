
/*
Diseña un proma que solicite al usuario que introduzca por teclado 5
numeros decimales. A continuacion, mostrar los numeros en el mismo orden
que se han introducido
*/

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ordenNumeros {
    public static void main (String[] args){
        /* Para guardar 5 numeros es posible utilizar cinco variables escalares,
        pero es mucho mas comodo una tabla de 5 elementos. Los numeros pueden tener
        decimales, por lo tanto, declararemos la tabla de tipo souble.
        Tendremos que recorrer la tabla para insertar los valore. */

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Para separar los decimales con un punto (no coma)
        double[] t = new double [5]; // Declaracion de la tabla con longitud 5
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un numero: ");
            t[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(t)); // Muestra t
    }
}
