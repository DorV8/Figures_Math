import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру: ");
        System.out.println("""
                1. Треугольник
                2. Прямоугольник
                3. Квадрат
                4. Круг
                """);
        byte choose = scanner.nextByte();
        switch (choose) {
            case (1) -> {
                double[] input = new double[3];
                for (byte i = 0; i < input.length; i++) {
                    System.out.println("Введите " + (i + 1) + "-ю сторону: ");
                    input[i] = Math.abs(scanner.nextDouble());
                }
                while (!((input[0]+input[1]>input[2]) || (input[0]+input[2]>input[1]) || (input[1]+input[2]>input[1]))) {
                    System.out.println("Треугольник не существует, повторите ввод");
                    for (byte i = 0; i < input.length; i++) {
                        System.out.println("Введите " + (i + 1) + "-ю сторону: ");
                        input[i] = Math.abs(scanner.nextDouble());
                    }
                }
                Figures.triangle result = new Figures.triangle(input[0], input[1], input[2]);
                System.out.println("Какое действие вы хотите произвести: ");
                System.out.println("""
                        1. Площадь треугольника
                        2. Периметр треугольника
                        """);
                byte variant = scanner.nextByte();
                switch (variant) {
                    case (1) -> System.out.println("Площадь треугольника со сторонами " + result.getSideA() + ", " + result.getSideB() + " и " + result.getSideC() + " равна " + result.getArea());
                    case (2) -> System.out.println("Периметр треугольника со сторонами " + result.getSideA() + ", " + result.getSideB() + " и " + result.getSideC() + " равен " + result.getPerimeter());
                }
            }
            case (2) -> {
                double[] input = new double[2];
                System.out.println("Введите длину: ");
                input[0] = Math.abs(scanner.nextDouble());
                System.out.println("Введите ширину: ");
                input[1] = Math.abs(scanner.nextDouble());
                Figures.rectangle result = new Figures.rectangle(input[0], input[1]);
                System.out.println("Выберите действие: ");
                System.out.println("""
                        1. Периметр прямоугольника
                        2. Площадь прямоугольника
                        3. Диагональ прямоугольника
                        """);
                byte variant = scanner.nextByte();
                switch (variant) {
                    case (1) -> System.out.println("Периметр прямоугольника со сторонами " + result.getSideA() + " и " + result.getSideB() + " равен " + result.getPerimeter());
                    case (2) -> System.out.println("Площадь прямоугольника со сторонами " + result.getSideA() + " и " + result.getSideB() + " равна " + result.getArea());
                    case (3) -> System.out.println("Диагональ прямоугольника со сторонами " + result.getSideA() + " и " + result.getSideB() + " равна " + result.getDiagonal());
                }
            }
            case (3) -> {
                System.out.println("Введите сторону квадрата: ");
                double input = scanner.nextDouble();
                Figures.square result = new Figures.square(input);
                System.out.println("Выберите действие: ");
                System.out.println("""
                        1. Периметр квадрата
                        2. Площадь квадрата
                        3. Диагональ квадрата
                        """);
                byte variant = scanner.nextByte();
                switch (variant) {
                    case (1) -> System.out.println("Периметр квадрата со стороной " + result.getSide() + " равен " + result.getPerimeter());
                    case (2) -> System.out.println("Площадь квадрата со стороной " + result.getSide() + " равна " + result.getArea());
                    case (3) -> System.out.println("Диагональ квадрата со стороной " + result.getSide() + " равна " + result.getDiagonal());
                }
            }
            case (4) -> {
                System.out.println("Введите радиус: ");
                double input = scanner.nextDouble();
                Figures.circle result = new Figures.circle(input);
                System.out.println("Выберите действие: ");
                System.out.println("""
                        1. Площадь круга
                        2. Периметр круга
                        3. Сторона квадрата, вписанного в окружность
                        """);
                byte variant = scanner.nextByte();
                switch (variant) {
                    case (1) -> System.out.println("Площадь круга с радиусом " + result.getRadius() + " равна " + result.getArea());
                    case (2) -> System.out.println("Периметр круга с радиусом " + result.getRadius() + " равна " + result.getPerimeter());
                    case (3) -> System.out.println("Квадрат, вписанный в окружность с радиусом " + result.getRadius() + ", равен " + result.getSquareInCircle());
                }
            }
        }
    }
}