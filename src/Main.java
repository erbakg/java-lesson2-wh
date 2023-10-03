import java.util.Random;

public class Main {
    public static String testFun(int age, int temp) {
        if ((20 < age && age < 45) && (-20 < temp && temp < 30)) {
            return "You can go for walk";
        } else if (20 > age && (0 < temp && temp < 28)) {
            return "You can go for walk";
        } else if (45 < age && (-10 < temp && temp < 25)) {
            return "You can go for walk";
        } else {
            return "Stay at home";
        }
    }

    public static int generateRandomAge() {
        int upperbound = 100;
        Random rand = new Random();
        int randomInt = rand.nextInt(upperbound);
        System.out.println("Random age " + randomInt);
        return randomInt;
    }

    public static void main(String[] args) {
        // домашнее задание
        System.out.println(testFun(21, 15));
        System.out.println(testFun(19, 20));
        System.out.println(testFun(19, -2));
        System.out.println(testFun(50, -15));
        System.out.println(testFun(50, -5));


        // на сообразительность
        System.out.println(testFun(generateRandomAge(), -5));
    }
}