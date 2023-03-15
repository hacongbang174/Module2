package triangle;

public class TriangleClassifier {
    public static String getTriangle(int a, int b, int c) {
        String result = "";
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                result = "Tam giác đều";
            } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                result = "Tam giác cân";
            }else {
                result = "Tam giác thường";
            }
        }else {
            result = "Không phải là tam giác";
        }
        return result;
    }
}
