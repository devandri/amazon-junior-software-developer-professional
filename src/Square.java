public class Square {
    static double squareSide;

    public static void setSquareSide() {
        squareSide = 5.2;
    }

    public static double calculateAreaOfSquare() {
        return squareSide * squareSide;
    }

    public static void main(String[] str) {
        setSquareSide();

        double areaOfSquare = calculateAreaOfSquare();

        System.out.println("Area of the square with side: " + squareSide + " is " + areaOfSquare);
    }
}
