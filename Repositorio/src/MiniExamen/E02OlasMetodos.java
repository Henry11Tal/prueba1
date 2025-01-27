package MiniExamen;

import java.util.Scanner;

public class E02OlasMetodos {


    public static void main(String[] args) {


        // Se pide un programa que genere olas de asteriscos. Tantas como las indicadas,
        // y con la amplitud máxima indicada.
        // Es IMPRESCINDIBLE usar métodos para hacer este ejercicio.
        // Si no se usan métodos, se aspira a la mitad de la puntuación.
        int amplitudactual=0;
        int amplitudminima=0;
        int amplitudMaxima = 5;
        int numOlas = 3;
        int olas=1;

        while (olas <= numOlas) {

            while (amplitudactual < amplitudMaxima) {
                for (int i = 0; i <= amplitudactual; i++) {
                    System.out.print("*");
                }
                amplitudactual++;
                System.out.println();
            }
            while (amplitudactual >= amplitudminima) {
                for (int j = amplitudactual; j >= amplitudminima; j--) {
                    System.out.print("*");
                }
                amplitudactual--;
                System.out.println();
            }olas++;
        }
    }
}