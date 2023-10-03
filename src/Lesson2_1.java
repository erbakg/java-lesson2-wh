public class Lesson2_1 {
    public static void main(String[] args) {
        int number = 5;

        switch (number) {
            case 1:
                System.out.println("Число равно одному");
                break;
            case 2:
                System.out.println("Число равно двум");
                break;
            case 3:
                System.out.println("Число равно трем");
                break;
            default:
                System.out.println("Число неизвестно");
                break;
        }
    }
}
