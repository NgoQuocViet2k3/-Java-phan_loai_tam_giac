import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    public void testTriangleClassifier1() {
        int[] triangle = new int[]{2, 2, 2};
        String expected = "Tam giác là tam giác đều";
        String actual = TriangleClassifier.triangleClassification(triangle);
        assertEquals(expected, actual);
    }

    @Test
    public void testTriangleClassfier2() {
        int[] triangle = new int[]{2, 2, 3};
        String expected = "Tam giác là tam giác cân";
        String actual = TriangleClassifier.triangleClassification(triangle);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangleClassfier3() {
        int[] triangle = new int[]{2, 4, 5};
        String expected = "Tam giác là tam giác thường";
        String actual = TriangleClassifier.triangleClassification(triangle);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangleClassfier4() {
        int[] triangle = new int[]{8, 2, 3};
        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.triangleClassification(triangle);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangleClassfier5() {
        int[] triangle = new int[]{-1, 2, 1};
        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.triangleClassification(triangle);
        assertEquals(expected, actual);
    }
    @Test
    public void testTriangleClassfier6() {
        int[] triangle = new int[]{0, 1, 1};
        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.triangleClassification(triangle);
        assertEquals(expected, actual);
    }
}