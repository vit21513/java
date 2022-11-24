
//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число N");
        int n = iScanner.nextInt();
        iScanner.close();
        int sum = 0;
        int res = 1;
        for (int index = 1; index <= n; index++) {
            sum += index;
            res *= index;
        }
        System.out.println("Сумма чисел от 1 до " + n + " составляет " + sum);
        System.out.println("Произведение чисел от 1 до " + n + " составляет " + res);
    }
}
