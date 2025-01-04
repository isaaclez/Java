import java.util.Arrays;
import java.util.Scanner;

public class dosTablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int apuesta[] = new int[6];
        int combinacionGanadora[] = {15,20,25,30,35,40};

        for (int i = 0; i < apuesta.length; i++) {
            System.out.println("Ingrese el numeor ");
            apuesta[i] = sc.nextInt();
        }

        System.out.println(" la cantidad de aciertos fue de: " + primitiva(apuesta,combinacionGanadora));

    }
    // Devuelve el numero de coincidencias entre los elementos de las tablas
    public static int primitiva ( int apuesta[], int[] combinacionGanadora){
        int aciertos = 0; //contador de aciertos

        for (int a : apuesta) { //recorremos la tabla de apuesta
            // aprovechamos que la tabla con la conbinacion esta ordenada
            if (Arrays.binarySearch(combinacionGanadora, a) >= 0) { //si esta
                aciertos++; //hemos acertado un numero mas
            }
        }
        return (aciertos);
    }
}

