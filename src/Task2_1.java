import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        System.out.print("Введите своё имя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name);
        sc.close();
    }
}
