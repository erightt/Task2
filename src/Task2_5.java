
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        boolean dateForm1 = false;
        boolean dateForm2 = false;
        while (!dateForm1) {
            System.out.println("Введите дату в формате dd.MM.yyyy:");
            String inputDateStr1 = sc.nextLine();
            try {

                Date date1 = dateFormat.parse(inputDateStr1);
                dateForm1 = true;

                GregorianCalendar calendar = new GregorianCalendar();
                calendar.setTime(date1);
                calendar.add(GregorianCalendar.DAY_OF_YEAR, 45);
                Date dateAfter45Days = calendar.getTime();
                System.out.println("Дата после увеличения на 45 дней: " + dateFormat.format(dateAfter45Days));

                calendar.setTime(date1);
                calendar.set(GregorianCalendar.MONTH, GregorianCalendar.JANUARY);
                calendar.set(GregorianCalendar.DAY_OF_MONTH, 1);
                Date startOfYearDate = calendar.getTime();
                System.out.println("Дата после сдвига на начало года: " + dateFormat.format(startOfYearDate));

                calendar.setTime(date1);
                int workDaysToAdd = 10;
                while (workDaysToAdd > 0) {
                    calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
                    if (workDay(calendar)) {
                        workDaysToAdd--;
                    }
                }
                Date dateAfter10Workdays = calendar.getTime();
                System.out.println("Дата после увеличения на 10 рабочих дней: " + dateFormat.format(dateAfter10Workdays));



                while (!dateForm2) {

                    System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
                    String inputDateStr2 = sc.nextLine();
                    try {
                        Date date2 = dateFormat.parse(inputDateStr2);
                        dateForm2 = true;

                        int workDays = 0;


                        if (date1.before(date2)) {
                            calendar.setTime(date1);
                            while (calendar.getTime().before(date2)) {
                                if (workDay(calendar)) {
                                    workDays++;
                                }
                                calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
                            }
                        } else {
                            calendar.setTime(date2);
                            while (calendar.getTime().before(date1)) {
                                if (workDay(calendar)) {
                                    workDays++;
                                }
                                calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
                            }
                        }


                        System.out.println("Количество рабочих дней между введенными датами: " + workDays);
                    } catch (ParseException e) {
                        System.out.println("Неверный формат даты. Пожалуйста, введите дату в формате 'дд.мм.гггг'.");
                    }


                }

            }
            catch (ParseException e) {
                System.out.println("Неверный формат даты. Пожалуйста, введите дату в формате 'дд.мм.гггг'.");
            }
        }

        sc.close();

    }

    private static boolean workDay(GregorianCalendar calendar) {
        int dayOfWeek = calendar.get(GregorianCalendar.DAY_OF_WEEK);
        return (dayOfWeek != GregorianCalendar.SATURDAY && dayOfWeek != GregorianCalendar.SUNDAY);
    }
}