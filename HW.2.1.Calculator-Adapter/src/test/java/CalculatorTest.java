import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Ints calc;

    @BeforeAll
    public static void init() {
        System.out.println("Running tests...");
    }

    @BeforeEach
    public void startOfTest() {
        System.out.println("---------------------------------------\n[START OF THE TEST]");
        calc = new IntsCalculator();
    }

    @Test
    @DisplayName("Проверка функции суммирования")
    public void checkingSumFunction() {
        // Arrange
        int a = 3, b = -5, expected = -2;
        // Act
        int result = calc.sum(a, b);
        // Assert
        Assertions.assertEquals(result, expected);
    }

    @Test
    @DisplayName("Проверка функции умножения")
    public void checkingMultiplicationsFunction() {
        // Arrange
        int a = 3, b = -5, expected = -15;
        // Act
        int result = calc.mult(a, b);
        // Assert
        Assertions.assertEquals(result, expected);
    }

    @Test
    @DisplayName("Проверка функции возведения в степень")
    public void checkingPowFunction() {
        // Arrange
        int a = -3, b = 5, expected = -243;
        // Act
        int result = calc.pow(a, b);
        // Assert
        Assertions.assertEquals(result, expected);
    }

    @AfterEach
    public void endOfTest() {
        System.out.println("[END OF THE TEST]\n---------------------------------------");
    }
}
