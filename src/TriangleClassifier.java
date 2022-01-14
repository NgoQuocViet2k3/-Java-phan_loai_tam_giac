public class TriangleClassifier {
    public static String triangleClassification(int[] triangle) {
        if (triangle.length != 3) {
            return null;
        }
        int side1 = triangle[0];
        int side2 = triangle[1];
        int side3 = triangle[2];

        boolean dieuKienTamGiac = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
        if (dieuKienTamGiac) {
            return isTriangleClassification(side1, side2, side3);
        }
        return "Không phải là tam giác";
    }

    public static String isTriangleClassification(int side1, int side2, int side3) {
        boolean dieuKienTamGiacDeu = side1 == side2 && side2 == side3 && side1 == side3;
        boolean dieuKienTamGiacCan = side1 == side2 || side1 == side3 || side2 == side3;
        if (dieuKienTamGiacDeu) {
            return "Tam giác là tam giác đều";
        } else {
            if (dieuKienTamGiacCan) {
                return "Tam giác là tam giác cân";
            } else {
                return "Tam giác là tam giác thường";
            }
        }
    }

}
