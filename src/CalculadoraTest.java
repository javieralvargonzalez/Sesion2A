import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	@Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();

        assertEquals(8, calculadora.suma(3, 5));
    }

    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();

        assertEquals(-2, calculadora.resta(3, 5));
    }

    @Test
    public void testMultiplica() {
        Calculadora calculadora = new Calculadora();

        assertEquals(15, calculadora.multiplica(3, 5));
    }

    @Test
    public void testDivide() {
        Calculadora calculadora = new Calculadora();

        assertEquals(1, calculadora.divide(5, 3));
        assertEquals(-1, calculadora.divide(5, 0));
    }
}

