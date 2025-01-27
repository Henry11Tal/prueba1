package MiniExamen;

public class E03Sumirresta {
    public static void main(String[] args) {
        int[] numeros = {8, 3, 2, 5, 10, 2, 4, 7, 6, 3};

        // El programa debe calcular la "sumirresta" de los números del array, de la siguiente manera:
        // Los números en posiciones pares (0, 2, 4...) suman. Los de posiciones impares (1, 3, 5...) restan.
        // En el ejemplo, sería +8 -3 +2 -5 +10 -2 +4 -7 +6 -1. Con este ejemplo debe dar 12.
        int resultado=0;
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2==0){
                resultado= resultado + numeros[i];
            }
            else {
                resultado = resultado - numeros[i];
            }

        }
        System.out.format("El resultado de la sumirresta de los números del array es %d" ,resultado);
    }
}
