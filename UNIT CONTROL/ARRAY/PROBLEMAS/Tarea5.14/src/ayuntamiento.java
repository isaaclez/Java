import java.util.Arrays;
import java.util.Scanner;

public class ayuntamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sueldos = new int[0]; // inicializamos el array en "0" //
        int sueldo;

        do {
            System.out.println("Ingrese el sueldo, ingrese -1 para terminar: ");
            sueldo = sc.nextInt();
            if (sueldo != -1) { // para evitar que tome el -1 usamos una condicion //
                sueldos = rellenaSueldos(sueldos, sueldo);
            }
        } while (sueldo != -1);

        Arrays.sort(sueldos); // ordenamos la tabla //
        System.out.println("Sueldos en orden decreciente:");
        for (int i = sueldos.length - 1; i >= 0; i--) { // invierte la tabla ya ordenada //
            System.out.println(sueldos[i]);
        }

        // al tener la tabla ordenada de manera descendente podemos deducir //
        int maximo = sueldos[sueldos.length - 1]; // ultimo elemento es menor //
        int minimo = sueldos[0]; // primer elemento es el mayor //
        double media = media(sueldos);

        System.out.println("Sueldo máximo: " + maximo);
        System.out.println("Sueldo mínimo: " + minimo);
        System.out.println("Media de los sueldos: " + media);
    }

    public static int[] rellenaSueldos(int[] t, int n) { // Funcion que agrega y re dimenciona el array //
        int[] nuevoArray = new int[t.length + 1];
        for (int i = 0; i < t.length; i++) {
            nuevoArray[i] = t[i];
        }
        nuevoArray[t.length] = n;
        return nuevoArray;
    }

    public static double media(int[] array) { // calculamos la media del array //
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }

/* funciones si la tabla no esta ordenada

    public static int maximo(int t []) {
        int maximo = t[0];
        for (int e : t) {
            if (e > maximo) {
                maximo = e;
            }
        }
        return maximo;
    }

    public static int minimo(int t []) {
        int minimo = t[0];
        for (int e : t) {
            if (e < minimo) {
                minimo = e;
            }
        }
        return minimo;
    }
 */

}

