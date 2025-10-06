import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
        System.out.println("Antes de cada teste");
    }


    @Test
    public void deveSomarDoisValores(){
        double a = 10;
        double b = 20;
        double resultado = calculadora.somar(a, b);

        Assertions.assertEquals(30, resultado);
    }
    @Test
    public void deveMultiplicarDoisValores(){
        double a = 10;
        double b = 20;
        double resultado = calculadora.multiplicar(a, b);

        Assertions.assertEquals(200, resultado);
    }
    @Test
    public void deveDividirDoisValores(){
        double a = 10;
        double b = 20;
        double resultado = calculadora.dividir(a, b);

        Assertions.assertEquals(0.5, resultado);
    }
    @Test
    public void deveSubtrairDoisValores(){
        double a = 10;
        double b = 20;
        double resultado = calculadora.subtrair(a, b);

        Assertions.assertEquals(-10, resultado);
    }

}
