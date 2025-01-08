
public class Lesson_2_3 {
    public static void main(String[] args) {
        System.out.println("Завтрак");
        makeATea();

        System.out.println("Обед");
        makeATea();

        System.out.println("Ужин");
        makeATea();

        duration();

        addition("Сумма чисел", 2, 7);
        addition("Результат сложения", 20, 3);

        calculatePerimeter(6.5f, 4.5f, "Аудитория 4");
        calculatePerimeter(4, 3.5f, "Кухня");
        calculatePerimeter(10.5f, 7, "Холл");
        int areaOfAuditory4 = calculateArea(6.5f, 4.5f);
        System.out.println("Площадь Аудитории 4: " +areaOfAuditory4 + getUnit());
        int areaOfKitchen = calculateArea(4f, 3.5f);
        System.out.println("Площадь Кухни: " +areaOfKitchen + getUnit());
        int areaOfHall = calculateArea(10.5f, 7);
        System.out.println("Площадь Зала: " +areaOfHall + getUnit());
    }

    public static String getUnit() {
        return " квадратных метров";
    }

    public static void makeATea() {
        System.out.println("Вскипятит воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настоятся");
        System.out.println("Налить в чашку");
        System.out.println("Налить молоко или сахар по вкусу");
    }

    public static void addition(String phrase, int num1, int num2) {
        // невозвращаемый метод с параметрами
        int resalt = num1 + num2;
        System.out.println(phrase + ": " + resalt);
    }

    public static int calculateArea(float length, float width) {
        int area = Math.round(length * width);
        return area;
    }

    public static void calculatePerimeter(float length, float width, String roomName) {
        float perimeter = (length + width) * 2;
        System.out.println("Периметр комнаты " + roomName + ": " + perimeter + " метров.");
    }

    public static void duration() {
        // Не возвращяемый метод без параметров
        System.out.println("Длительность 5 минут");
    }

}
