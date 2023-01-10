public class Figures {
    double area, perimeter;

    static class triangle extends Figures{
        double sideA, sideB, sideC;
        double angleAB, angleAC, angleBC;

        public triangle(double sideA, double sideB, double sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    static class rectangle extends Figures{
        double sideA, sideB;
        double diagonal;

        public rectangle(double sideA, double sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            setArea(sideA, sideB);
            setPerimeter(sideA, sideB);
            setDiagonal(sideA, sideB);
        }

        public double getSideA() {
            return sideA;
        }

        public double getSideB() {
            return sideB;
        }
        private void setArea(double sideA, double sideB) {
            this.area = sideA*sideB;
        }
        private void setPerimeter(double sideA, double sideB) {
            this.perimeter = 2 * (sideA + sideB);
        }
        private void setDiagonal(double sideA, double sideB) {
            this.diagonal = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2));
        }
        public double getArea() {
            return this.area;
        }
        public double getPerimeter() {
            return this.perimeter;
        }
        public double getDiagonal() {
            return this.diagonal;
        }
    }

    static class square extends Figures{
        double side;
        double diagonal;

        public double getSide() {
            return side;
        }

        public square(double side) {
            this.side = side;
            setArea(side);
            setPerimeter(side);
            setDiagonal(side);
        }
        private void setArea(double side) {
            this.area = Math.pow(side, 2);
        }
        private void setPerimeter(double side) {
            this.perimeter = side * 4;
        }

        private void setDiagonal(double side) {
            this.diagonal = Math.sqrt(Math.pow(side,2) * 2);
        }

        public double getArea() {
            return area;
        }
        public double getPerimeter() {
            return perimeter;
        }

        public double getDiagonal() {
            return diagonal;
        }
    }

    static class circle extends Figures{
        double radius;
        double squareInCircle;

        public circle(double radius) {
            this.radius = radius;
            setArea(radius);
            setPerimeter(radius);
            setSquareInCircle(radius);
        }

        public double getRadius() {
            return radius;
        }
        private void setArea(double radius) {
            this.area = Math.PI * Math.pow(radius,2);
        }
        private void setPerimeter(double radius) {
            this.perimeter = 2 * Math.PI * radius;
        }
        private void setSquareInCircle(double radius) {
            this.squareInCircle = (2*radius)/Math.sqrt(2);
        }
        public double getArea() {
            return area;
        }
        public double getPerimeter() {
            return perimeter;
        }
        public double getSquareInCircle() {
            return squareInCircle;
        }
    }
}
