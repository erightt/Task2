import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        System.out.println("Задание 4.1");
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Введите подстроку");
        String subStr = sc.nextLine();
        int subStrCount = 0;
        int index = 0;

        while ((index = str1.indexOf(subStr, index)) != -1) {
            subStrCount++;
            index += subStr.length();
        }
        System.out.println("Подстрока " + subStr + " встречается " + subStrCount + " раза");

        System.out.println("Задание 4.2");
        String str2 = sc.nextLine();
        String firstCensoredStr2 = str2.replace("бяка", "вырезано цензурой");
        String secondCensoredStr2 = firstCensoredStr2.replace("кака", "вырезано цензурой");
        System.out.println(secondCensoredStr2);

        System.out.println("Задание 4.3");
        boolean dateForm = false;
        while (!dateForm) {
            System.out.println("Введите дату в формате 'дд.мм.гггг'");
            String dateStr = sc.nextLine();

            if (dateStr.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                String[] parts = dateStr.split("\\.");
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);

                if (day >= 1 && day <= 31 && month >= 1 && month <= 12) {
                    String outputDate = String.format("%s-%02d-%02d", year, month, day);
                    System.out.printf("Вывод: %s%n", outputDate);
                    dateForm = true;
                }
                else{
                    System.out.println("Введены недоступные значения дня или месяца");
                }
            } else {
                System.out.println("Неверный формат даты. Пожалуйста, введите дату в формате 'дд.мм.гггг'.");
            }
        }
        System.out.println("Задание 4.4");
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        inputFormat.setLenient(false);

        boolean dateForm1 = false;
        while (!dateForm1) {
            System.out.println("Введите дату в формате 'дд.мм.гггг'");
            String dateStr1 = sc.nextLine();
            try {
                Date inputDate = inputFormat.parse(dateStr1);
                String outputDate = outputFormat.format(inputDate);
                System.out.println(outputDate);
                dateForm1 = true;
            }
            catch (ParseException e) {
                System.out.println("Неверный формат даты или введены недоступные значения дня или месяца. Пожалуйста, введите дату в формате 'дд.мм.гггг'.");
            }
        }
        sc.close();

    }

}
