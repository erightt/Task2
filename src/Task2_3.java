import java.util.Arrays;
import java.util.Random;

public class Task2_3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int num = 1;
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(15) + 1;
        }
        System.out.println("Элементы массива:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nОтсортированный массив:");
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length-1; i++) {

            if (array[i] == array[i + 1]) {
                num++;

            } else if(num>1){
                System.out.print("\n Число " + array[i] + " встречается " + num + " раза");
                num = 1;
            }

        }

        if (num>1){
            System.out.println("\n Число " + array[array.length - 1] + " встречается " + num + " раза");
        }

    }
}

