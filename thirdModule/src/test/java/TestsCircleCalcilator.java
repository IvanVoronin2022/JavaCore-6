import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestsCircleCalcilator {
    @BeforeEach
    public void initTest() {
        System.out.println("Running Test");
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete");
    }

    @Test
    public void testCalculateCircleArea1() {
        int radius = 0;
        double expectedArea = 0;

        double actualArea = CircleCalculator.calculateCircleArea(radius);

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testCalculateCircleArea2() {
        int radius = 2;
        double expectedArea = 12.56;

        double actualArea = CircleCalculator.calculateCircleArea(radius);

        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testCalculateCircleLength() {
        int radius = 2;
        double expectedLenght = 12.56;

        double actualLenght = CircleCalculator.calculateCircleLength(radius);

        Assertions.assertEquals(expectedLenght, actualLenght);
    }
}
