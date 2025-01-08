import java.util.Arrays;
import java.util.Scanner;

public class construyeYdevuelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] t = {1,2,3,3,5,6,6};

        System.out.println((sinrepetidos(t)));

    }

    /* Vamos a crear una tabla con la longitud inicial de 0 a la que llamaremos
        temporal. Recorreremos la tabla "t" comprobando que sus elementos
        no se encuentran en la tabla temporal (aprovecharemos el metodo buscar() creado
        en la actividad propuesta 5.1). Si el elemento no oesta en temporal, lo insertaremos */

    static int [] sinrepetidos (int [] t){
        int[] temporal = new int [0];  // creamos con longitud 0

        for (int elemento : t){
            if (buscar(temporal, elemento) == -1) { // Si no esta: insertamos algoritmo de insercion
                // algoritmo de insercion
                temporal = Arrays.copyOf(temporal, temporal.length + 1);
                temporal [temporal.length - 1] = elemento; // añadimos al final
        }
    }
    return temporal;
}

    private static int buscar(int[] temporal, int elemento) {

    return (elemento);
    }
}