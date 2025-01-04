
import java.util.Scanner;

public class ayuntamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int indice = 0;
        int contador = 0;
        int sueldos [] = new int[contador];


        do{
            System.out.println("Ingrese el sueldo: ");
            indice = sc.nextInt();
            contador ++;
        }while (indice != -1);

    }
}
