
/*Crea una tabla de longitud 10 que se inicializara con numeros
aleatorios comprendidos entre 1 y 100. mostrar la suma de todos los
numeros aleatorios que se guardan en la atabla*/

public class sumaNumeros {
    public static void main (String[] args){
        int[] valores;
        valores = new int [10];

        /* vamos a correr la tabla para inicializar con valores aleatorios
        cuando se modifican los elementos de una tabla no podemos usar for-each*/

        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100 + 1);

            /* ahora recorreremos la tabla para calcular la suma de
            sus elementos */
            int suma = 0;
            for(int valor : valores){
                suma += valor;
            }
            System.out.println("La suma de los valores aleatoreos es " + suma);
        }
    }
}