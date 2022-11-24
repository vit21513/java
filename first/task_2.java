
//  // 2. Вывести все простые числа от 1 до 1000 

public class task_2 {

    public static void main(String[] args) {
        for (int index = 2; index < 1000; index++) {
            if (checkSimpleNumber(index) == true) {
                System.out.println(index);
            }
        }
    }

    public static Boolean checkSimpleNumber(int num) {   //функция определяет тип числа 

        for (int index = 2; index <= num / 2; index++) {
            if (num % index == 0) {
                return false;
            }
        }
        return true;
    }

}
