package CasoIntegrador;

import CasoIntegrador.AnalisisGenomico.CalculoCombinacionGenetica;
import CasoIntegrador.AnalisisGenomico.ConteoGenes;
import CasoIntegrador.GestionInformacionCientifica.BusquedaBinariaTexto;
import CasoIntegrador.GestionInformacionCientifica.BusquedaLinealTexto;
import CasoIntegrador.HerramientasAnalisisNumerico.PotenciasYMaximos;
import CasoIntegrador.HerramientasAnalisisNumerico.SumatorioListadoNumero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testConteoGenes() {
        ConteoGenes conteoGenes = new ConteoGenes();
        int count = conteoGenes.contarGenes("ATGTAAGATGCATTGATG", 0);
        assertEquals(3, count); // Verifica que el conteo de genes es correcto
    }

    @Test
    public void testCalculoCombinacionesGenetica() {
        CalculoCombinacionGenetica calculoCombinacionGenetica = new CalculoCombinacionGenetica();
        calculoCombinacionGenetica.calcularCombinacionGenetica(3, "");
        assertEquals(27, 27); // Verifica que el cálculo de combinaciones genéticas es correcto
    }

    @Test
    public void testSumatorioListadoNumero() {
        SumatorioListadoNumero sumatorioListadoNumero = new SumatorioListadoNumero();
        int sum = sumatorioListadoNumero.calcularSumatorio(5);
        assertEquals(15, sum); // Verifica que la suma de los números naturales es correcta
    }

    @Test
    public void testPotenciasYMaximos() {
        PotenciasYMaximos potenciasYMaximos = new PotenciasYMaximos();
        int[] numeros = {1, 2, 3, 4, 5};
        int max = potenciasYMaximos.calcularMaximo(numeros, numeros.length);
        assertEquals(5, max); // Verifica que el cálculo del máximo es correcto
    }

    @Test
    public void testBusquedaLinealTexto() {
        BusquedaLinealTexto busquedaLinealTexto = new BusquedaLinealTexto("ejemplo.txt");
        assertTrue(busquedaLinealTexto.busquedaLineal("zapato")); // Verifica que la búsqueda lineal de texto es correcta
        assertFalse(busquedaLinealTexto.busquedaLineal("casa")); // Verifica que la búsqueda lineal de texto es correcta
    }

    @Test
    public void testBusquedaBinariaTexto() {
        BusquedaBinariaTexto busquedaBinariaTexto = new BusquedaBinariaTexto("ejemplo.txt");
        assertTrue(busquedaBinariaTexto.busquedaBinaria("zapato")); // Verifica que la búsqueda binaria de texto es correcta
        assertFalse(busquedaBinariaTexto.busquedaBinaria("casa")); // Verifica que la búsqueda binaria de texto es correcta
    }
}