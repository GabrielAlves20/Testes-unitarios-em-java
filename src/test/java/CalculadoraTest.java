import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarDoisValores(){
        Calculadora calculadora = new Calculadora();
        double a = 10;
        double b = 20;
        double resultado = calculadora.somar(a, b);

        Assertions.assertEquals(30, resultado);
    }
    @Test
    public void deveMultiplicarDoisValores(){
        Calculadora calculadora = new Calculadora();
        double a = 10;
        double b = 20;
        double resultado = calculadora.multiplicar(a, b);

        Assertions.assertEquals(200, resultado);
    }
    @Test
    public void deveDividirDoisValores(){
        Calculadora calculadora = new Calculadora();
        double a = 10;
        double b = 20;
        double resultado = calculadora.dividir(a, b);

        Assertions.assertEquals(0.5, resultado);
    }
    @Test
    public void deveSubtrairDoisValores(){
        Calculadora calculadora = new Calculadora();
        double a = 10;
        double b = 20;
        double resultado = calculadora.subtrair(a, b);

        Assertions.assertEquals(-10, resultado);
    }

}
