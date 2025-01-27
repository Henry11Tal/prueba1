package MiniExamen;

public class E04HistogramaLetras {
    public static void main(String[] args) {
        String frase = "Lorem Ipsum es un texto formado por palabras en latín pero que no tiene significado literal (¿tú lo sabías? yo pensaba que era un texto con contenido hasta que me puse a investigar esto mejor). Y que se utiliza en el ámbito del diseño para maquetar textos y hacer pruebas tipográficas. Se trata de una adaptación de parte de la obra «De Finibus Bonorum et Malorum» («Sobre los fines de lo bueno y de lo malo») escrita en el 45 a.C. por Cicerón. Y que se lleva usando desde mediados del milenio pasado. El texto original es «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.» y significa «No hay nadie que ame el dolor en sí mismo, que lo busque y lo quiera tener, simplemente porque sea dolor. Desde un principio se hicieron modificaciones del texto, no se mantuvo tal cual (una lástima porque Cicerón era un orador de caerse de espaldas, ¿sabes que hizo cuatro discursos para echar a Catilina de Roma por conspirador y que lo hizo tan bien que solo con recitar el primero Catilina tuvo que huir del Senado?).";

        // El programa debe calcular cuántas veces aparece cada letra y presentarlo en consola
        // mediante un histograma. "Dibuja" el histograma en horizontal con asteriscos.
        // Queremos contar tanto las letras latinas habituales como también eñes.
        // Una vocal con tilde se contará igual que una sin tilde (á es lo mismo que a).
        // No contamos ningún otro caracter: excluímos espacios y símbolos como . , - ( ) ...

        String[] fraseArray={"lorem Ipsum es un texto formado por palabras en latín pero que no tiene significado literal (¿tú lo sabías? yo pensaba que era un texto con contenido hasta que me puse a investigar esto mejor). Y que se utiliza en el ámbito del diseño para maquetar textos y hacer pruebas tipográficas. Se trata de una adaptación de parte de la obra «De Finibus Bonorum et Malorum» («Sobre los fines de lo bueno y de lo malo») escrita en el 45 a.C. por Cicerón. Y que se lleva usando desde mediados del milenio pasado. El texto original es «Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit.» y significa «No hay nadie que ame el dolor en sí mismo, que lo busque y lo quiera tener, simplemente porque sea dolor. Desde un principio se hicieron modificaciones del texto, no se mantuvo tal cual (una lástima porque Cicerón era un orador de caerse de espaldas, ¿sabes que hizo cuatro discursos para echar a Catilina de Roma por conspirador y que lo hizo tan bien que solo con recitar el primero Catilina tuvo que huir del Senado?)."};
        String[] alfabeto = {"abcdefghijklmnopqrstuvwxyz"};

        for (int i = 0; i < fraseArray.length; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (fraseArray[i].equals(alfabeto[j])){
                    System.out.println(alfabeto[j] + "*");
                }
                else {
                    System.out.println(alfabeto[j]);
                }
            }
        }
        System.out.println("Histograma de frecuencias de letras:");
    }
}