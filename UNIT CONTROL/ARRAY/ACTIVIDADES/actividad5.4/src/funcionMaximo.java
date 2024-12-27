
/* Diseña la funcion; int maximo(int t[]), que devuelva el maximo valor
contenido en la tabla t
 */

public class funcionMaximo {
    public static void main (String[] args){

        int [] t  = {3, 2, 1, 4, 5};

        System.out.println("El maximo valor es: " + maximo(t));
    }
    static int maximo(int[] t){
        int max = t [0];
        // Suponemos que la tabla siempre tendra al menos un elemento

        for (int e : t){
            if (e > max) {
                max = e;
            }
        }
    return (max);
    }
}
