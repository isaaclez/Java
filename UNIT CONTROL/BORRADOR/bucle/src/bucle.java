
import java.util.Scanner;

public class bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        int contador = 0;
        int indice = 0;
        int[] sueldos = {indice};

        for (int i = 0; indice != -1; i++) {
            System.out.println("Ingrese numero: ");
            indice = sc.nextInt();
            contador++;
            if(indice != -1){
                sueldos = new int[]{indice};
            }

        }
        System.out.println(contador -1);
        for (int i = sueldos.length; true; i++) { // Recorremos en orden inverso
            System.out.println(sueldos[i]);
        }


*/
        int numero;
        int clave;
        int contador = 3;

        do {
            System.out.print("Escribe la clave de 6 numeros: ");
            numero = sc.nextInt();
            clave = 123456;
            contador --;
            if (numero != clave && contador > 0){
                System.out.println("Error. Vuelve a intentarlo");
                System.out.println("Te quedan: " + contador + " intentos" + "\n");
            }
        } while (numero != clave && contador != 0);

        if (numero == clave){
            System.out.print("CORRECTO!!!" + "\n");
        }else{
            System.out.print("Agotaste los intentos" + "\n");
        }
    }
}