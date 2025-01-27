package MiniExamen;

import java.util.Scanner;

public class E01PotenciasDe2HastaParar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int resultado=1;
        int contador=0;

        System.out.println("La primera potencia de 2 es: 0 \n");
        System.out.print("Introduzca s para continuar o n para acabar el programa: ");

        while(teclado.nextLine().equals("s")){
            for (int i = 0; i <= contador; i++) {
                resultado = resultado*2;
                contador++;
                System.out.format("La siguiente potencia de 2 es: "+ resultado + "\n");
                System.out.print("Introduzca s para continuar o n para acabar el programa: ");
                String seguir = teclado.nextLine();
                if (seguir.equals("n")) {
                    System.out.println("El resultado de 2 elevado a " + contador + " es " + resultado);
                    break;
                }
                else {
                    System.out.println("Introduzca un caracter valido");
                    System.out.print("Introduzca s para continuar o n para acabar el programa: ");
                    teclado.nextLine();
                }
            }
        }

        teclado.close();
    }
}
