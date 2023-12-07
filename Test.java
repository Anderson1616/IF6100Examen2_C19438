import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestOperacionAritmetica {

    @Test
    public void testSuma() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        int resultado = context.procesar(5, 10);
        assertEquals(15, resultado);
    }

    @Test
    public void testResta() {
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        int resultado = context.procesar(20, 4);
        assertEquals(16, resultado);
    }

    @Test
    public void testMultiplicacion() {
        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
        int resultado = context.procesar(5, 4);
        assertEquals(20, resultado);
    }

    @Test
    public void testDivision() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        int resultado = context.procesar(8, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void testValorNegativo() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        int resultado = context.procesar(-5, 10);
        assertEquals(-1, resultado);
    }

    @Test
    public void testRestaInvalida() {
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        int resultado = context.procesar(20, 21);
        assertEquals(-2, resultado);
    }

    @Test
    public void testDivisionEntreCero() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        int resultado = context.procesar(5, 0);
        assertEquals(-3, resultado);
    }
}
