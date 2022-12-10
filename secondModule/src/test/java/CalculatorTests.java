import org.junit.jupiter.api.*;

public class CalculatorTests {
    public static Calculator sut;

    @BeforeAll
    public static void beforeAll() {
        sut = new Calculator();
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Running Test");
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete");
    }

    @Test
    public void testSum() {
        int a = 10;
        int b = 5;
        int expectedResult = 15;

        int result = sut.sum(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 5;
        int expectedResult = 5;

        int result = sut.subtraction(a, b);

        Assertions.assertEquals(expectedResult, result);
    }
}
