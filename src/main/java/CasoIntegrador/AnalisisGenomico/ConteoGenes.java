package CasoIntegrador.AnalisisGenomico;

public class ConteoGenes {

    public int contarGenes(String cadena, int longitud) {
        if (longitud < 0) { //Aquí busca si la longitud de la cadena es menor a 0 y si es así, retorna 0
            return 0;
        } else if (longitud + 2 < cadena.length() && cadena.charAt(longitud) == 'A' && cadena.charAt(longitud + 1) == 'T' && cadena.charAt(longitud + 2) == 'G') {
            return 1 + contarGenes(cadena, cadena.indexOf("ATG", longitud + 3)); //Aquí busca si la longitud tiene un mínimo de 3 y si los caracteres ATG están juntos y si es así, retorna 1 y busca la siguiente cadena
        } else {
            return contarGenes(cadena, longitud + 1); //Si no se cumple la condición anterior, busca la siguiente cadena
        }
    }
}
