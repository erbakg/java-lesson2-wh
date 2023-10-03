public class Lesson2_2 {
    public static void main(String[] args) {
        int temperature = 20;
        int numberOfStudents = 15;
        boolean isRainy = false;

        if (temperature >= 20 && temperature < 35) { // && - логический оператор И (AND)
            System.out.println("Go to the park");
        }

        if (numberOfStudents == 22 && temperature > 15) {
            System.out.println("Play Football");
        }

        if (temperature < 25 || isRainy) { // || - логический оператор ИЛИ (OR)
            System.out.println("Don't go swimming");
        }

        if (temperature > 30 || numberOfStudents > 20) {
            System.out.println("Go to picnic");
        }

        if (isRainy) {
            System.out.println("Take an umbrella");
        }

        if (!isRainy) { // ! - логический оператор отрицания НЕ (NOT)
            System.out.println("Go to walk");
        }
        // Hi Sensei
        if (numberOfStudents > 10 || temperature < 20 && isRainy) {
            // true || false && false => 1 + 0 * 0 => 1 + 0 = 1 (TRUE)
            System.out.println("Go to cinema");
        }
        if ((numberOfStudents > 10 || temperature < 20) && isRainy) {
            // (true || false) && false => (1 + 0) * 0 => 1 * 0 = 0 (FALSE)
            System.out.println("Go to Cafe");
        }
        if (!(numberOfStudents > 10 || temperature < 20) && isRainy) {
            // !(true || false) && false => !(1 + 0) * 0 => 0 * 0 = 0 (FALSE)
            System.out.println("Go home");
        }
    }
}
