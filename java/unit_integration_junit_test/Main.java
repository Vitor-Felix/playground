public class Main {
    public static void main(String[] args) {
        // Create services
        SquareService squareService = new SquareService();
        RectangleService rectangleService = new RectangleService();
        CircleService circleService = new CircleService();
        
        // Create calculator
        CalculateArea calculator = new CalculateArea(squareService, rectangleService, circleService);
        
        // Test calculations
        System.out.println("Square (side=5): " + calculator.calculateArea(Type.SQUARE, 5.0));
        System.out.println("Rectangle (5x3): " + calculator.calculateArea(Type.RECTANGLE, 5.0, 3.0));
        System.out.println("Circle (r=2): " + calculator.calculateArea(Type.CIRCLE, 2.0));
    }
}

