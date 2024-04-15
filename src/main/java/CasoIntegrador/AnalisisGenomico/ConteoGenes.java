package CasoIntegrador.AnalisisGenomico;

public class ConteoGenes {

    public int contarGenes(String cadena, int longitud) {
        if (longitud < 0) {
            return 0;
        } else if (longitud + 2 < cadena.length() && cadena.charAt(longitud) == 'A' && cadena.charAt(longitud + 1) == 'T' && cadena.charAt(longitud + 2) == 'G') {
            return 1 + contarGenes(cadena, cadena.indexOf("ATG", longitud + 3));
        } else {
            return contarGenes(cadena, longitud + 1);
        }
    }
}
