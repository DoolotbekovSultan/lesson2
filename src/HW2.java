import java.util.Random;

public class HW2 {

    // Возвращаемый метод без параметров которая возвращает int
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }

    // Возвращаемый метод permission с параметрами: int age, int temperature, которая возвращает String
    public static String permission(int age, int temperature) {
        // Полная условная конструкция if
        if ((20 <= age && age <= 45) && (-20 <= temperature && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (0 <= temperature && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (-10 <= temperature && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    // Главный метод main()
    public static void main(String[] args) {
        // Пять вызовов метода permission с разными аргументами
        System.out.println("С разными аргументами:");
        System.out.println("permission(age = 21, temperature = 30): " + permission(21, 30));
        System.out.println("permission(age = 15, temperature = 10): " + permission(15, 10));
        System.out.println("permission(age = 96, temperature = 29): " + permission(96, 30));
        System.out.println("permission(age = 50, temperature = -5): " + permission(50, -5));
        System.out.println("permission(age = 16, temperature = -13): " + permission(16, -13));
        // Вызов метода permission с псевдослучайным возрастом
        int randomAge = generateRandomAge();
        System.out.println("С псевдослучайным возрастом:");
        System.out.println("permission(age = " + randomAge + ", temperature = 15: " + permission(randomAge, 15));
    }
}
