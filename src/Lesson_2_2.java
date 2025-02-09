public class Lesson_2_2 {
    public static void main(String[] args) {
        int numberOfStudents = 10;
        int temperature = 15;
        boolean isNight = true;

        if (temperature > 10 && temperature < 35) { // Логический оператор И (AND) - &&
            System.out.println("Погода подходит для прогулки");
        }

        if (temperature < 0 && isNight)
            System.out.println("Лучше не выходит на улицу");

        if (numberOfStudents > 5 || temperature > 30) { // Логический оператор ИЛИ (OR) - ||
            System.out.println("Идем в кино");
        }

        if (numberOfStudents == 22 && temperature > 20) {
            System.out.println("Играем в футбол");
        }

        if (temperature > 15 && (temperature < 35 || numberOfStudents > 5) && numberOfStudents < 12 && isNight){
            // false && (true || true) && true && true => 0  * (1 + 1) * 1 * 1 => 0 + 1 = 0 (false)
            System.out.println("Идем на работу");
        }

        /*
        if (isNight) {
        } else {
            System.out.println("Включить музыку");
        }
         */

        if (!isNight) { // Логический оператор отрицания НЕ (NOT) - !
            System.out.println("Включить музыку");
        }

    }
}
