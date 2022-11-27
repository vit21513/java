import java.util.Arrays;
import java.io.*;

// 2.Реализуйте алгоритм сортировки пузырьком числового массива,
//  результат после каждой итерации запишите в лог-файл.

public class task_2 {
    public static void main(String[] args) {

        int[] arr = new int[8]; // обьявляем массив размером
        for (int index = 0; index < arr.length; index++) {
            arr[index] = getRandomNumber();
        }

        for (int i = 0; i < arr.length; i++) {
            logArray(arr);
            
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

    public static void logArray(int[] array) {

        String arrayString = Arrays.toString(array);
        System.out.print(arrayString); // выводит в виде строки массив
        System.out.print("\n");

        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.append(arrayString); // дописывает в файл итеррации сортировки
            writer.append("\n");
            writer.flush();
        } catch (IOException ex) {

        }
    }
}
