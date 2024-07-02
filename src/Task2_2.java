import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double resultDb = 0;
        boolean hasMultFive = false;
        System.out.println("Числа кратные 5:");

        if (a % 5 == 0) {
            System.out.print("a = " + a + ", ");
            hasMultFive = true;
        }

        if (b % 5 == 0) {
            System.out.print("b = " + b + ", ");
            hasMultFive = true;
        }

        if (c % 5 == 0) {
            System.out.println("c = " + c);
            hasMultFive = true;
        }

        if(!hasMultFive){
            System.out.println("Нет значений кратных 5");
        }
        System.out.print("Результат целочисленного деления a на b: ");
        int resultInt = a / b;
        System.out.println(resultInt);

        System.out.print("Результат деления a на b: ");
        resultDb = (double)a / b;
        System.out.println(resultDb);

        System.out.print("Результат деления a на b с округлением в большую сторону: ");
        resultDb = (double)a / b;
        resultDb = Math.ceil(resultDb);
        System.out.println(resultDb);

        System.out.print("Результат деления a на b с округлением в меньшую сторону: ");
        resultDb = (double)a / b;
        resultDb = Math.floor(resultDb);
        System.out.println(resultDb);

        System.out.print("Результат деления a на b с математическим округлением: ");
        resultDb = (double)a / b;
        resultDb = Math.round(resultDb);
        System.out.println(resultDb);

        System.out.print("Остаток от деления b на с: ");
        resultDb = b % c;
        System.out.println(resultDb);

        System.out.print("Наименьшее значение из a и b: ");
        int min = Math.min(a, b);
        System.out.println(min);

        System.out.print("Наибольшее значение из b и c: ");
        int max = Math.max(b, c);
        System.out.println(max);
        sc.close();
    }
}
