public static void main(String[] args) {
    Shape[] shapes = {
            new Circle(5),
            new Triangle(4, 6),
            new Square(3)
    };

    printTotalArea(shapes);
}

public static void printTotalArea(Shape[] shapes) {
    double totalArea = 0;
    for (Shape shape : shapes) {
        totalArea += shape.getArea();
    }
    System.out.println("Total area: " + totalArea);
}