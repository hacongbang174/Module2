package triangle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TriangleClassifierTest {
    @Test
    @DisplayName("Testing add  a = 2, b = 2, c = 2")
    public void testTriangleClassifier1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add  a = 2, b = 2, c = 3")
    public void testTriangleClassifier2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add  a = 3, b = 4, c = 5")
    public void testTriangleClassifier3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add  a = 8, b = 2, c = 3")
    public void testTriangleClassifier4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add  a = -1, b = 2, c = 1")
    public void testTriangleClassifier5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add  a = 0, b = 1, c = 1")
    public void testTriangleClassifier6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expected, result);
    }

}
