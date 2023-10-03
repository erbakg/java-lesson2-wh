public class Lesson2_3 {
    public static void makeTea() {
        // невозвращаемый метод без входящих параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить молоко или сахар по-вкусу");
        duration();
    }

    public static void duration() {
        // невозвращаемый метод без входящих параметров
        System.out.println("15 минут");
    }

    public static void main(String[] args) { // DRY
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();

        addition(5, 6, "Java");
        addition(10, 45, "Programming is cool");
        calculatePerimeter(5.5, 6.0, "Auditory 2");
        calculatePerimeter(2.5, 3.5, "Kitchen");
        calculatePerimeter(8.5, 10.0, "Hall");

        double areaOfAuditory2 = calculateArea(5.5f, 6.0f);
        System.out.println("Area of room Auditory 2: " + areaOfAuditory2 + " square " + unit());
        double areaOfKitchen = calculateArea(2.5f, 3.5f);
        System.out.println("Area of room Kitchen: " + areaOfKitchen + " square " + unit());
        double areaOfHall = calculateArea(8.5f, 10.0f);
        System.out.println("Area of room Hall: " + areaOfHall + " square " + unit());

        System.out.println("TOTAL AREA: " + (areaOfAuditory2 + areaOfKitchen + areaOfHall) + " square " + unit());
    }

    public static String unit(){
        // возвращаемый метод без входящих параметров
        return "m.";
    }

    public static double calculateArea(float length, float width) {
        // возвращаемый метод с входящими параметрами
        double area = length * width;
        return area;
    }

    public static void calculatePerimeter(double length, double width, String roomName) {
        // невозвращаемый метод с входящими параметрами
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of room " + roomName + ": " + perimeter + " " + unit());
    }

    public static void addition(int num1, int num2, String phrase) {
        // невозвращаемый метод с входящими параметрами
        System.out.println("Результат сложения: " + (num1 + num2));
        System.out.println("Значение параметра phrase: " + phrase);
    }
}
